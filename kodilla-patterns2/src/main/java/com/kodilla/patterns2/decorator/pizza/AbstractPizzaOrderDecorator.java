package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder{
    private PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getTotalCost() {
        return pizzaOrder.getTotalCost();
    }

    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients();
    }
}
