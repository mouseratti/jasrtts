package com.github.mouseratti.jasrtts.protocols.tcp;

import com.github.mouseratti.jasrtts.interfaces.ClientProtocol;
import com.github.mouseratti.jasrtts.interfaces.Soket;
import org.junit.*;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;


public class TcpProtoTest  {
    private ClientProtocol protocol = new TcpProto();
    Soket soket = Mockito.mock(Soket.class);


    @Test
    public void readMessage() {
        Mockito.when(soket.getHost()).thenReturn("localhost");
        Mockito.when(soket.getPort()).thenReturn(2222);
        assertEquals(soket.getPort(), 2222);
    }

}