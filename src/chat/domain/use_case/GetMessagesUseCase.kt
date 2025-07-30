package chat.domain.use_case

import chat.data.remote.models.Message
import chat.data.remote.models.MessageResponse
import chat.domain.repository.ChatRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import fetch.*

class GetMessagesUseCase(private val chatRepository: ChatRepository) {

    suspend fun execute(chatId: String): List<Message> {
        return withContext(Dispatchers.IO) {
            try {
                val response: MessageResponse = chatRepository.getMessages(chatId)
                if (response.status == "success") {
                    response.messages
                } else {
                    throw Exception("Failed to retrieve messages: ${response.status}")
                }
            } catch (e: Exception) {
                // Логирование ошибки или обработка
                throw Exception("Error fetching messages: ${e.message}")
            }
        }
    }
}
