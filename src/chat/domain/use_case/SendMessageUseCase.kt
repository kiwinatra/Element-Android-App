package com.elemsocial.feature.chat.domain.use_case

import com.elemsocial.feature.chat.domain.models.ChatMessage
import com.elemsocial.feature.chat.domain.repository.ChatRepository
import com.elemsocial.core.common.exceptions.AppExceptions
import com.elemsocial.core.common.utils.CoroutineDispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SendMessageUseCase @Inject constructor(
    private val repository: ChatRepository,
    private val dispatchers: CoroutineDispatchers,
    private val exceptions: AppExceptions
) {
    suspend operator fun invoke(
        chatId: String,
        content: String,
        attachments: List<ChatMessage.Attachment> = emptyList(),
        replyTo: String? = null
    ): Result<ChatMessage> = withContext(dispatchers.io) {
        try {
            validateMessageContent(content, attachments)
            
            repository.sendMessage(
                chatId = chatId,
                content = content,
                attachments = attachments,
                replyTo = replyTo
            ).also { result ->
                result.onFailure { error ->
                    trackMessageError(chatId, error, content, attachments)
                }
            }
        } catch (e: Exception) {
            trackMessageError(chatId, e, content, attachments)
            Result.failure(exceptions.processChatError(e))
        }
    }

    private fun validateMessageContent(
        content: String,
        attachments: List<ChatMessage.Attachment>
    ) {
        require(content.isNotBlank() || attachments.isNotEmpty()) {
            "Message must have either content or attachments"
        }
        
        require(content.length <= MAX_MESSAGE_LENGTH) {
            "Message exceeds maximum length of $MAX_MESSAGE_LENGTH characters"
        }
        
        require(attachments.size <= MAX_ATTACHMENTS) {
            "Cannot attach more than $MAX_ATTACHMENTS files"
        }
    }

    private suspend fun trackMessageError(
        chatId: String,
        error: Throwable,
        content: String,
        attachments: List<ChatMessage.Attachment>
    ) {
        // TODO: Implement error tracking
        // Could log to analytics or error monitoring service
    }

    companion object {
        private const val MAX_MESSAGE_LENGTH = 2000
        private const val MAX_ATTACHMENTS = 10
    }
}