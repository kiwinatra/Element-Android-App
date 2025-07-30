package chat.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import chat.domain.models.Message

@Composable
fun ChatScreen(
    messages: List<Message>,
    onSendMessage: (String) -> Unit
) {
    var messageText by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        // Список сообщений
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(messages) { message ->
                MessageItem(message)
            }
        }

        // Поле ввода сообщения
        Row(modifier = Modifier.padding(8.dp)) {
            TextField(
                value = messageText,
                onValueChange = { messageText = it },
                modifier = Modifier.weight(1f),
                label = { Text("Type a message") }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                if (messageText.isNotBlank()) {
                    onSendMessage(messageText)
                    messageText = ""
                }
            }) {
                Text("Send")
            }
        }
    }
}

@Composable
fun MessageItem(message: Message) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = message.senderId, style = MaterialTheme.typography.body2)
        Text(text = message.content, style = MaterialTheme.typography.body1)
        Text(text = message.timestamp.toString(), style = MaterialTheme.typography.caption)
    }
}
