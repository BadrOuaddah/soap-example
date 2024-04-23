package com.example.hello.helloClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SoapClientApplication.class, args);

        HelloService helloService = context.getBean(HelloService.class);

        String result = helloService.callSoapService();

        System.out.println("Result: " + result);
    }
}
