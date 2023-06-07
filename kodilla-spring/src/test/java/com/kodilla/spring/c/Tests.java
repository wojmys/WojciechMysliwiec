package com.kodilla.spring.c;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Tests {

    @Autowired
    Calc calc;

    @Test
            void test1(){

        double result = calc.add(2,2);
        Assertions.assertEquals(4,result);
    }







}
