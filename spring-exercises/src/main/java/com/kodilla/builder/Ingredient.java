package com.kodilla.builder;

public enum Ingredient {

    CUCUMBER("Cucumber",2.0),
    ONION("Onion",1.2),
    CHEESE("Cheese",1.1),
    BACON("Bacon", 1.7),
    EGG("Egg",1.8);

    private String name;
    private double price;


    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                name + '\'' +
                ", price=" + price +
                '}';
    }
}
