package com.kodilla.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTestSuite {

    ShapeFactory shapeFactory = new ShapeFactory();

    @Test
    void factoryTest(){

        //given
        //when
        Shape shape = shapeFactory.introduceShape(2);
        String actual=shape.introduceYourself();

        //then
        Assertions.assertEquals("Triangle",actual);

    }
}
