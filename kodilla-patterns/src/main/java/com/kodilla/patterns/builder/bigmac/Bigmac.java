package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private Bread bread;
    private Sauce sauce;
    private int burgers;
    private List<Ingredient> ingredients;

    private Bigmac(Bread bread, Sauce sauce, int burgers, List<Ingredient> ingredients) {
        this.bread = bread;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public Bread getBread() {
        return bread;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private Bread bread;
        private Sauce sauce;
        private int burgers;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bread(Bread bread){
            this.bread=bread;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce){
            this.sauce=sauce;
            return this;
        }

        public BigmacBuilder burgers(int numberOfBurgers){
            this.burgers=numberOfBurgers;
            return this;
        }

        public BigmacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bread, sauce,burgers,ingredients);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bread=" + bread +
                ", sauce=" + sauce +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
