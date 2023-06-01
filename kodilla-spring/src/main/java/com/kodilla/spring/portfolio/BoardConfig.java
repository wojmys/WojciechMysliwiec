package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


//    @Bean
//    public Board getBoard(){
//        return new Board();
//    }

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
