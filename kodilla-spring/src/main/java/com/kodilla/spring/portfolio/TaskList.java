package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {

    private List<String> tasks = new ArrayList<>();


    public List<String> getTasks() {
        return tasks;
    }
}
