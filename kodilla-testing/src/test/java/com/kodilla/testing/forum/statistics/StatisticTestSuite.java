package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

    @Mock
    private Statistics statisticsMock;

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests." + "\n");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter + "\n");
    }

    @Test
    public void testCalculateAdvStatisticsByNoneComments(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        usersList.add("Adam");
        usersList.add("Borys");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0,builder.getNumberOfComments());

    }

    @Test
    public void testCalculateAdvStatisticsByNonePosts(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        usersList.add("Adam");
        usersList.add("Borys");
        usersList.add("John");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0,builder.getNumberOfPosts());

    }

    @Test
    public void testCalculateAdvStatisticsBy1000Posts(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        usersList.add("Adam");
        usersList.add("Borys");
        usersList.add("John");
        usersList.add("Anthony");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(1000,builder.getNumberOfPosts());

    }


    @Test
    public void testCalculateAdvStatisticsIfCommentsLessThanPosts(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        usersList.add("Adam");
        usersList.add("Borys");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(22);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(10,builder.getNumberOfComments());

    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsMoreThanPosts(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        usersList.add("Adam");
        usersList.add("Borys");
        usersList.add("Adam2");
        usersList.add("Borys2");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(22);
        when(statisticsMock.commentsCount()).thenReturn(789);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(789,builder.getNumberOfComments());


    }
    @Test
    public void testCalculateAdvStatisticsByNoneUsers(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();


        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0,builder.getNumberOfUsers());

    }
    @Test
    public void testCalculateAdvStatisticsBy100Users(){
        //given
        StatisticBuilder builder = new StatisticBuilder(statisticsMock);
        List<String>usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("Name "+i);

        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1200);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //when
        builder.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(100,builder.getNumberOfUsers());

    }

}
