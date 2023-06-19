package com.example.springexercises.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ForumUserTestSuite {

    @Autowired
    ForumUser forumUser;

    @Test
    void testGetUsername(){

        //givvn
        //when

        String actual = forumUser.getUserName();
        //then

        Assertions.assertEquals("John Smith",actual);



    }
}
