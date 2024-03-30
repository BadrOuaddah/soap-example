package com.example.soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SayHelloRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
