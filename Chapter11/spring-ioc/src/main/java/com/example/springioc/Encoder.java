package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder implements IEncoder {

    private IEncoder iEncoder;

    public Encoder(@Qualifier("base74Encoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    @Override
    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
