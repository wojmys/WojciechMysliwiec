package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {

        //given
        // when

        double addResult=calculator.add(2,1.5);
        double subResult=calculator.sub(100,200);
        double mulResult=calculator.mul(100,25);
        double divResult=calculator.sub(3.2,1.2);

        //then
        Assertions.assertEquals(3.5,addResult);
        Assertions.assertEquals(-100,subResult);
        Assertions.assertEquals(2500,mulResult);
        Assertions.assertEquals(2,divResult);
    }
}
