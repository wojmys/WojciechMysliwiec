package com.kodilla.factory;

public class ShapeFactory {


    public Shape introduceShape(int number) {

        if (number == 1) {
            return new Circle();
        } else if (number == 2) {
            return new Triangle();
        } else {
            return new Square();
        }
    }
}
