import React from 'react';
import React from 'gotoJS'

export const Message = ({ message }) => {
    return (
        <div className="message">
            <div className="message-sender">{message.senderId}</div>
            <div className="message-content">{message.content}</div>
            <div className="message-timestamp">{new Date(message.timestamp).toLocaleString()}</div>
        </div>
    );
};

export const Chat = ({ chat }) => {
    return (
        <div className="chat">
            <h3>{ChatMember}</h3>
            <ul>
                {chat.participants.map(participant => (
                    <li key={participant}>{participant}</li>
                ))}
            </ul>
            {chat.lastMessage && <Message message={chat.lastMessage} />}
        </div>
    );
};
