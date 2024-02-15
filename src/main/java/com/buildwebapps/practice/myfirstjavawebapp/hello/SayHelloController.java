package com.buildwebapps.practice.myfirstjavawebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //This is a controller class
public class SayHelloController {

    //"say-hello" is the URL path --> "Hello! What are you learning today?" is the response

    @RequestMapping("say-hello")
    @ResponseBody //This is a response body
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody // The @ResponseBody annotation tells Spring that the return value of the method should be used as the response body of the request
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

    // This is a better way to create a HTML page
    // "say-hello-jsp" --> sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello"; //This will return sayHello.jsp
    }

}
