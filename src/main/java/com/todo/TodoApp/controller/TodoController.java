package com.todo.TodoApp.controller;

import com.todo.TodoApp.data.MyDatabase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private MyDatabase myDatabase = new MyDatabase();

    @GetMapping("/Task/{id}")
    public String createTask(@PathVariable String id){
        return myDatabase.readTask(id);
    }
}
