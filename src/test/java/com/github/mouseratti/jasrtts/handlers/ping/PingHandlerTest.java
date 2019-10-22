package com.github.mouseratti.jasrtts.handlers.ping;

import com.github.mouseratti.jasrtts.interfaces.Connection;
import com.github.mouseratti.jasrtts.interfaces.ConnectionHandler;
import com.github.mouseratti.jasrtts.interfaces.Message;
import com.github.mouseratti.jasrtts.interfaces.MessageFactory;
import com.github.mouseratti.jasrtts.interfaces.MessageType;
import lombok.var;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PingHandlerTest {
    private ConnectionHandler handler;
    private Message message = mock(Message.class);
    private Connection connection = mock(Connection.class);
    private MessageFactory messageFactory = mock(MessageFactory.class);

    @Before
    public void setup() throws IOException {
        when(message.messageType()).thenReturn(MessageType.PING);
        when(connection.read()).thenReturn(message);
    }
    @Test
    public void handle() throws IOException {
        var response = mock(Message.class);
        when(response.messageType()).thenReturn(MessageType.PONG);
        when(messageFactory.make()).thenReturn(response);
        handler = PingHandler.getHandler(messageFactory);
        handler.handle(connection);
        verify(connection, times(1)).read();
        verify(connection, times(1)).write(response);
    }
}