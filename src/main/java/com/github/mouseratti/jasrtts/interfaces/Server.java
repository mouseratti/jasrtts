package com.github.mouseratti.jasrtts.interfaces;

public interface Server {
    void start();
    void addProtocol(ClientProtocol protocol);
}
