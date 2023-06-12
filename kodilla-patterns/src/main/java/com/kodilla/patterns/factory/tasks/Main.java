package com.kodilla.patterns.factory.tasks;

public class Main {
    public static void main(String[] args) {

        TaskFactory taskFactory = new TaskFactory();

        Task task = taskFactory.makeTask(TaskFactory.DRIVING);

        Task task2=taskFactory.makeTask(TaskFactory.PAINTING);
        Task task3 = taskFactory.makeTask(TaskFactory.SHOPPING);

        System.out.println(TaskList.getListOfTasks());

        task.executeTask();
        task2.executeTask();
        task3.executeTask();

        System.out.println("************************");

        System.out.println(TaskList.getListOfTasks());


    }
}
