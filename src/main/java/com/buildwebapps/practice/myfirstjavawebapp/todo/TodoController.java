package com.buildwebapps.practice.myfirstjavawebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
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

    @RequestMapping(value="add-todo", method = RequestMethod.GET) // This is the method that will be called when the form is submitted
    public String showNewTodoPage(){
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST) // This is the method that will be called when the form is submitted
    public String addNewTodoPage(@RequestParam String description, ModelMap model){
        String username = (String) model.get("name");
        todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
