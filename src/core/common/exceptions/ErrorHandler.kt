package com.elemsocial.core.common.exceptions

import android.content.Context
import android.util.Log
import androidx.annotation.StringRes
import com.elemsocial.core.BuildConfig
import com.elemsocial.core.R
import com.google.firebase.crashlytics.FirebaseCrashlytics
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.withContext
import org.json.JSONException
import retrofit2.HttpException
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.CancellationException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ErrorHandler @Inject constructor(
    private val context: Context,
    private val crashlytics: FirebaseCrashlytics,
    private val appExceptions: AppExceptions
) {
    private val TAG = "ErrorHandler"
    
    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        handleError(throwable)
    }

    suspend fun <T> executeWithErrorHandling(
        operation: String = "unknown_operation",
        showUserMessage: Boolean = false,
        block: suspend () -> T
    ): Result<T> = withContext(Dispatchers.IO + SupervisorJob() + coroutineExceptionHandler) {
        try {
            Result.success(block())
        } catch (e: Exception) {
            val processedError = processError(e, operation)
            if (showUserMessage) {
                showUserMessage(processedError)
            }
            Result.failure(processedError)
        }
    }

    fun handleError(throwable: Throwable) {
        when (throwable) {
            is CancellationException -> return
            else -> processError(throwable, "coroutine_error")
        }
    }

    private fun processError(error: Throwable, operation: String): Exception {
        return when (error) {
            is HttpException -> {
                val httpException = appExceptions.AppException.NetworkException(
                    userMessageRes = R.string.error_network,
                    technicalMessage = "HTTP Error ${error.code()}: ${error.message()}",
                    cause = error,
                    errorCode = error.code()
                )
                logError(httpException, operation)
                httpException
            }
            is SocketTimeoutException -> {
                val timeoutException = appExceptions.AppException.NetworkException(
                    userMessageRes = R.string.error_timeout,
                    technicalMessage = "Request timeout",
                    cause = error
                )
                logError(timeoutException, operation)
                timeoutException
            }
            is ConnectException, is UnknownHostException -> {
                val connectionException = appExceptions.AppException.NetworkException(
                    userMessageRes = R.string.error_no_internet,
                    technicalMessage = "Connection error",
                    cause = error
                )
                logError(connectionException, operation)
                connectionException
            }
            is JSONException -> {
                val parseException = appExceptions.AppException.ParseException(
                    technicalMessage = "JSON parsing error",
                    cause = error
                )
                logError(parseException, operation)
                parseException
            }
            is IOException -> {
                val ioException = appExceptions.AppException.FileSystemException(
                    technicalMessage = "IO operation failed",
                    cause = error
                )
                logError(ioException, operation)
                ioException
            }
            is appExceptions.AppException -> {
                logError(error, operation)
                error
            }
            else -> {
                val unexpectedException = appExceptions.AppException.UnexpectedException(
                    technicalMessage = "Unexpected error",
                    cause = error
                )
                logError(unexpectedException, operation)
                unexpectedException
            }
        }
    }

    private fun logError(exception: Exception, operation: String) {
        if (BuildConfig.DEBUG) {
            Log.e(TAG, "Error in $operation: ${exception.message}", exception)
        }

        crashlytics.run {
            log("Error in $operation")
            setCustomKey("operation", operation)
            recordException(exception)
        }
    }

    private fun showUserMessage(exception: Exception) {
        val message = when (exception) {
            is appExceptions.AppException -> context.getString(exception.userMessageRes)
            else -> context.getString(R.string.error_unexpected)
        }
        
        // TODO: Implement proper UI error display mechanism
        // For example: showToast(message) or post to LiveData/StateFlow
    }

    fun getErrorMessage(@StringRes errorRes: Int): String {
        return context.getString(errorRes)
    }

    fun getErrorMessage(exception: Exception): String {
        return when (exception) {
            is appExceptions.AppException -> context.getString(exception.userMessageRes)
            else -> context.getString(R.string.error_unexpected)
        }
    }
}