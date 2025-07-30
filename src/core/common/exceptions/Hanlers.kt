package com.elemsocial.core.common.exceptions

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import java.io.PrintWriter
import java.io.StringWriter
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

@RequiresApi(Build.VERSION_CODES.O)
class Handlers private constructor(
    private val applicationContext: Context,
    private val firebaseAnalytics: FirebaseAnalytics,
    private val firebaseCrashlytics: FirebaseCrashlytics,
    private val encryptionKey: ByteArray
) {
    private val errorCounter = AtomicInteger(0)
    private val lastErrors = ConcurrentHashMap<String, Pair<Long, Throwable>>()
    private val gson = Gson()
    private val dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        .withZone(ZoneId.systemDefault())

    companion object {
        @Volatile
        private var instance: Handlers? = null

        fun initialize(
            context: Context,
            firebaseAnalytics: FirebaseAnalytics,
            firebaseCrashlytics: FirebaseCrashlytics,
            encryptionKey: ByteArray
        ) {
            instance = Handlers(context.applicationContext, firebaseAnalytics, firebaseCrashlytics, encryptionKey)
        }

        fun getInstance(): Handlers {
            return instance ?: throw IllegalStateException("Handlers not initialized")
        }
    }

    fun handleCritical(
        throwable: Throwable,
        additionalData: Map<String, Any> = emptyMap(),
        isUserFacing: Boolean = false,
        component: String = "UNKNOWN"
    ) {
        val errorId = "ERR-${System.currentTimeMillis()}-${errorCounter.incrementAndGet()}"
        val timestamp = System.currentTimeMillis()
        
        lastErrors[errorId] = Pair(timestamp, throwable)
        
        val stackTrace = getStackTraceString(throwable)
        val encryptedStackTrace = encryptStackTrace(stackTrace)
        
        val errorDetails = mapOf(
            "error_id" to errorId,
            "timestamp" to timestamp,
            "component" to component,
            "is_user_facing" to isUserFacing,
            "device_info" to getDeviceInfo(),
            "stack_trace" to encryptedStackTrace,
            "additional_data" to try { gson.toJson(additionalData) } catch (e: JsonSyntaxException) { "invalid_json" }
        )

        firebaseCrashlytics.setCustomKey("error_id", errorId)
        firebaseCrashlytics.setCustomKey("component", component)
        firebaseCrashlytics.setCustomKey("timestamp", timestamp)
        firebaseCrashlytics.setCustomKey("is_user_facing", isUserFacing)
        
        additionalData.forEach { (key, value) ->
            firebaseCrashlytics.setCustomKey(key, value.toString())
        }

        firebaseCrashlytics.recordException(throwable)
        
        firebaseAnalytics.logEvent("critical_error", Bundle().apply {
            putString("error_id", errorId)
            putString("component", component)
            putLong("timestamp", timestamp)
            putBoolean("is_user_facing", isUserFacing)
        })

        if (isUserFacing) {
            showUserFriendlyError(throwable, errorId)
        }
    }

    private fun getDeviceInfo(): Map<String, String> {
        return mapOf(
            "manufacturer" to Build.MANUFACTURER,
            "model" to Build.MODEL,
            "sdk" to Build.VERSION.SDK_INT.toString(),
            "version_release" to Build.VERSION.RELEASE,
            "fingerprint" to Build.FINGERPRINT
        )
    }

    private fun getStackTraceString(throwable: Throwable): String {
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        throwable.printStackTrace(pw)
        return sw.toString()
    }

    private fun encryptStackTrace(stackTrace: String): String {
        return try {
            val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
            val keySpec = SecretKeySpec(encryptionKey, "AES")
            val iv = ByteArray(16)
            System.arraycopy(encryptionKey, 0, iv, 0, 16)
            val ivSpec = IvParameterSpec(iv)
            
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec)
            val encrypted = cipher.doFinal(stackTrace.toByteArray())
            Base64.getEncoder().encodeToString(encrypted)
        } catch (e: Exception) {
            "ENCRYPTION_FAILED: ${e.message}"
        }
    }

    private fun showUserFriendlyError(throwable: Throwable, errorId: String) {
        // Реализация показа пользователю понятного сообщения об ошибке
        // с возможностью отправить отчет
    }
}