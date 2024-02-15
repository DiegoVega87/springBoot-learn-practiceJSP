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

    @RequestMapping("say-hello-html")
    public String sayHelloHtml(){
        // Using StringBuilder to create a HTML page is not the best practice
        // but is better than using String concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("My First HTML page");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>");
        sb.append("My First HTML page with body");
        sb.append("</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
