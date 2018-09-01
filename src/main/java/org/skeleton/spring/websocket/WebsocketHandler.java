package org.skeleton.spring.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;
import java.util.List;

public class WebsocketHandler extends TextWebSocketHandler {
    private static Logger logger = LoggerFactory.getLogger(WebsocketHandler.class);
    private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();

    public WebsocketHandler() {
        sessionList = new ArrayList<WebSocketSession>();
    }

    // Session Started
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessionList.add(session);
        logger.info("{} is Connected.", session.getId());
    }

    // Client To Server Message Received
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("Message From {} : {}", session.getId(), message.getPayload());

        for (int i = 0; i < sessionList.size(); i++) {
            WebSocketSession client = sessionList.get(i);
            client.sendMessage(new TextMessage("Message From " + session.getId() + " : " + message.getPayload()));
        }
    }

    // Session Closed
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessionList.remove(session);
        logger.info("{} is Disconnected.", session.getId());
    }
}