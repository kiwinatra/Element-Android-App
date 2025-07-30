// modelapi.ts

export interface Message {
    id: string;
    senderId: string;
    receiverId: string;
    content: string;
    timestamp: number;
}

export interface Chat {
    id: string;
    participants: string[];
    lastMessage?: Message;
    createdAt: number;
}

export interface ChatRegistrationRequest {
    participants: string[];
}

export interface ChatRegistrationResponse {
    chat: Chat;
    status: string;
}

export interface MessageResponse {
    messages: Message[];
    status: string;
}
