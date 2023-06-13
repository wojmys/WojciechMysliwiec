package com.kodilla.patterns.builder.bigmac;

public class App {
    public static void main(String[] args) {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bread(Bread.BUN)
                .sauce(Sauce.BARBECUE)
                .burgers(2)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BACON)
                .build();
        System.out.println(bigmac);
    }
}
