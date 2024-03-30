package com.example.soap;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl implements HelloWorldWebService {
    @Override
    public String sayHelloWorld(String name) {
        return "Hello " + name + " !";
    }
}
