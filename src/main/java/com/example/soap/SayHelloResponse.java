package com.example.soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SayHelloResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
