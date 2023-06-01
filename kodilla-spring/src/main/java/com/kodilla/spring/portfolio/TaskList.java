package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
}
