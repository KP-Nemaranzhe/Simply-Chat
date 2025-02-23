package com.example.simply_chat_demo.client;

import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

public class MyStompSessionHandler extends StompSessionHandlerAdapter{
    @Override
    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {   
        session.subscribe("/topic/messages", new StompFrameHandler()
        
        )

    }

    @Override
    public void handleTransportError(StompSession session, Throwable exception) {
        exception.printStackTrace();
    }
}