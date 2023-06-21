package com.kodilla.builder;

public class Order {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .bottom("Bottom")
                .sauce("Barbecue")
                .ingredients("Cheese")
                .ingredients("Tomato")
                .ingredients("Onion")
                .build();

        System.out.println(pizza);
    }
}
