package com.elemsocial.feature.auth.domain.use_case

import com.elemsocial.feature.auth.domain.models.*
import com.elemsocial.feature.auth.domain.repository.AuthRepository
import com.elemsocial.core.common.exceptions.AppExceptions
import com.elemsocial.core.common.utils.CoroutineDispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(
        email: String,
        password: String,
        deviceId: String
    ): Result<LocalAuthData> = withContext(dispatchers.io) {
        try {
            val response = repository.login(email, password, deviceId)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class RegisterUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(
        email: String,
        password: String,
        username: String,
        deviceId: String
    ): Result<LocalAuthData> = withContext(dispatchers.io) {
        try {
            val response = repository.register(email, password, username, deviceId)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class RefreshTokenUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(refreshToken: String): Result<LocalAuthData> = withContext(dispatchers.io) {
        try {
            val response = repository.refreshToken(refreshToken)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class LogoutUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers
) {
    suspend operator fun invoke(userId: String): Result<Unit> = withContext(dispatchers.io) {
        try {
            repository.logout(userId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

class VerifySessionUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers
) {
    suspend operator fun invoke(userId: String): Result<Boolean> = withContext(dispatchers.io) {
        try {
            val isValid = repository.verifySession(userId)
            Result.success(isValid)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

class BiometricLoginUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(deviceId: String): Result<LocalAuthData> = withContext(dispatchers.io) {
        try {
            val response = repository.biometricLogin(deviceId)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class UpdatePasswordUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(
        userId: String,
        currentPassword: String,
        newPassword: String
    ): Result<Unit> = withContext(dispatchers.io) {
        try {
            repository.updatePassword(userId, currentPassword, newPassword)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class ResetPasswordUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(email: String): Result<Unit> = withContext(dispatchers.io) {
        try {
            repository.resetPassword(email)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(exceptions.processAuthError(e))
        }
    }
}

class GetAuthSettingsUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers
) {
    suspend operator fun invoke(): Result<AuthSettings> = withContext(dispatchers.io) {
        try {
            val settings = repository.getAuthSettings()
            Result.success(settings)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

class UpdateAuthSettingsUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers
) {
    suspend operator fun invoke(settings: AuthSettings): Result<Unit> = withContext(dispatchers.io) {
        try {
            repository.updateAuthSettings(settings)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

class TrackAuthAttemptUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val dispatchers: CoroutineDispatchers
) {
    suspend operator fun invoke(attempt: AuthAttempt): Result<Unit> = withContext(dispatchers.io) {
        try {
            repository.trackAuthAttempt(attempt)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}