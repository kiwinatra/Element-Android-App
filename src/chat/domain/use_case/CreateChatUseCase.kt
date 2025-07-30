package chat.domain.use_case

import chat.data.remote.models.ChatRegistrationRequest
import chat.data.remote.models.ChatRegistrationResponse
import chat.domain.repository.ChatRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CreateChatUseCase(private val chatRepository: ChatRepository) {

    suspend fun execute(participants: List<String>): ChatRegistrationResponse {
        return withContext(Dispatchers.IO) {
            try {
                val request = ChatRegistrationRequest(participants)
                val response: ChatRegistrationResponse = chatRepository.createChat(request)

                if (response.status == "success") {
                    response
                } else {
                    throw Exception("Failed to create chat: ${response.status}")
                }
            } catch (e: Exception) {
                // Логирование ошибки или обработка
                throw Exception("Error creating chat: ${e.message}")
            }
        }
    }
}
