package auth.data.repository

import auth.data.remote.AuthApi
import auth.domain.repository.AuthRepository
import auth.domain.models.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthRepositoryImpl(
    private val authApi: AuthApi
) : AuthRepository {

    override suspend fun login(email: String, password: String): User {
        return withContext(Dispatchers.IO) {
            val response = authApi.login(email, password)
            if (response.isSuccessful) {
                response.body() ?: throw Exception("Login failed")
            } else {
                throw Exception("Error: ${response.code()}")
            }
        }
    }

    override suspend fun register(email: String, password: String): User {
        return withContext(Dispatchers.IO) {
            val response = authApi.register(email, password)
            if (response.isSuccessful) {
                response.body() ?: throw Exception("Registration failed")
            } else {
                throw Exception("Error: ${response.code()}")
            }
        }
    }

    override suspend fun logout() {
        withContext(Dispatchers.IO) {
            authApi.logout()
        }
    }
}
