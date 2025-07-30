package auth.domain.models

sealed class AuthResult {
    data class Success(val user: User) : AuthResult()
    data class Error(val message: String) : AuthResult()
}

class AuthHandler {

    fun handleLoginResult(result: AuthResult) {
        when (result) {
            is AuthResult.Success -> {
                // Обработка успешного входа
                println("Login successful for user: ${result.user.name}")
            }
            is AuthResult.Error -> {
                // Обработка ошибки входа
                println("Login failed: ${result.message}")
            }
        }
    }

    fun handleRegistrationResult(result: AuthResult) {
        when (result) {
            is AuthResult.Success -> {
                // Обработка успешной регистрации
                println("Registration successful for user: ${result.user.name}")
            }
            is AuthResult.Error -> {
                // Обработка ошибки регистрации
                println("Registration failed: ${result.message}")
            }
        }
    }
}
