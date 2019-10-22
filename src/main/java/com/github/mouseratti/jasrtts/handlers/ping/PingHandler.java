package com.github.mouseratti.jasrtts.handlers.ping;

import com.github.mouseratti.jasrtts.interfaces.Connection;
import com.github.mouseratti.jasrtts.interfaces.ConnectionHandler;
import com.github.mouseratti.jasrtts.interfaces.MessageFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.var;

import java.io.IOException;

@RequiredArgsConstructor
@Log
public class PingHandler implements ConnectionHandler {
    private final MessageFactory messageFactory;

    public void handle(Connection connection) {
        try {
            var message = connection.read();
            connection.write(messageFactory.make());
        } catch (IOException e) {
            log.warning("Error on handling connection!");
            connection.close();
        }

    }

    public static ConnectionHandler getHandler(MessageFactory messageFactory) {
        return new PingHandler(messageFactory);
    }
}
