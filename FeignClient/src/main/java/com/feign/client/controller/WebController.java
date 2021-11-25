package com.feign.client.controller;

import com.feign.client.IHelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    IHelloWorldClient helloWorldClient;

    @Autowired
    public WebController(IHelloWorldClient helloWorldClient){
        this.helloWorldClient = helloWorldClient;
    }

    @RequestMapping("/HelloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("greeting", helloWorldClient.helloWorld());
        return "helloworld-view";
    }
}
