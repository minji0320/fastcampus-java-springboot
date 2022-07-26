package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // 기본 생성자를 private 으로 막아야 함
    private SocketClient() {}

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
