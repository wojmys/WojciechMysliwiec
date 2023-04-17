package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {


    @Test
    void testGetAverage(){

        //given
        int[] intArray = new int[] {10,1,3,2,4,6,77,98,101,22,34,67,88,1,23,1,2,4,7,23};

        //when
        double actual = ArrayOperations.getAverage(intArray);

        //then

        Assertions.assertEquals(28.7,actual);

    }



}
