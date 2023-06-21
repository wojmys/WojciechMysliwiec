package com.kodilla.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = new Burger.BurgerBuilder()
                .setMeat(Meat.BEEF)
                .setBread(Bread.DARK_BROWN_BREAD)
                .setIngredients(Ingredient.ONION)
                .setIngredients(Ingredient.CHEESE)
                .setIngredients(Ingredient.ONION)
                .setIngredients(Ingredient.CUCUMBER)
                .build();

        System.out.println(burger1);
    }





}
