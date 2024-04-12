package com.example.hello.helloServer;

import io.spring.guides.gs_producing_web_service.Hello;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class HelloRepository {
    Hello hello =new Hello();

    @PostConstruct
    public void initData() {

        Hello hello = new Hello();
        hello.setHello("Hello everyone");

    }

}
