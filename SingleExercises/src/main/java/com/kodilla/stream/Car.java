package com.kodilla.stream;

public class Car {

    private String mark;
    private String model;
    private int motorCapacity;
    private double price;

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getMotorCapacity() {
        return motorCapacity;
    }

    public double getPrice() {
        return price;
    }

    public Car(String mark, String model, int motorCapacity, double price) {
        this.mark = mark;
        this.model = model;
        this.motorCapacity = motorCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return mark + ", " +
                 model + ", " +
                 motorCapacity +", "+
                 price
                ;
    }
}
