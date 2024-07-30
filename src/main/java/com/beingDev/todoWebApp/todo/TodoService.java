package com.beingDev.todoWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(false, LocalDate.now().plusMonths(6), "Learn Spring ", "Yash", ++todosCount));
        todos.add(new Todo(false, LocalDate.now().plusMonths(3), "Learn Java ", "Yash", ++todosCount));
        todos.add(new Todo(false, LocalDate.now().plusMonths(7), "Learn Spring  boot", "Yash", ++todosCount));
    }

    public List<Todo> findByUsername(String userName) {
        Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(userName);
        return todos.stream().filter(predicate).toList();
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(false, targetDate, description, username, ++todosCount);
        todos.add(todo);
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // lambda function  todo->todo.getId() == id;
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
