package com.todo.TodoApp.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.TodoApp.model.TodoItem;

public interface TodoRepository extends JpaRepository < TodoItem, Long > {
    List < TodoItem > findByUserName(String user);
}