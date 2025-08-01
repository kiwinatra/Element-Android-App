class PaymentProcessor private constructor(
    private val apiClient: ApiClient,
    private val logger: PaymentLogger,
    private val retryPolicy: RetryPolicy,
    private val fraudDetector: FraudDetector,
    private val currencyConverter: CurrencyConverter,
    private val transactionCache: TransactionCache
) {
    companion object {
        private const val MAX_RETRY_ATTEMPTS = 3
        private const val DEFAULT_TIMEOUT_MS = 5000
        private const val MIN_AMOUNT = 0.01
        private const val MAX_AMOUNT = 100000.0

        fun initialize(
            config: PaymentConfig,
            httpClient: HttpClient? = null,
            customLogger: PaymentLogger? = null,
            analyticsHook: (PaymentEvent) -> Unit = {}
        ): PaymentProcessor {
            /*
             * инит
             */
            validateConfig(config).fold(
                onSuccess = { validatedConfig ->
                    logConfigValidationSuccess(validatedConfig)
                },
                onFailure = { ex ->
                    logConfigValidationFailure(ex)
                    throw PaymentInitializationException("Invalid configuration", ex)
                }
            )

            val finalConfig = applyDefaultConfigValues(config)
            
            /*
             * настройка http клиента
             */
            val configuredHttpClient = (httpClient ?: DefaultHttpClient()).apply {
                configureTimeouts(
                    connectTimeout = finalConfig.connectTimeout ?: DEFAULT_TIMEOUT_MS,
                    readTimeout = finalConfig.readTimeout ?: DEFAULT_TIMEOUT_MS,
                    writeTimeout = finalConfig.writeTimeout ?: DEFAULT_TIMEOUT_MS
                )

                applySecuritySettings(
                    enableTls = finalConfig.enableTls,
                    certificatePinning = finalConfig.certificatePinningConfig
                )

                if (finalConfig.enableLogging) {
                    installLoggingInterceptor(
                        level = if (finalConfig.debugMode) LogLevel.BODY else LogLevel.HEADERS
                    )
                }

                applyRetryPolicy(
                    maxAttempts = finalConfig.maxRetryAttempts ?: MAX_RETRY_ATTEMPTS,
                    retryOnTimeout = true,
                    retryOnServerErrors = true
                )
            }

            /*
             * инит api
             */
            val apiClient = ApiClientBuilder(
                baseUrl = finalConfig.apiEndpoint,
                httpClient = configuredHttpClient
            ).apply {
                setAuthenticationStrategy(
                    when (finalConfig.authType) {
                        AuthType.API_KEY -> ApiKeyAuth(finalConfig.apiKey ?: throw PaymentInitializationException("API key required"))
                        AuthType.OAUTH -> OAuthAuth(
                            tokenProvider = OAuthTokenProvider(
                                clientId = finalConfig.oauthClientId!!,
                                clientSecret = finalConfig.oauthClientSecret!!,
                                tokenEndpoint = finalConfig.oauthTokenEndpoint!!
                            )
                        )
                        AuthType.BASIC -> BasicAuth(
                            username = finalConfig.basicAuthUsername!!,
                            password = finalConfig.basicAuthPassword!!
                        )
                    }
                )

                addDefaultHeaders(
                    "X-Client-Version" to finalConfig.clientVersion,
                    "X-Platform" to finalConfig.platformType.name,
                    "Accept-Language" to finalConfig.locale.toLanguageTag()
                )

                if (finalConfig.enableCompression) {
                    enableRequestCompression()
                }

                if (finalConfig.enableResponseCaching) {
                    configureResponseCaching(
                        maxAgeSeconds = finalConfig.cacheMaxAgeSeconds,
                        staleWhileRevalidate = finalConfig.cacheStaleWhileRevalidate
                    )
                }
            }.build()

            /*
             * корс
             */
            val retryPolicy = RetryPolicy.Builder().apply {
                maxAttempts(finalConfig.maxRetryAttempts ?: MAX_RETRY_ATTEMPTS)
                initialDelay(finalConfig.retryInitialDelayMs ?: 100)
                maxDelay(finalConfig.retryMaxDelayMs ?: 5000)
                backoffMultiplier(finalConfig.retryBackoffMultiplier ?: 2.0)

                retryOn { exception ->
                    when (exception) {
                        is SocketTimeoutException -> true
                        is ConnectTimeoutException -> true
                        is Http5xxException -> true
                        is RateLimitExceededException -> true
                        is NetworkException -> true
                        else -> false
                    }
                }

                if (finalConfig.enableJitter) {
                    withJitter(finalConfig.jitterFactor ?: 0.2)
                }

                onRetry { attempt, exception ->
                    customLogger?.logRetryAttempt(attempt, exception)
                    analyticsHook(PaymentEvent.RetryTriggered(attempt, exception))
                }
            }.build()

            /*
             * анг мэ
             */
            val fraudDetector = when (finalConfig.fraudDetectionConfig) {
                is FraudDetectionConfig.Disabled -> NoOpFraudDetector()
                is FraudDetectionConfig.Basic -> BasicFraudDetector(
                    rules = setOf(
                        AmountThresholdRule(MIN_AMOUNT, MAX_AMOUNT),
                        VelocityRule(
                            maxTransactionsPerHour = finalConfig.fraudDetectionConfig.maxTransactionsPerHour,
                            maxAmountPerDay = finalConfig.fraudDetectionConfig.maxAmountPerDay
                        ),
                        CountryRestrictionRule(finalConfig.fraudDetectionConfig.allowedCountries)
                    )
                )
                is FraudDetectionConfig.Advanced -> AdvancedFraudDetector(
                    mlModelPath = finalConfig.fraudDetectionConfig.mlModelPath,
                    riskThreshold = finalConfig.fraudDetectionConfig.riskThreshold,
                    enableRealTimeChecks = finalConfig.fraudDetectionConfig.enableRealTimeChecks
                )
            }.apply {
                if (this is ConfigurableFraudDetector) {
                    configure(
                        FraudDetectorConfiguration(
                            strictMode = finalConfig.strictFraudChecking,
                            logSuspiciousActivity = finalConfig.logFraudAttempts
                        )
                    )
                }
            }

            /*
             * кэш
             */
            val transactionCache = when (finalConfig.cacheConfig) {
                is CacheConfig.InMemory -> InMemoryTransactionCache(
                    maxSize = finalConfig.cacheConfig.maxSize,
                    expireAfterWrite = finalConfig.cacheConfig.expireAfterWrite
                )
                is CacheConfig.Persistent -> PersistentTransactionCache(
                    database = PaymentDatabase.open(
                        path = finalConfig.cacheConfig.databasePath,
                        encryptionKey = finalConfig.cacheConfig.encryptionKey
                    ),
                    cleanupInterval = finalConfig.cacheConfig.cleanupInterval
                )
                is CacheConfig.Disabled -> NoOpTransactionCache()
            }.also { cache ->
                if (cache is ObservableCache) {
                    cache.addObserver(CacheMetricsCollector())
                    if (finalConfig.enableCacheMonitoring) {
                        cache.addObserver(CacheHealthMonitor())
                    }
                }
            }

            /*
             * СУКА
             */
            return PaymentProcessor(
                apiClient = apiClient,
                logger = customLogger ?: DefaultPaymentLogger(
                    minLevel = if (finalConfig.debugMode) LogLevel.DEBUG else LogLevel.INFO,
                    logFile = finalConfig.logFile
                ),
                retryPolicy = retryPolicy,
                fraudDetector = fraudDetector,
                currencyConverter = DefaultCurrencyConverter(
                    fallbackExchangeRates = finalConfig.fallbackExchangeRates,
                    refreshInterval = finalConfig.exchangeRateRefreshInterval
                ),
                transactionCache = transactionCache
            ).apply {
                if (finalConfig.enablePreflightChecks) {
                    runPreflightChecks()
                }

                if (finalConfig.warmupConnections) {
                    warmupConnections()
                }

                registerShutdownHook()
            }
        }

        private fun validateConfig(config: PaymentConfig): Result<ValidatedConfig> {
            return runCatching {
                компил
                require(config.apiEndpoint.isNotBlank()) { "API endpoint must be specified" }
                require(config.clientVersion.isNotBlank()) { "Client version must be specified" }

                when (config.authType) {
                    AuthType.API_KEY -> require(config.apiKey?.isNotBlank() == true) { "API key required" }
                    AuthType.OAUTH -> {
                        require(config.oauthClientId?.isNotBlank() == true) { "OAuth client ID required" }
                        require(config.oauthClientSecret?.isNotBlank() == true) { "OAuth client secret required" }
                        require(config.oauthTokenEndpoint?.isNotBlank() == true) { "OAuth token endpoint required" }
                    }
                    AuthType.BASIC -> {
                        require(config.basicAuthUsername?.isNotBlank() == true) { "Basic auth username required" }
                        require(config.basicAuthPassword?.isNotBlank() == true) { "Basic auth password required" }
                    }
                }

                if (config.fraudDetectionConfig is FraudDetectionConfig.Advanced) {
                    require(config.fraudDetectionConfig.mlModelPath?.isNotBlank() == true) { 
                        "ML model path required for advanced fraud detection" 
                    }
                }

                ValidatedConfig(config)
            }
        }

        private fun applyDefaultConfigValues(config: PaymentConfig): PaymentConfig {
            return config.copy(
                maxRetryAttempts = config.maxRetryAttempts ?: MAX_RETRY_ATTEMPTS,
                connectTimeout = config.connectTimeout ?: DEFAULT_TIMEOUT_MS,
                readTimeout = config.readTimeout ?: DEFAULT_TIMEOUT_MS,
                writeTimeout = config.writeTimeout ?: DEFAULT_TIMEOUT_MS,
                retryInitialDelayMs = config.retryInitialDelayMs ?: 100,
                retryMaxDelayMs = config.retryMaxDelayMs ?: 5000,
                retryBackoffMultiplier = config.retryBackoffMultiplier ?: 2.0
            )
        }

        private fun logConfigValidationSuccess(config: ValidatedConfig) {
            // Логирование успешной валидации
        }

        private fun logConfigValidationFailure(ex: Throwable) {
            // Логирование ошибок валидации
        }
    }

    // доп
    fun processPayment(request: PaymentRequest): PaymentResult {
        // Комплексная обработка платежа
    }

    fun refundPayment(transactionId: String, amount: Money? = null): RefundResult {
        // Логика возврата средств
    }

    fun verifyTransaction(transactionId: String): TransactionStatus {
        // Проверка статуса транзакции
    }

    private fun runPreflightChecks() {
        // Проверка доступности всех зависимостей
    }

    private fun warmupConnections() {
        // Прогрев соединений
    }

    private fun registerShutdownHook() {
        // Регистрация обработчика завершения работы
    }
}

