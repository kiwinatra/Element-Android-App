package com.elemsocial.feature.auth.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.elemsocial.feature.auth.domain.use_case.*
import com.elemsocial.feature.auth.domain.models.LocalAuthData
import com.elemsocial.feature.auth.domain.models.AuthSettings
import com.elemsocial.core.common.utils.CoroutineDispatchers
import com.elemsocial.core.navigation.NavCommand
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase,
    private val refreshTokenUseCase: RefreshTokenUseCase,
    private val logoutUseCase: LogoutUseCase,
    private val verifySessionUseCase: VerifySessionUseCase,
    private val biometricLoginUseCase: BiometricLoginUseCase,
    private val updatePasswordUseCase: UpdatePasswordUseCase,
    private val resetPasswordUseCase: ResetPasswordUseCase,
    private val getAuthSettingsUseCase: GetAuthSettingsUseCase,
    private val updateAuthSettingsUseCase: UpdateAuthSettingsUseCase,
    private val trackAuthAttemptUseCase: TrackAuthAttemptUseCase,
    private val dispatchers: CoroutineDispatchers
) : ViewModel() {

    private val _authState = MutableStateFlow<AuthState>(AuthState.Idle)
    val authState: StateFlow<AuthState> = _authState.asStateFlow()

    private val _navigationCommand = MutableSharedFlow<NavCommand>()
    val navigationCommand = _navigationCommand.asSharedFlow()

    private val _settingsState = MutableStateFlow<AuthSettings?>(null)
    val settingsState: StateFlow<AuthSettings?> = _settingsState.asStateFlow()

    init {
        loadAuthSettings()
    }

    fun login(email: String, password: String, deviceId: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            trackAuthAttemptUseCase(
                AuthAttempt(
                    deviceId = deviceId,
                    attemptType = AuthAttemptType.LOGIN,
                    wasSuccessful = false
                )
            )
            
            loginUseCase(email, password, deviceId)
                .onSuccess { authData ->
                    _authState.value = AuthState.Authenticated(authData)
                    _navigationCommand.emit(NavCommand.Destination(R.id.mainFragment))
                    trackAuthAttemptUseCase(
                        AuthAttempt(
                            deviceId = deviceId,
                            attemptType = AuthAttemptType.LOGIN,
                            wasSuccessful = true
                        )
                    )
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Login failed")
                }
        }
    }

    fun register(email: String, password: String, username: String, deviceId: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            trackAuthAttemptUseCase(
                AuthAttempt(
                    deviceId = deviceId,
                    attemptType = AuthAttemptType.REGISTRATION,
                    wasSuccessful = false
                )
            )
            
            registerUseCase(email, password, username, deviceId)
                .onSuccess { authData ->
                    _authState.value = AuthState.Authenticated(authData)
                    _navigationCommand.emit(NavCommand.Destination(R.id.profileSetupFragment))
                    trackAuthAttemptUseCase(
                        AuthAttempt(
                            deviceId = deviceId,
                            attemptType = AuthAttemptType.REGISTRATION,
                            wasSuccessful = true
                        )
                    )
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Registration failed")
                }
        }
    }

    fun refreshToken(refreshToken: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            refreshTokenUseCase(refreshToken)
                .onSuccess { authData ->
                    _authState.value = AuthState.Authenticated(authData)
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Token refresh failed")
                    _navigationCommand.emit(NavCommand.Destination(R.id.loginFragment))
                }
        }
    }

    fun logout(userId: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            logoutUseCase(userId)
                .onSuccess {
                    _authState.value = AuthState.Unauthenticated
                    _navigationCommand.emit(NavCommand.Destination(R.id.loginFragment))
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Logout failed")
                }
        }
    }

    fun verifySession(userId: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            verifySessionUseCase(userId)
                .onSuccess { isValid ->
                    if (isValid) {
                        _authState.value = AuthState.SessionValid
                    } else {
                        _authState.value = AuthState.SessionInvalid
                        _navigationCommand.emit(NavCommand.Destination(R.id.loginFragment))
                    }
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Session verification failed")
                }
        }
    }

    fun biometricLogin(deviceId: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            trackAuthAttemptUseCase(
                AuthAttempt(
                    deviceId = deviceId,
                    attemptType = AuthAttemptType.BIOMETRIC,
                    wasSuccessful = false
                )
            )
            
            biometricLoginUseCase(deviceId)
                .onSuccess { authData ->
                    _authState.value = AuthState.Authenticated(authData)
                    _navigationCommand.emit(NavCommand.Destination(R.id.mainFragment))
                    trackAuthAttemptUseCase(
                        AuthAttempt(
                            deviceId = deviceId,
                            attemptType = AuthAttemptType.BIOMETRIC,
                            wasSuccessful = true
                        )
                    )
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Biometric login failed")
                }
        }
    }

    fun updatePassword(userId: String, currentPassword: String, newPassword: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            updatePasswordUseCase(userId, currentPassword, newPassword)
                .onSuccess {
                    _authState.value = AuthState.PasswordUpdated
                    _navigationCommand.emit(NavCommand.Back())
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Password update failed")
                }
        }
    }

    fun resetPassword(email: String) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            resetPasswordUseCase(email)
                .onSuccess {
                    _authState.value = AuthState.PasswordResetEmailSent
                    _navigationCommand.emit(NavCommand.Back())
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Password reset failed")
                }
        }
    }

    private fun loadAuthSettings() {
        viewModelScope.launch(dispatchers.io) {
            getAuthSettingsUseCase()
                .onSuccess { settings ->
                    _settingsState.value = settings
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Failed to load settings")
                }
        }
    }

    fun updateSettings(settings: AuthSettings) {
        viewModelScope.launch(dispatchers.io) {
            _authState.value = AuthState.Loading
            updateAuthSettingsUseCase(settings)
                .onSuccess {
                    _settingsState.value = settings
                    _authState.value = AuthState.SettingsUpdated
                    _navigationCommand.emit(NavCommand.Back())
                }
                .onFailure { error ->
                    _authState.value = AuthState.Error(error.message ?: "Failed to update settings")
                }
        }
    }

    sealed class AuthState {
        object Idle : AuthState()
        object Loading : AuthState()
        data class Authenticated(val authData: LocalAuthData) : AuthState()
        object Unauthenticated : AuthState()
        object SessionValid : AuthState()
        object SessionInvalid : AuthState()
        object PasswordUpdated : AuthState()
        object PasswordResetEmailSent : AuthState()
        object SettingsUpdated : AuthState()
        data class Error(val message: String) : AuthState()
    }
}