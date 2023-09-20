package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int tasksCounter;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasks studentTasks) {

        System.out.println(mentorName + " you have a new task in " + studentTasks.getName() + " to verify." + "\n" +
                "Total tasks awaiting verification: " + ++tasksCounter);
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTasksCounter() {
        return tasksCounter;
    }
}
