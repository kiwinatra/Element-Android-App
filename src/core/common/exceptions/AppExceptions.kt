package com.elemsocial.core.common.exceptions

import android.content.Context
import androidx.annotation.StringRes
import com.google.firebase.crashlytics.FirebaseCrashlytics
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppExceptions @Inject constructor(
    private val context: Context,
    private val crashlytics: FirebaseCrashlytics
) {
    sealed class AppException(
        @StringRes open val userMessageRes: Int,
        open val technicalMessage: String = "",
        open val cause: Throwable? = null
    ) : RuntimeException(technicalMessage, cause) {
        
        data class NetworkException(
            override val userMessageRes: Int = R.string.error_network,
            override val technicalMessage: String = "Network operation failed",
            override val cause: Throwable? = null,
            val errorCode: Int? = null
        ) : AppException(userMessageRes, technicalMessage, cause)
        
        data class AuthException(
            override val userMessageRes: Int = R.string.error_auth,
            override val technicalMessage: String = "Authentication failed",
            override val cause: Throwable? = null,
            val authErrorCode: Int
        ) : AppException(userMessageRes, technicalMessage, cause)
        
        data class DatabaseException(
            override val userMessageRes: Int = R.string.error_database,
            override val technicalMessage: String = "Database operation failed",
            override val cause: Throwable? = null,
            val query: String? = null
        ) : AppException(userMessageRes, technicalMessage, cause)
        
        data class FileSystemException(
            override val userMessageRes: Int = R.string.error_filesystem,
            override val technicalMessage: String = "File operation failed",
            override val cause: Throwable? = null,
            val filePath: String? = null
        ) : AppException(userMessageRes, technicalMessage, cause)
        
        data class ParseException(
            override val userMessageRes: Int = R.string.error_parsing,
            override val technicalMessage: String = "Data parsing failed",
            override val cause: Throwable? = null,
            val rawData: String? = null
        ) : AppException(userMessageRes, technicalMessage, cause)
        
        data class UnexpectedException(
            override val userMessageRes: Int = R.string.error_unexpected,
            override val technicalMessage: String = "Unexpected error occurred",
            override val cause: Throwable? = null
        ) : AppException(userMessageRes, technicalMessage, cause)
    }

    fun handleException(exception: Exception) {
        when (exception) {
            is AppException -> handleAppException(exception)
            is IOException -> handleIOException(exception)
            is IllegalStateException -> handleIllegalState(exception)
            is IllegalArgumentException -> handleIllegalArgument(exception)
            else -> handleUnknownException(exception)
        }
    }

    private fun handleAppException(exception: AppException) {
        crashlytics.log("AppException: ${exception.javaClass.simpleName}")
        crashlytics.setCustomKey("user_message_res", exception.userMessageRes)
        exception.cause?.let { crashlytics.recordException(it) }
        
        when (exception) {
            is AppException.NetworkException -> {
                crashlytics.setCustomKey("error_code", exception.errorCode ?: -1)
            }
            is AppException.AuthException -> {
                crashlytics.setCustomKey("auth_error_code", exception.authErrorCode)
            }
            is AppException.DatabaseException -> {
                crashlytics.setCustomKey("failed_query", exception.query ?: "null")
            }
            is AppException.FileSystemException -> {
                crashlytics.setCustomKey("file_path", exception.filePath ?: "null")
            }
            is AppException.ParseException -> {
                crashlytics.setCustomKey("raw_data_length", exception.rawData?.length ?: 0)
            }
            else -> {}
        }
    }

    private fun handleIOException(exception: IOException) {
        val wrappedException = when (exception) {
            is SocketTimeoutException -> AppException.NetworkException(
                userMessageRes = R.string.error_timeout,
                technicalMessage = "Request timeout",
                cause = exception
            )
            is UnknownHostException, is ConnectException -> AppException.NetworkException(
                userMessageRes = R.string.error_no_internet,
                technicalMessage = "No internet connection",
                cause = exception
            )
            else -> AppException.FileSystemException(
                cause = exception,
                technicalMessage = "IO operation failed: ${exception.message}"
            )
        }
        handleAppException(wrappedException)
    }

    private fun handleIllegalState(exception: IllegalStateException) {
        handleAppException(
            AppException.UnexpectedException(
                technicalMessage = "Illegal state: ${exception.message}",
                cause = exception
            )
        )
    }

    private fun handleIllegalArgument(exception: IllegalArgumentException) {
        handleAppException(
            AppException.UnexpectedException(
                technicalMessage = "Invalid argument: ${exception.message}",
                cause = exception
            )
        )
    }

    private fun handleUnknownException(exception: Exception) {
        handleAppException(
            AppException.UnexpectedException(
                technicalMessage = "Unknown error: ${exception.javaClass.simpleName}",
                cause = exception
            )
        )
    }

    fun getErrorMessage(exception: Exception): String {
        return when (exception) {
            is AppException -> context.getString(exception.userMessageRes)
            is SocketTimeoutException -> context.getString(R.string.error_timeout)
            is UnknownHostException, is ConnectException -> context.getString(R.string.error_no_internet)
            else -> context.getString(R.string.error_unexpected)
        }
    }
}