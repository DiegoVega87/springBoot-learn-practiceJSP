package com.buildwebapps.practice.myfirstjavawebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static{
        todos.add(new Todo(1,"Diego","Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2,"Diego","Learn DevOps",LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3,"Diego","Learn Full Stack Development",LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String name, String desc, LocalDate targetDate, boolean isDone){
        todos.add(new Todo(todos.size()+1, name, desc, targetDate, isDone));
    }

    public void deleteById(int id){
        todos.removeIf(todo -> todo.getId() == id); // This is a lambda expression to remove the todo item with the given id
    }

    public Todo findById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
