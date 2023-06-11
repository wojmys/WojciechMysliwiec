package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testTaskAdd() {

        //given
        TaskList doneList = board.getDoneList();
        TaskList inProgressList = board.getInProgressList();
        TaskList toDoList = board.getToDoList();

        //when
        doneList.getTasks().add("Task1");
        inProgressList.getTasks().add("Task2");
        toDoList.getTasks().add("Task3");

        //then
        Assertions.assertEquals(1,doneList.getTasks().size());
        Assertions.assertEquals(1,inProgressList.getTasks().size());
        Assertions.assertEquals(1,toDoList.getTasks().size());

    }

}
