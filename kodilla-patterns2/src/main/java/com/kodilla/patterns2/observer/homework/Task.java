package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String owner;
    private final String description;

    public Task(String owner, String description) {
        this.owner = owner;
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }
}
