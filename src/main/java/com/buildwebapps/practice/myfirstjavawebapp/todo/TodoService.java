package com.buildwebapps.practice.myfirstjavawebapp.todo;

import java.time.LocalDate;
import java.util.List;


public class TodoService {
    private static List<Todo> todos;
    static{
        todos.add(new Todo(1,"Diego","Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2,"Diego","Learn DevOps",LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3,"Diego","Learn Full Stack Development",LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
