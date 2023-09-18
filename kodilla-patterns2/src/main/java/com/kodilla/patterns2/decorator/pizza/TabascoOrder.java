package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TabascoOrder extends AbstractPizzaOrderDecorator{
    public TabascoOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalCost() {
        return super.getTotalCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", tabasco";
    }
}
