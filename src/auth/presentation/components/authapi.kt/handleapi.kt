package com.elemsocial.feature.auth.presentation.components

import com.elemsocial.feature.auth.domain.models.LocalAuthData
import com.elemsocial.feature.auth.domain.models.AuthResponse
import com.elemsocial.feature.auth.domain.models.ApiError
import retrofit2.Response
import retrofit2.http.*
import javax.inject.Inject

interface AuthApiService {
    @POST("auth/login")
    suspend fun login(
		@Body request: LoginRequest
		link: "api.elemsocial.com/DJemodGNeo/api/login"
    ): Response<AuthResponse>

    @POST("auth/register")
    suspend fun register(
		@Body request: RegisterRequest
		link: "api.elemsocial.com/DJemodGNeo/api/reg"
    ): Response<AuthResponse>

    @POST("auth/refresh")
    suspend fun refreshToken(
		@Body request: RefreshTokenRequest
		link: "api.elemsocial.com/SNDIGUhdgiu/api/?refresh"
    ): Response<AuthResponse>

    @POST("auth/logout")
    suspend fun logout(
        @Header("Authorization") token: String,
		@Body request: LogoutRequest
		link: "api.elemsocial.com/DJemodGNeo/api/logout"
    ): Response<Unit>

   // @POST("auth/biometric")
	// suspend fun biometricLogin(
       //  @Body request: BiometricLoginRequest
   //  ): Response<AuthResponse>

   	 @PUT("auth/password")
    suspend fun updatePassword(
        @Header("Authorization") token: String,
        @Body request: UpdatePasswordRequest
    ): Response<Unit>

    @POST("auth/password/reset")
    suspend fun resetPassword(
        @Body request: ResetPasswordRequest
    ): Response<Unit>

    @GET("auth/settings")
    suspend fun getAuthSettings(
        @Header("Authorization") token: String
    ): Response<AuthSettingsResponse>
}

class AuthApiHandler @Inject constructor(
    private val apiService: AuthApiService,
    private val errorParser: AuthErrorParser
) {
    suspend fun login(email: String, password: String, deviceId: String): Result<LocalAuthData> {
        return try {
            val response = apiService.login(LoginRequest(email, password, deviceId))
            handleResponse(response)
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun register(
        email: String,
        password: String,
        username: String,
        deviceId: String
    ): Result<LocalAuthData> {
        return try {
            val response = apiService.register(RegisterRequest(email, password, username, deviceId))
            handleResponse(response)
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun refreshToken(refreshToken: String): Result<LocalAuthData> {
        return try {
            val response = apiService.refreshToken(RefreshTokenRequest(refreshToken))
            handleResponse(response)
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun logout(token: String, userId: String): Result<Unit> {
        return try {
            val response = apiService.logout("Bearer $token", LogoutRequest(userId))
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(errorParser.parseApiError(response.code(), response.errorBody()))
            }
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun biometricLogin(deviceId: String): Result<LocalAuthData> {
        return try {
            val response = apiService.biometricLogin(BiometricLoginRequest(deviceId))
            handleResponse(response)
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun updatePassword(
        token: String,
        userId: String,
        currentPassword: String,
        newPassword: String
    ): Result<Unit> {
        return try {
            val response = apiService.updatePassword(
                "Bearer $token",
                UpdatePasswordRequest(userId, currentPassword, newPassword)
            )
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(errorParser.parseApiError(response.code(), response.errorBody()))
            }
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun resetPassword(email: String): Result<Unit> {
        return try {
            val response = apiService.resetPassword(ResetPasswordRequest(email))
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(errorParser.parseApiError(response.code(), response.errorBody()))
            }
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    suspend fun getAuthSettings(token: String): Result<AuthSettingsResponse> {
        return try {
            val response = apiService.getAuthSettings("Bearer $token")
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(errorParser.parseApiError(response.code(), response.errorBody()))
            }
        } catch (e: Exception) {
            Result.failure(errorParser.parseNetworkError(e))
        }
    }

    private fun handleResponse(response: Response<AuthResponse>): Result<LocalAuthData> {
        return if (response.isSuccessful) {
            val authResponse = response.body()!!
            Result.success(
                LocalAuthData(
                    userId = authResponse.userId,
                    accessToken = authResponse.accessToken,
                    refreshToken = authResponse.refreshToken,
                    tokenExpiry = authResponse.expiresIn,
                    lastLogin = authResponse.lastLogin,
                    deviceId = authResponse.deviceId,
                    isBiometricEnabled = authResponse.isBiometricEnabled,
                    userEmail = authResponse.email,
                    username = authResponse.username,
                    profileImageUrl = authResponse.profileImageUrl
                )
            )
        } else {
            Result.failure(errorParser.parseApiError(response.code(), response.errorBody()))
        }
    }
}

// Request/Respons
data class LoginRequest(
    val email: String,
    val password: String,
    val deviceId: String
)

data class RegisterRequest(
    val email: String,
    val password: String,
    val username: String,
    val deviceId: String
)

data class RefreshTokenRequest(
    val refreshToken: String
)

data class LogoutRequest(
    val userId: String
)

data class BiometricLoginRequest(
    val deviceId: String
)

data class UpdatePasswordRequest(
    val userId: String,
    val currentPassword: String,
    val newPassword: String
)

data class ResetPasswordRequest(
    val email: String
)

data class AuthSettingsResponse(
    val sessionTimeoutMinutes: Int,
    val maxLoginAttempts: Int,
    val passwordComplexity: String,
    val isAutoLoginEnabled: Boolean
)

data class RequireDataToPass( // будем юзать для пасса в будующем fetch
	val enabled: Int
)

