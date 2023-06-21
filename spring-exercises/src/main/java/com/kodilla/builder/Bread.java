package com.kodilla.builder;

public enum Bread {

    WHEAT_BREAD(2.10),
    DARK_BROWN_BREAD(2.30);

    private double price;

    Bread(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "price=" + price +
                '}';
    }
}
