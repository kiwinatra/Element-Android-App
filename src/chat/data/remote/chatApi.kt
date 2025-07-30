package com.elemsocial.feature.chat.data.remote

import com.elemsocial.feature.chat.data.models.*
import retrofit2.Response
import retrofit2.http.*

interface ChatApiService {

    // Message Endpoints
    @GET("chats/{chatId}/messages")
    suspend fun getMessages(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Query("limit") limit: Int = 50,
        @Query("before") before: Long? = null
    ): Response<MessageListResponse>

    @POST("chats/{chatId}/messages")
    suspend fun sendMessage(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Body request: SendMessageRequest
    ): Response<MessageResponse>

    @PUT("chats/{chatId}/messages/{messageId}")
    suspend fun editMessage(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Path("messageId") messageId: String,
        @Body request: EditMessageRequest
    ): Response<MessageResponse>

    @DELETE("chats/{chatId}/messages/{messageId}")
    suspend fun deleteMessage(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Path("messageId") messageId: String
    ): Response<Unit>

    // Chat Endpoints
    @GET("chats")
    suspend fun getChats(
        @Header("Authorization") token: String,
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): Response<ChatListResponse>

    @POST("chats")
    suspend fun createChat(
        @Header("Authorization") token: String,
        @Body request: CreateChatRequest
    ): Response<ChatResponse>

    @GET("chats/{chatId}")
    suspend fun getChatDetails(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String
    ): Response<ChatResponse>

    @PUT("chats/{chatId}")
    suspend fun updateChat(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Body request: UpdateChatRequest
    ): Response<ChatResponse>

    @DELETE("chats/{chatId}")
    suspend fun leaveChat(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String
    ): Response<Unit>

    // Member Endpoints
    @POST("chats/{chatId}/members")
    suspend fun addMembers(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Body request: AddMembersRequest
    ): Response<ChatMembersResponse>

    @DELETE("chats/{chatId}/members/{userId}")
    suspend fun removeMember(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Path("userId") userId: String
    ): Response<Unit>

    // Typing Indicators
    @POST("chats/{chatId}/typing")
    suspend fun sendTypingIndicator(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String
    ): Response<Unit>

    // Read Receipts
    @POST("chats/{chatId}/read")
    suspend fun markAsRead(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Body request: MarkAsReadRequest
    ): Response<Unit>

    // Media Upload
    @Multipart
    @POST("chats/{chatId}/media")
    suspend fun uploadMedia(
        @Header("Authorization") token: String,
        @Path("chatId") chatId: String,
        @Part file: MultipartBody.Part,
        @Part("type") type: String
    ): Response<MediaUploadResponse>
}

class ChatApiHandler @Inject constructor(
    private val apiService: ChatApiService,
    private val errorHandler: ChatErrorHandler
) {
    suspend fun getMessages(
        token: String,
        chatId: String,
        limit: Int = 50,
        before: Long? = null
    ): Result<MessageListResponse> = handleApiCall {
        apiService.getMessages("Bearer $token", chatId, limit, before)
    }

    suspend fun sendMessage(
        token: String,
        chatId: String,
        request: SendMessageRequest
    ): Result<MessageResponse> = handleApiCall {
        apiService.sendMessage("Bearer $token", chatId, request)
    }

    suspend fun editMessage(
        token: String,
        chatId: String,
        messageId: String,
        request: EditMessageRequest
    ): Result<MessageResponse> = handleApiCall {
        apiService.editMessage("Bearer $token", chatId, messageId, request)
    }

    suspend fun deleteMessage(
        token: String,
        chatId: String,
        messageId: String
    ): Result<Unit> = handleApiCall {
        apiService.deleteMessage("Bearer $token", chatId, messageId)
    }

    suspend fun getChats(
        token: String,
        limit: Int = 20,
        offset: Int = 0
    ): Result<ChatListResponse> = handleApiCall {
        apiService.getChats("Bearer $token", limit, offset)
    }

    suspend fun createChat(
        token: String,
        request: CreateChatRequest
    ): Result<ChatResponse> = handleApiCall {
        apiService.createChat("Bearer $token", request)
    }

    suspend fun getChatDetails(
        token: String,
        chatId: String
    ): Result<ChatResponse> = handleApiCall {
        apiService.getChatDetails("Bearer $token", chatId)
    }

    suspend fun updateChat(
        token: String,
        chatId: String,
        request: UpdateChatRequest
    ): Result<ChatResponse> = handleApiCall {
        apiService.updateChat("Bearer $token", chatId, request)
    }

    suspend fun leaveChat(
        token: String,
        chatId: String
    ): Result<Unit> = handleApiCall {
        apiService.leaveChat("Bearer $token", chatId)
    }

    suspend fun addMembers(
        token: String,
        chatId: String,
        request: AddMembersRequest
    ): Result<ChatMembersResponse> = handleApiCall {
        apiService.addMembers("Bearer $token", chatId, request)
    }

    suspend fun removeMember(
        token: String,
        chatId: String,
        userId: String
    ): Result<Unit> = handleApiCall {
        apiService.removeMember("Bearer $token", chatId, userId)
    }

    suspend fun sendTypingIndicator(
        token: String,
        chatId: String
    ): Result<Unit> = handleApiCall {
        apiService.sendTypingIndicator("Bearer $token", chatId)
    }

    suspend fun markAsRead(
        token: String,
        chatId: String,
        request: MarkAsReadRequest
    ): Result<Unit> = handleApiCall {
        apiService.markAsRead("Bearer $token", chatId, request)
    }

    suspend fun uploadMedia(
        token: String,
        chatId: String,
        file: MultipartBody.Part,
        type: String
    ): Result<MediaUploadResponse> = handleApiCall {
        apiService.uploadMedia("Bearer $token", chatId, file, type)
    }

    private suspend fun <T> handleApiCall(apiCall: suspend () -> Response<T>): Result<T> {
        return try {
            val response = apiCall()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Result.failure(errorHandler.handleError(response.code(), response.errorBody()))
            }
        } catch (e: Exception) {
            Result.failure(errorHandler.handleNetworkError(e))
        }
    }
}