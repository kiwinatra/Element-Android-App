package com.elemsocial.feature.chat.domain.repository

import com.elemsocial.feature.chat.domain.models.*
import kotlinx.coroutines.flow.Flow

interface ChatRepository {

    // Message Operations
    suspend fun getMessages(
        chatId: String,
        limit: Int = 50,
        before: Long? = null
    ): Result<List<ChatMessage>>

    suspend fun sendMessage(
        chatId: String,
        content: String,
        attachments: List<Attachment> = emptyList(),
        replyTo: String? = null
    ): Result<ChatMessage>

    suspend fun editMessage(
        chatId: String,
        messageId: String,
        newContent: String
    ): Result<ChatMessage>

    suspend fun deleteMessage(
        chatId: String,
        messageId: String
    ): Result<Unit>

    fun observeMessages(chatId: String): Flow<List<ChatMessage>>

    // Chat Operations
    suspend fun getChats(
        limit: Int = 20,
        offset: Int = 0
    ): Result<List<Chat>>

    suspend fun createChat(
        userIds: List<String>,
        name: String? = null,
        isGroup: Boolean = false
    ): Result<Chat>

    suspend fun getChatDetails(chatId: String): Result<Chat>

    suspend fun updateChat(
        chatId: String,
        name: String? = null,
        avatarUrl: String? = null
    ): Result<Chat>

    suspend fun leaveChat(chatId: String): Result<Unit>

    // Member Operations
    suspend fun addMembers(
        chatId: String,
        userIds: List<String>
    ): Result<List<ChatMember>>

    suspend fun removeMember(
        chatId: String,
        userId: String
    ): Result<Unit>

    // Typing Indicators
    suspend fun sendTypingIndicator(chatId: String): Result<Unit>
    fun observeTypingIndicators(chatId: String): Flow<List<TypingIndicator>>

    // Read Receipts
    suspend fun markAsRead(
        chatId: String,
        messageIds: List<String>
    ): Result<Unit>

    // Media Operations
    suspend fun uploadMedia(
        chatId: String,
        fileBytes: ByteArray,
        fileName: String,
        mimeType: String
    ): Result<MediaUploadResult>

    // Real-time Updates
    fun observeChatUpdates(): Flow<ChatUpdateEvent>
    fun observeChatListUpdates(): Flow<List<ChatUpdateEvent>>

    // Local Cache Management
    suspend fun refreshChatCache(chatId: String): Result<Unit>
    suspend fun clearChatCache(chatId: String): Result<Unit>
}