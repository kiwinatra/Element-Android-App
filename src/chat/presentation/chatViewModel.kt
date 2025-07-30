package com.elemsocial.feature.chat.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.elemsocial.feature.chat.domain.models.*
import com.elemsocial.feature.chat.domain.repository.ChatRepository
import com.elemsocial.feature.chat.domain.use_case.*
import com.elemsocial.core.common.utils.CoroutineDispatchers
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(
    private val sendMessageUseCase: SendMessageUseCase,
    private val getMessagesUseCase: GetMessagesUseCase,
    private val observeMessagesUseCase: ObserveMessagesUseCase,
    private val editMessageUseCase: EditMessageUseCase,
    private val deleteMessageUseCase: DeleteMessageUseCase,
    private val createChatUseCase: CreateChatUseCase,
    private val observeTypingIndicatorsUseCase: ObserveTypingIndicatorsUseCase,
    private val sendTypingIndicatorUseCase: SendTypingIndicatorUseCase,
    private val markAsReadUseCase: MarkAsReadUseCase,
    private val dispatchers: CoroutineDispatchers
) : ViewModel() {

    private val _uiState = MutableStateFlow(ChatUiState())
    val uiState: StateFlow<ChatUiState> = _uiState.asStateFlow()

    private val _events = MutableSharedFlow<ChatEvent>()
    val events: SharedFlow<ChatEvent> = _events.asSharedFlow()

    private var currentChatId: String? = null

    init {
        observeMessages()
        observeTypingIndicators()
    }

    fun setActiveChat(chatId: String) {
        currentChatId = chatId
        loadMessages(chatId)
        markChatAsRead(chatId)
    }

    fun sendMessage(content: String, attachments: List<Attachment> = emptyList()) {
        currentChatId?.let { chatId ->
            viewModelScope.launch(dispatchers.io) {
                _uiState.update { it.copy(isSendingMessage = true) }
                
                sendMessageUseCase(
                    chatId = chatId,
                    content = content,
                    attachments = attachments
                ).onSuccess { message ->
                    _events.emit(ChatEvent.MessageSent(message))
                }.onFailure { error ->
                    _events.emit(ChatEvent.Error("Failed to send message: ${error.message}"))
                }
                
                _uiState.update { it.copy(isSendingMessage = false) }
            }
        } ?: run {
            viewModelScope.launch {
                _events.emit(ChatEvent.Error("No active chat selected"))
            }
        }
    }

    fun editMessage(messageId: String, newContent: String) {
        currentChatId?.let { chatId ->
            viewModelScope.launch(dispatchers.io) {
                _uiState.update { it.copy(isUpdatingMessage = true) }
                
                editMessageUseCase(
                    chatId = chatId,
                    messageId = messageId,
                    newContent = newContent
                ).onSuccess { message ->
                    _events.emit(ChatEvent.MessageUpdated(message))
                }.onFailure { error ->
                    _events.emit(ChatEvent.Error("Failed to edit message: ${error.message}"))
                }
                
                _uiState.update { it.copy(isUpdatingMessage = false) }
            }
        }
    }

    fun deleteMessage(messageId: String) {
        currentChatId?.let { chatId ->
            viewModelScope.launch(dispatchers.io) {
                deleteMessageUseCase(chatId, messageId)
                    .onSuccess { 
                        _events.emit(ChatEvent.MessageDeleted(messageId))
                    }.onFailure { error ->
                        _events.emit(ChatEvent.Error("Failed to delete message: ${error.message}"))
                    }
            }
        }
    }

    fun sendTypingIndicator() {
        currentChatId?.let { chatId ->
            viewModelScope.launch(dispatchers.io) {
                sendTypingIndicatorUseCase(chatId)
                    .onFailure { error ->
                        // Silently fail typing indicators as they're non-critical
                        println("Failed to send typing indicator: ${error.message}")
                    }
            }
        }
    }

    private fun loadMessages(chatId: String) {
        viewModelScope.launch(dispatchers.io) {
            _uiState.update { it.copy(isLoadingMessages = true) }
            
            getMessagesUseCase(chatId)
                .onSuccess { messages ->
                    _uiState.update { 
                        it.copy(
                            messages = messages,
                            isLoadingMessages = false
                        )
                    }
                }.onFailure { error ->
                    _uiState.update { it.copy(isLoadingMessages = false) }
                    _events.emit(ChatEvent.Error("Failed to load messages: ${error.message}"))
                }
        }
    }

    private fun markChatAsRead(chatId: String) {
        viewModelScope.launch(dispatchers.io) {
            markAsReadUseCase(chatId)
                .onFailure { error ->
                    println("Failed to mark chat as read: ${error.message}")
                }
        }
    }

    private fun observeMessages() {
        viewModelScope.launch(dispatchers.io) {
            currentChatId?.let { chatId ->
                observeMessagesUseCase(chatId)
                    .collect { messages ->
                        _uiState.update { it.copy(messages = messages) }
                    }
            }
        }
    }

    private fun observeTypingIndicators() {
        viewModelScope.launch(dispatchers.io) {
            currentChatId?.let { chatId ->
                observeTypingIndicatorsUseCase(chatId)
                    .collect { typingUsers ->
                        _uiState.update { it.copy(typingUsers = typingUsers) }
                    }
            }
        }
    }

    data class ChatUiState(
        val messages: List<ChatMessage> = emptyList(),
        val typingUsers: List<TypingIndicator> = emptyList(),
        val isLoadingMessages: Boolean = false,
        val isSendingMessage: Boolean = false,
        val isUpdatingMessage: Boolean = false
    )

    sealed class ChatEvent {
        data class MessageSent(val message: ChatMessage) : ChatEvent()
        data class MessageUpdated(val message: ChatMessage) : ChatEvent()
        data class MessageDeleted(val messageId: String) : ChatEvent()
        data class Error(val message: String) : ChatEvent()
    }
}