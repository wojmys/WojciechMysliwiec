package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @AfterEach
    void taskListReset() {
        TaskList.getListOfTasks().clear();
    }

    @Test
    void testCreateDrivingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        String taskName = drivingTask.getTaskName();

        //then
        assertEquals("Driving", taskName);
    }

    @Test
    void testCreatePaintingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        String taskName = paintingTask.getTaskName();

        //then
        assertEquals("Painting", taskName);
    }

    @Test
    void testCreateShoppingTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        String taskName = shoppingTask.getTaskName();

        //then
        assertEquals("Buy", taskName);
    }

    @Test
    void testTaskList() {

        //given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        Task drivingTask2 = taskFactory.makeTask(TaskFactory.DRIVING);

        int numberOfTasks = TaskList.getListOfTasks().size();
        //then
        assertEquals(4, numberOfTasks);
    }

    @Test
    void testExecuteTask() {

        //given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        Task drivingTask2 = taskFactory.makeTask(TaskFactory.DRIVING);

        shoppingTask.executeTask();
        drivingTask2.executeTask();
        int numberOfTasks = TaskList.getListOfTasks().size();

        //then
        assertEquals(2, numberOfTasks);
    }
}
