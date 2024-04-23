package com.example.hello.helloClient;

import com.example.generated.GetHelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

    @Autowired
    private HelloClient helloClient;

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GetHelloResponse response = helloClient.sayHello("Ahmed");
        System.out.println("Response from server: " + response.getHello());
    }
}