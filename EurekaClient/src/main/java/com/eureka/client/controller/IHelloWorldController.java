package com.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IHelloWorldController {

    @RequestMapping("HelloWorld")
    String helloWorld();
}
