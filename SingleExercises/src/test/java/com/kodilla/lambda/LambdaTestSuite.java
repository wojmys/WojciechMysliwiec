package com.kodilla.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LambdaTestSuite {

    @Test
    void addTest() {

        //given
        MathExpresion mathExpresion = new MathExpresion();

        //when
        double actual = mathExpresion.executeExpresion(2,3,(a,b)->a+b);



        //then
        Assertions.assertEquals(5,actual);
    }


}
