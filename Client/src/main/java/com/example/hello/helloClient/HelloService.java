package com.example.hello.helloClient;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class HelloService {

    private final WebServiceTemplate webServiceTemplate;

    public HelloService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public String callSoapService() {
        Object response = webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws/hello", "request");
        return response.toString();
    }

}
