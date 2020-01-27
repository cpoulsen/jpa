package com.cpo.todoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public Optional<Todo> getTodo(Long id) {
        return todoRepository.findById(id);
    }

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void updateTodo(Long id, Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
