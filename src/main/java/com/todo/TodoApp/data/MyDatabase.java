package com.todo.TodoApp.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDatabase implements MyDb{

    public MyDatabase(@Value("${database.url}")String url){
        System.out.println("MyDatabase Initialized....:"+ url);
    }
    public String readTask(String id){
        //mydb.retrieve(task)
        return "My DB 1 here is a the task:" +id;
    }
}
