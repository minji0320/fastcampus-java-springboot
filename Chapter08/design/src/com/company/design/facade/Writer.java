package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Writer %s로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void write() {
        String msg = String.format("Writer %s에 쓰기 작업을 진행합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        String msg = String.format("Writer %s의 연결을 종료합니다.", fileName);
        System.out.println(msg);
    }
}
