package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {


    @Test
    void testExceptionHandling() {

        //given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //when&then
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(1.99,2.5));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(200,-2.5));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(1.2,0));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(1,1));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(5,-1000));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(2,1.6));
        Assertions.assertDoesNotThrow(()->exceptionHandling.secondChallengeMethodHandled(1,1.4));

    }


}
