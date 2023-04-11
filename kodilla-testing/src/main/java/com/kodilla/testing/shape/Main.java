package com.kodilla.testing.shape;

public class Main {

    public static void main(String[] args) {
        try {
            ShapeCollector sc = new ShapeCollector();

            sc.addShape(new Triangle(10, 5));
            sc.addShape(new Circle(5));
            sc.addShape(new Rectangle(45, 50));

            System.out.println(sc.getAllShapes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
