package com.todo.TodoApp.controller;

import com.todo.TodoApp.data.MyDatabase;
import com.todo.TodoApp.data.MyDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    public TodoController(@Autowired MyDb myDatabase) {
        this.myDatabase = myDatabase;
    }

    private MyDb myDatabase;

    @GetMapping("/Task/{id}")
    public String createTask(@PathVariable String id){
        return myDatabase.readTask(id);
    }

    //POST /tasks
    //GET /tasks
    //GET /tasks/{id}
    //DELETE /tasks/{id}
    //PUT
    //PATCH
}
