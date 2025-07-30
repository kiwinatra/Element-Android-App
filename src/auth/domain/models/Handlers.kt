package com.elemsocial.feature.auth.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "auth_data")
data class LocalAuthData(
    @PrimaryKey(autoGenerate = false)
    val userId: String,
    val accessToken: String,
    val refreshToken: String,
    val tokenExpiry: Long,
    val lastLogin: Date,
    val deviceId: String,
    val isBiometricEnabled: Boolean = false,
    val userEmail: String? = null,
    val username: String? = null,
    val profileImageUrl: String? = null
) {
    fun isTokenValid(currentTime: Long = System.currentTimeMillis()): Boolean {
        return tokenExpiry > currentTime
    }

    fun toEncryptedEntity(encryptionKey: ByteArray): EncryptedAuthData {
        return EncryptedAuthData(
            userId = userId,
            encryptedAccessToken = encryptString(accessToken, encryptionKey),
            encryptedRefreshToken = encryptString(refreshToken, encryptionKey),
            tokenExpiry = tokenExpiry,
            lastLogin = lastLogin.time,
            deviceId = deviceId,
            isBiometricEnabled = isBiometricEnabled,
            encryptedEmail = userEmail?.let { encryptString(it, encryptionKey) },
            encryptedUsername = username?.let { encryptString(it, encryptionKey) },
            encryptedProfileImageUrl = profileImageUrl?.let { encryptString(it, encryptionKey) }
        )
    }

    private fun encryptString(data: String, key: ByteArray): String {
        // AES encryption implementation would go here
        // For actual implementation use Android's Crypto API
        return data // Placeholder - replace with actual encryption
    }
}

@Entity(tableName = "encrypted_auth_data")
data class EncryptedAuthData(
    @PrimaryKey
    val userId: String,
    val encryptedAccessToken: String,
    val encryptedRefreshToken: String,
    val tokenExpiry: Long,
    val lastLogin: Long,
    val deviceId: String,
    val isBiometricEnabled: Boolean = false,
    val encryptedEmail: String? = null,
    val encryptedUsername: String? = null,
    val encryptedProfileImageUrl: String? = null
) {
    fun toDecryptedEntity(encryptionKey: ByteArray): LocalAuthData {
        return LocalAuthData(
            userId = userId,
            accessToken = decryptString(encryptedAccessToken, encryptionKey),
            refreshToken = decryptString(encryptedRefreshToken, encryptionKey),
            tokenExpiry = tokenExpiry,
            lastLogin = Date(lastLogin),
            deviceId = deviceId,
            isBiometricEnabled = isBiometricEnabled,
            userEmail = encryptedEmail?.let { decryptString(it, encryptionKey) },
            username = encryptedUsername?.let { decryptString(it, encryptionKey) },
            profileImageUrl = encryptedProfileImageUrl?.let { decryptString(it, encryptionKey) }
        )
    }

    private fun decryptString(data: String, key: ByteArray): String {
        // AES decryption implementation would go here
        // For actual implementation use Android's Crypto API
        return data // Placeholder - replace with actual decryption
    }
}

@Entity(tableName = "auth_attempts")
data class AuthAttempt(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val timestamp: Long = System.currentTimeMillis(),
    val deviceId: String,
    val attemptType: AuthAttemptType,
    val wasSuccessful: Boolean,
    val errorMessage: String? = null
)

enum class AuthAttemptType {
    LOGIN, REGISTRATION, TOKEN_REFRESH, BIOMETRIC, LOGOUT
}

@Entity(tableName = "auth_settings")
data class AuthSettings(
    @PrimaryKey
    val settingsId: String = "DEFAULT_SETTINGS",
    val sessionTimeoutMinutes: Int = 30,
    val maxLoginAttempts: Int = 5,
    val passwordComplexityRequirements: PasswordComplexity = PasswordComplexity.MEDIUM,
    val isAutoLoginEnabled: Boolean = false,
    val lastSettingsUpdate: Long = System.currentTimeMillis()
)

enum class PasswordComplexity {
    LOW, MEDIUM, HIGH
}