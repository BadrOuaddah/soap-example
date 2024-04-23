package com.example.hello.helloClient;

import com.example.generated.GetHelloRequest;
import com.example.generated.GetHelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class HelloClient {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public GetHelloResponse sayHello(String name) {
        GetHelloRequest request = new GetHelloRequest();
        request.setName(name);
        return (GetHelloResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", request);
    }
}