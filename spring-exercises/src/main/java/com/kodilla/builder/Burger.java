package com.kodilla.builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private Bread bread;
    private Meat meat;
    private List<Ingredient> ingredients = new ArrayList<>();

    private Burger(Bread bread, Meat meat, List<Ingredient> ingredients) {
        this.bread = bread;
        this.meat = meat;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BurgerBuilder {
        private Bread bread;
        private Meat meat;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BurgerBuilder setBread(Bread bread) {
            this.bread = bread;
            return this;
        }

        public BurgerBuilder setMeat(Meat meat) {
            this.meat = meat;
            return this;
        }

        public BurgerBuilder setIngredients(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Burger build() {
            return new Burger(bread, meat, ingredients);
        }


    }
    @Override
    public String toString() {
        return "Burger{" +
                "bread=" + bread +
                ", meat=" + meat +
                ", ingredients=" + ingredients +
                '}';
    }
}
