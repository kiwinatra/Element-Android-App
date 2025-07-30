package chat.data.remote.models

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ChatApi {

    @POST("chat/create")
    suspend fun createChat(@Body chatRequest: ChatRegistrationRequest): Response<ChatRegistrationResponse>

    @GET("chat/messages/{chatId}")
    suspend fun getMessages(@Path("chatId") chatId: String): Response<MessageResponse>

    @POST("chat/send")
    suspend fun sendMessage(@Body message: Message): Response<Message>
}
