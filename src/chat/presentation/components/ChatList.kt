package chat.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import chat.domain.models.Chat

@Composable
fun ChatList(chats: List<Chat>, onChatClick: (String) -> Unit) {
    LazyColumn {
        items(chats) { chat ->
            ChatItem(chat, onChatClick)
        }
    }
}

@Composable
fun ChatItem(chat: Chat, onChatClick: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onChatClick(chat.id) }
            .padding(16.dp)
    ) {
        Text(text = "Chat with: ${chat.participants.joinToString(", ")}")
        chat.lastMessage?.let {
            Text(text = "Last message: ${it.content}", style = MaterialTheme.typography.body2)
        }
    }
}
