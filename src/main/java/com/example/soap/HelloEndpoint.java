package com.example.soap;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

public class HelloEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetHelloRequest")
    @ResponsePayload
    public GetHelloResponse getHello(@RequestPayload GetHelloRequest request) {
        GetHelloResponse response = new GetHelloResponse();
        response.setGreeting("Hello, " + request.getName() + "!");
        return response;
    }
}
