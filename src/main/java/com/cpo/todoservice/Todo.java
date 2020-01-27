package com.cpo.todoservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private long id;
    private String description;
    private Boolean finished;

    public Todo() {

    }

    public Todo(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description  = description;
    }

    public Boolean isFinished() {
        return finished;
    }

    public void setFinish(Boolean finished) {
        this.finished = finished;
    }
}