package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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

        ShoppingTask that = (ShoppingTask) o;

        if (Double.compare(that.quantity, quantity) != 0) return false;
        if (!Objects.equals(taskName, that.taskName)) return false;
        return Objects.equals(whatToBuy, that.whatToBuy);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = taskName != null ? taskName.hashCode() : 0;
        result = 31 * result + (whatToBuy != null ? whatToBuy.hashCode() : 0);
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
