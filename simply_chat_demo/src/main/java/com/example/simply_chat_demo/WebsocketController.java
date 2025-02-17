package com.example.simply_chat_demo;
//This file will handle websocket requests

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebsocketController {
    private final SimpMessagingTemplate messagingTemplate;

    //create a constructor
    @Autowired
    public WebsocketController(SimpMessagingTemplate messagingTemplate){
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/message") //bind this to the /app/messages route
    
    public void handleMessage(com.example.simply_chat_demo.Message message) {
        System.out.println("Received message from user: "+ message.getUser() + ": "+ message.getMessage());
        messagingTemplate.convertAndSend("/topic/messages", message);
        System.out.println("Send message to /topic/messages: "+ message.getUser() + ": " + message.getMessage());
    }
}