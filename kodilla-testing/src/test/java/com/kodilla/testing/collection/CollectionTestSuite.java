package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("should return an empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer>actualList=exterminator.exterminate(testList);
        //Then
        Assertions.assertEquals(emptyList,actualList);
    }

    @DisplayName("should return a list with only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(10);
        expectedResult.add(22);


        List<Integer> testList = new ArrayList<>();
        testList.add(2);
        testList.add(5);
        testList.add(10);
        testList.add(22);
        testList.add(17);
        testList.add(123);

        //When
        List<Integer>expectedList=exterminator.exterminate(testList);
        //Then
        Assertions.assertEquals(expectedResult,expectedList);
    }


}
