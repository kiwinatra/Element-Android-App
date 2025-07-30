package core.navigation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Router(private val context: Context) {

    fun navigateToHome() {
        val intent = Intent(context, HomeActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToProfile(userId: String) {
        val intent = Intent(context, ProfileActivity::class.java).apply {
            putExtra(EXTRA_USER_ID, userId)
        }
        context.startActivity(intent)
    }

    fun navigateToSettings() {
        val intent = Intent(context, SettingsActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToChat(chatId: String) {
        val intent = Intent(context, ChatActivity::class.java).apply {
            putExtra(EXTRA_CHAT_ID, chatId)
        }
        context.startActivity(intent)
    }

    companion object {
        const val EXTRA_USER_ID = "EXTRA_USER_ID"
        const val EXTRA_CHAT_ID = "EXTRA_CHAT_ID"
    }
}
