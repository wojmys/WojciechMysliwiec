package com.kodilla.patterns.factory;

public class Rectangle implements Shape {

    private String name;
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }
}
