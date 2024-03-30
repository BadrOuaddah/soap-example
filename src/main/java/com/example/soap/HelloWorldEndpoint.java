package com.example.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class HelloWorldEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap";

    private HelloWorldWebService helloWorldWebService;

    @Autowired
    public HelloWorldEndpoint(HelloWorldWebService helloWorldService) {
        this.helloWorldWebService = helloWorldService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "sayHelloRequest")
    @ResponsePayload
    public SayHelloResponse sayHello(@RequestPayload SayHelloRequest request) {
        SayHelloResponse response = new SayHelloResponse();
        response.setMessage(helloWorldWebService.sayHelloWorld(request.getName()));
        return response;
    }
}
