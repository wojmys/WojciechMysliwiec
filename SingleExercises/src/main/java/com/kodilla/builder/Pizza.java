package com.kodilla.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String bottom;
    private String sauce;
    private List<String> ingredients= new ArrayList<>();

    private Pizza(String bottom, String sauce, List<String> ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class PizzaBuilder{

        private String bottom;
        private String sauce;
        private List<String>ingredients=new ArrayList<>();

        public PizzaBuilder bottom(String bottom){
            this.bottom=bottom;
            return this;
        }

        public PizzaBuilder sauce (String sauce){
            this.sauce=sauce;
            return this;
        }

        public PizzaBuilder ingredients(String ingredient){
            ingredients.add(ingredient);
            return this;

        }

        public Pizza build(){
            return new Pizza(bottom,sauce,ingredients);
        }

    }

}
