package com.todo.TodoApp.controller;

import com.sun.istack.NotNull;
import com.todo.TodoApp.data.MyDb;
import com.todo.TodoApp.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
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
