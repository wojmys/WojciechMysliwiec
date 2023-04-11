package com.kodilla.testing.shape;

import com.kodilla.Main;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {


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

    @Nested
    @DisplayName("Tests for Shape methods")
    class ShapeMethods {


        @Test
        @DisplayName("return type of Shape")
        void testGetShapeName() {
            //Given
            Triangle triangle = new Triangle(23, 6);
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(3, 6);

            //When
            String triangleActual = triangle.getShapeName();
            String circleActual = circle.getShapeName();
            String rectangleActual = rectangle.getShapeName();

            String triangleExpected = "Triangle";
            String circleExpected = "Circle";
            String rectangleExpected = "Rectangle";

            //Then
            Assertions.assertEquals(triangleExpected, triangleActual);
            Assertions.assertEquals(circleExpected, circleActual);
            Assertions.assertEquals(rectangleExpected, rectangleActual);


        }

        @Test
        @DisplayName("return Shape's area")
        void testGetField() {
            //given
            Triangle triangle = new Triangle(40, 60);
            Circle circle = new Circle(7);
            Rectangle rectangle = new Rectangle(3, 6);


            //when
            double triangleExpected = 1200;
            double triangleActual = triangle.getField();

            double circleExpected = 49 * Math.PI;
            double circleActual = circle.getField();

            double rectangleExpected = 3 * 6;
            double rectangleActual = rectangle.getField();


            //then
            Assertions.assertEquals(triangleExpected, triangleActual);
            Assertions.assertEquals(circleExpected, circleActual);
            Assertions.assertEquals(rectangleExpected, rectangleActual);

        }

    }

    @Nested
    @DisplayName("Tests for ShapeCollector methods")
    class ShapeCollectorMethods {
        @Test
        @DisplayName("add Shape to the list")
        public void testAddShape() {

            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle  = new Circle(9);
            // when
            shapeCollector.addShape(circle);
            //then
            Assertions.assertTrue(shapeCollector.getShape(0)==circle);
        }

        @Test
        @DisplayName("remove Shape from the list")
        public void testRemoveShape() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(9);
            // when
            shapeCollector.addShape(circle);
            shapeCollector.removeShape(circle);
            //then
            Assertions.assertTrue(shapeCollector.isListEmpty());
        }

        @Test
        @DisplayName("get Shape by index")
        public void testGetShape() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(11);
            Triangle triangle  = new Triangle(10,6);
            // when
            shapeCollector.addShape(circle);
            shapeCollector.addShape(triangle);

            //then
            Assertions.assertTrue(shapeCollector.getShape(1)==triangle);
        }

        @Test
        @DisplayName("get all Shapes as single String")
        public void testGetAllShapes() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(11);
            Triangle triangle  = new Triangle(10,6);
            Rectangle rectangle = new Rectangle(10,22);
            // when
            shapeCollector.addShape(circle);
            shapeCollector.addShape(triangle);
            shapeCollector.addShape(rectangle);

            String expected="Circle, Triangle, Rectangle";
            String notExpected="Circle, Circle, Triangle";

            //then
            Assertions.assertEquals(expected,shapeCollector.getAllShapes());
            Assertions.assertNotEquals(notExpected,shapeCollector.getAllShapes());
        }
    }


}


