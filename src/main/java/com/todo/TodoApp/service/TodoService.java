package com.todo.TodoApp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.todo.TodoApp.data.TodoRepository;
import com.todo.TodoApp.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<TodoItem> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }
    @Override
    public Optional <TodoItem> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(TodoItem todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todoRepository.save(new TodoItem(name, desc, targetDate, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < TodoItem > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(TodoItem todo) {
        todoRepository.save(todo);
    }
}