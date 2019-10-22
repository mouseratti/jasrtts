package com.github.mouseratti.jasrtts.handlers.ping;

import com.github.mouseratti.jasrtts.interfaces.Message;
import com.github.mouseratti.jasrtts.interfaces.MessageType;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class PongMessage implements Message {
    private MessageType messageType = MessageType.PONG;

    public String body() {
        return null;
    }
}
