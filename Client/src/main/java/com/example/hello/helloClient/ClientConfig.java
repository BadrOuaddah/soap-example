package com.example.hello.helloClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ClientConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() {

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());

        webServiceTemplate.setDefaultUri("http://localhost:8080/ws/hello.wsdl");
        return webServiceTemplate;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.example.hello");
        return marshaller;
    }

}
