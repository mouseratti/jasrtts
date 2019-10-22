package com.github.mouseratti.jasrtts.handlers.ping;

import com.github.mouseratti.jasrtts.interfaces.Message;
import com.github.mouseratti.jasrtts.interfaces.MessageFactory;

public class PongMessageFactory implements MessageFactory {
    public Message make() {
        return new PongMessage();
    }
}
