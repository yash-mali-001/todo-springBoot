package com.beingDev.todoWebApp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

// Bean  to store the details of the todo list
// we need to store such fields in todo app in database eg MySQL
//@Size is a type of validation used on string inputs

public class Todo {
    private int id;
    private String userName;
    @Size(min = 10, message = "Enter More than 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo(boolean done, LocalDate targetDate, String description, String userName, int id) {
        this.done = done;
        this.targetDate = targetDate;
        this.description = description;
        this.userName = userName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
