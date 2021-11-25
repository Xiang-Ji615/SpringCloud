package com.eureka.client.controller;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController implements IHelloWorldController{

    EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    public HelloWorldController(EurekaClient eurekaClient){
        this.eurekaClient = eurekaClient;
    }

    @Override
    public String helloWorld() {
        return "Hello world " + eurekaClient.getApplication(appName).getName();
    }
}
