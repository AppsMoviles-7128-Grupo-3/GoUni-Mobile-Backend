package com.studentconnect.backendgouni.chat.socket.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    private String message;
    private String user;
}