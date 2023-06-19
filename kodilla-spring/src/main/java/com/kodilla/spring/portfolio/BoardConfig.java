package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    Board board() {

        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    TaskList getToDoLIst() {

        return new TaskList();
    }

    @Bean(name = "inProgressList")
    TaskList getInProgressList() {

        return new TaskList();
    }

    @Bean(name = "doneList")
    TaskList getDoneList() {
        return new TaskList();
    }

}
