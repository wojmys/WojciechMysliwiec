package com.kodilla.builder;

public enum Meat {

    CHICKEN(1.30),
    PORK(1.40),
    FISH(2.00),
    BEEF(2.50),
    MUTTON(1.70);

    private double price;

    Meat(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "price=" + price +
                '}';
    }
}
