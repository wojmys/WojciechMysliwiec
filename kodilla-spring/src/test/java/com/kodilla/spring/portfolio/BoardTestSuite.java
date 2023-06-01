package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {


        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");

        //When
        //Then
        toDoList.tasks.add("task1");
        inProgressList.tasks.add("task2");
        doneList.tasks.add("task3");

        System.out.println(toDoList.tasks.get(0));
        System.out.println(inProgressList.tasks.get(0));
        System.out.println(doneList.tasks.get(0));


    }

}
