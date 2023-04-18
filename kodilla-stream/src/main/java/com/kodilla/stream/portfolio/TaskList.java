package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class TaskList {

    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean removeTask(Task task){
        return tasks.remove(task);
    }
    public List<Task>getTasks(){
        return new LinkedList<>(tasks);

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskList taskList = (TaskList) o;

        if (tasks != null ? !tasks.equals(taskList.tasks) : taskList.tasks != null) return false;
        return Objects.equals(name, taskList.name);
    }

    @Override
    public int hashCode() {
        int result = tasks != null ? tasks.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
