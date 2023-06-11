package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {

        //given
        Logger logger = Logger.LOG;
        logger.log("log1");
        logger.log("log2");
        logger.log("log1234");

        //when
        String actual = logger.getLastLog();

        //then
        Assertions.assertEquals("log1234", actual);
    }

    @Test
    void testIfLogsHaveSameInstance(){

        //given
        Logger logger = Logger.LOG;
        logger.log("log 11");
        Logger logger2 = Logger.LOG;
        logger2.log("log 22");

        //when
        String actual = logger.getLastLog();
        String actual2 = logger2.getLastLog();

        //then
        Assertions.assertTrue(logger==logger2);
    }

}
