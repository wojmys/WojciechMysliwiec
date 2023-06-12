package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        TaskList.getListOfTasks().add(this);
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: "+taskName);
        if(isTaskExecuted()){
            System.out.println("Task does not exist");
        } else{
            System.out.println("Task executed");
            TaskList.getListOfTasks().remove(this);
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {

        for (Task task : TaskList.getListOfTasks()) {
            if (task.getTaskName().equals(taskName)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaintingTask that = (PaintingTask) o;

        if (!Objects.equals(taskName, that.taskName)) return false;
        if (!Objects.equals(color, that.color)) return false;
        return Objects.equals(whatToPaint, that.whatToPaint);
    }

    @Override
    public int hashCode() {
        int result = taskName != null ? taskName.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (whatToPaint != null ? whatToPaint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                '}';
    }
}
