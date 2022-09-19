package com.todo.TodoApp.service;

import com.todo.TodoApp.model.TodoItem;

import java.util.Date;

import java.util.List;
import java.util.Optional;

public interface ITodoService {

    List <TodoItem> getTodosByUser(String user);

    Optional < TodoItem > getTodoById(long id);

    void updateTodo(TodoItem todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(TodoItem todo);
}

