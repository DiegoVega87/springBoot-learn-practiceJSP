package com.buildwebapps.practice.myfirstjavawebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    @RequestMapping(value="list-todos") // This is the method that will be called when the form is submitted
    public String listAllTodos(){
        return "listTodos";
    }
}
