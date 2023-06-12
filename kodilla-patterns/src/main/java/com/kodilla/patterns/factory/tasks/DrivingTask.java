package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

        DrivingTask that = (DrivingTask) o;

        if (!Objects.equals(taskName, that.taskName)) return false;
        if (!Objects.equals(where, that.where)) return false;
        return Objects.equals(using, that.using);
    }

    @Override
    public int hashCode() {
        int result = taskName != null ? taskName.hashCode() : 0;
        result = 31 * result + (where != null ? where.hashCode() : 0);
        result = 31 * result + (using != null ? using.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }
}
