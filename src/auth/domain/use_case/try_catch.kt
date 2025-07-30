package auth.domain.use_case

import auth.domain.models.AuthResult
import auth.domain.repository.AuthRepository

class TryCatchUseCase(private val authRepository: AuthRepository) {

    suspend fun login(email: String, password: String): AuthResult {
        return try {
            val user = authRepository.login(email, password)
            AuthResult.Success(user)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Unknown error occurred")
        }
    }

    suspend fun register(email: String, password: String): AuthResult {
        return try {
            val user = authRepository.register(email, password)
            AuthResult.Success(user)
        } catch (e: Exception) {
            AuthResult.Error(e.message ?: "Unknown error occurred")
        }
    }

    suspend fun logout() {
        return try {
            authRepository.logout()
        } catch (e: Exception) {
            // Обработка ошибки выхода, если необходимо
            throw Exception("Logout failed: ${e.message}")
        }
    }
}
