package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //given
        User user1 = new Millenials("Teddy Bear");
        User user2 = new YGeneration("Larry Dale");
        User user3 = new ZGeneration("Anna Haberstroh");

        //when
        String actual1 = user1.sharePost();
        String actual2 = user2.sharePost();
        String actual3 = user3.sharePost();

        //then
        assertEquals("Published on Snapchat",actual1);
        assertEquals("Published on Twitter",actual2);
        assertEquals("Published on Facebook",actual3);
    }

    @Test
    void testIndividualSharingStrategy() {

        //given
        User user = new Millenials("Mill");

        //when
        user.changeSocialPublisher(new TwitterPublisher());
        String actual =user.sharePost();

        //then
        assertEquals("Published on Twitter",actual);

    }

}
