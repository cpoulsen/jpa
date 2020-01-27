package com.cpo.todoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {

   @Autowired
   private TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }

    @PostMapping("/todo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @PutMapping("/todo/{id}")
    public void updateTodo(@RequestBody Todo todo, @PathVariable Long id) {
        todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
