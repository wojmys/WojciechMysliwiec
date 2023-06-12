package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private static List<Task> listOfTasks = new ArrayList<>();

    public static List<Task> getListOfTasks() {
        return listOfTasks;
    }
}
