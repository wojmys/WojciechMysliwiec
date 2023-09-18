package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaOrder extends AbstractPizzaOrderDecorator {
    public PepperoniPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalCost() {
        return super.getTotalCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", pepperoni";
    }
}
