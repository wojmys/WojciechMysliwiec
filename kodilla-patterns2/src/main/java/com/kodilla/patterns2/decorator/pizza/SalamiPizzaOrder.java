package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaOrder extends AbstractPizzaOrderDecorator{
    public SalamiPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalCost() {
        return super.getTotalCost().add(new BigDecimal(10));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", salami, onion";
    }
}

