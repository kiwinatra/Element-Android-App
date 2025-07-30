package auth.data.remote.models

data class User(
    val id: String,
    val email: String,
    val name: String,
    val token: String
)

data class AuthResponse(
    val user: User,
    val message: String
)
