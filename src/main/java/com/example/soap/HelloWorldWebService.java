package com.example.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface HelloWorldWebService {
    @WebMethod
    String sayHelloWorld(String name);
}
