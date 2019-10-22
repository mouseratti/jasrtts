package com.github.mouseratti.jasrtts.interfaces;

import java.io.IOException;

public interface Connection {

    Message read() throws IOException;
    void write(Message message) throws IOException;
    void close();
}