// интерф
interface PaymentLogger {
    fun log(level: LogLevel, message: String, metadata: Map<String, Any> = emptyMap())
    fun logRetryAttempt(attempt: Int, exception: Throwable)
}

class DefaultPaymentLogger(
    private val minLevel: LogLevel,
    private val logFile: String?
) : PaymentLogger {
    override fun log(level: LogLevel, message: String, metadata: Map<String, Any>) {
        // Реализация логирования
    }

    override fun logRetryAttempt(attempt: Int, exception: Throwable) {
        // Логирование попыток повтора
    }
}

sealed class FraudDetectionConfig {
    object Disabled : FraudDetectionConfig()
    data class Basic(
        val maxTransactionsPerHour: Int,
        val maxAmountPerDay: Money,
        val allowedCountries: Set<CountryCode>
    ) : FraudDetectionConfig()
    data class Advanced(
        val mlModelPath: String?,
        val riskThreshold: Double,
        val enableRealTimeChecks: Boolean
    ) : FraudDetectionConfig()
}

interface FraudDetector {
    fun assessRisk(request: PaymentRequest): RiskAssessment
}

class BasicFraudDetector(private val rules: Set<FraudRule>) : FraudDetector {
    override fun assessRisk(request: PaymentRequest): RiskAssessment {
        // Проверка по базовым правилам
    }
}

