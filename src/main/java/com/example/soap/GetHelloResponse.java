package com.example.soap;

@XmlRootElement
public class GetHelloResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
