package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseOrder extends AbstractPizzaOrderDecorator {
    public ExtraCheeseOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalCost() {
        return super.getTotalCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", extra Cheese";
    }

}
