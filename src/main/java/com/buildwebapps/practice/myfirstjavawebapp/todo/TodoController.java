package com.buildwebapps.practice.myfirstjavawebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name") // This is to tell Spring to keep the name in the session
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value="list-todos") // This is the method that will be called when the form is submitted
    public String listAllTodos(ModelMap model){
        List<Todo> todos = todoService.findByUsername("Diego");
        model.addAttribute("todos", todos); // This is the data that will be passed to the Todos page
        return "listTodos";
    }
}
