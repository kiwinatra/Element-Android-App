package chat.data.remote.models

data class Chat(
    val id: String,
    val participants: List<String>,
    val lastMessage: Message?,
    val createdAt: Long
)

data class ChatRegistrationRequest(
    val participants: List<String>
)

data class ChatRegistrationResponse(
    val chat: Chat,
    val status: String
)

fun createChat(participants: List<String>): ChatRegistrationRequest {
    return ChatRegistrationRequest(participants)
}

fun handleChatRegistrationResponse(response: ChatRegistrationResponse) {
    if (response.status == "success") {
        println("Chat created successfully with ID: ${response.chat.id}")
    } else {
        println("Failed to create chat: ${response.status}")
    }
}
