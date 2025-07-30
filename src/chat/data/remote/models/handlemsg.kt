package chat.data.remote.models

data class Message(
    val id: String,
    val senderId: String,
    val receiverId: String,
    val content: String,
    val timestamp: Long
)

data class MessageResponse(
    val messages: List<Message>,
    val status: String
)

fun handleIncomingMessage(message: Message) {
    // Логика обработки входящего сообщения
    println("New message from ${message.senderId}: ${message.content}")
}

fun handleOutgoingMessage(message: Message) {
    // Логика обработки исходящего сообщения
    println("Sending message to ${message.receiverId}: ${message.content}")
}