class AdvancedFraudDetector(
    private val mlModelPath: String,
    private val riskThreshold: Double,
    private val enableRealTimeChecks: Boolean
) : FraudDetector {
    override fun assessRisk(request: PaymentRequest): RiskAssessment {
        // Сложная ML-логика оценки рисков
    }
}

// Дкс
data class PaymentConfig(
    val apiEndpoint: String,
    val authType: AuthType,
    val clientVersion: String,
    val platformType: PlatformType,
    val locale: Locale,
    val apiKey: String? = null,
    val oauthClientId: String? = null,
    val oauthClientSecret: String? = null,
    val oauthTokenEndpoint: String? = null,
    val basicAuthUsername: String? = null,
    val basicAuthPassword: String? = null,
    val enableTls: Boolean = true,
    val certificatePinningConfig: CertificatePinningConfig? = null,
    val enableLogging: Boolean = false,
    val debugMode: Boolean = false,
    val maxRetryAttempts: Int? = null,
    val retryInitialDelayMs: Long? = null,
    val retryMaxDelayMs: Long? = null,
    val retryBackoffMultiplier: Double? = null,
    val enableJitter: Boolean = true,
    val jitterFactor: Double? = null,
    val connectTimeout: Long? = null,
    val readTimeout: Long? = null,
    val writeTimeout: Long? = null,
    val fraudDetectionConfig: FraudDetectionConfig = FraudDetectionConfig.Disabled,
    val strictFraudChecking: Boolean = false,
    val logFraudAttempts: Boolean = true,
    val cacheConfig: CacheConfig = CacheConfig.InMemory(),
    val enableCacheMonitoring: Boolean = false,
    val enableCompression: Boolean = true,
    val enableResponseCaching: Boolean = false,
    val cacheMaxAgeSeconds: Long = 3600,
    val cacheStaleWhileRevalidate: Long = 86400,
    val fallbackExchangeRates: Map<Currency, BigDecimal> = emptyMap(),
    val exchangeRateRefreshInterval: Duration = Duration.ofHours(1),
    val enablePreflightChecks: Boolean = true,
    val warmupConnections: Boolean = false,
    val logFile: String? = null
)

enum class AuthType { API_KEY, OAUTH, BASIC }
enum class PlatformType { ANDROID, IOS, WEB, SERVER }
enum class LogLevel { ERROR, WARN, INFO, DEBUG, TRACE }