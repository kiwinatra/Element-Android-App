package auth.data.remote

import auth.domain.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<User>

    @POST("auth/register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<User>

    @POST("auth/logout")
    suspend fun logout(): Response<Unit>
}

data class LoginRequest(
    val email: String,
    val password: String
)

data class RegisterRequest(
    val email: String,
    val password: String
)
