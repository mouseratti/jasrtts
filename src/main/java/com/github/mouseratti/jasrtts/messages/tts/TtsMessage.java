package com.github.mouseratti.jasrtts.messages.tts;

import com.github.mouseratti.jasrtts.interfaces.Message;
import com.github.mouseratti.jasrtts.interfaces.MessageType;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class TtsMessage implements Message {
    private MessageType messageType;
    private String body;

}
