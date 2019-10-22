package com.github.mouseratti.jasrtts.interfaces;


public interface ClientProtocol {
    void listen(Soket soket);
    Connection newConnection();
}
