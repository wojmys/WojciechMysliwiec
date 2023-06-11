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
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoLIst() {

        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressLIst() {

        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getDoneLIst() {
        return new TaskList();
    }

}
