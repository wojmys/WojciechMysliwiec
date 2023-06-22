package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("in progress", "The list includes all in progress tasks");

        //When
        taskListDao.save(taskList);

        //Then
        String name = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(name);
        assertEquals(1, readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }

}
