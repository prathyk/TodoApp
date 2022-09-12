package com.todo.TodoApp.data;

import com.todo.TodoApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDb {
    public String readTask(String id);
}
