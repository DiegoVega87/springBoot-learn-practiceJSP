package com.buildwebapps.practice.myfirstjavawebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //This is a controller class
@ResponseBody //This is a response body
public class SayHelloController {

    //"say-hello" is the URL path --> "Hello! What are you learning today?" is the response

    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }
}
