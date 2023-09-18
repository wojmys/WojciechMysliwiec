package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    void basicPizzaOrderTestGetCost(){
        //given
        BasicPizzaOrder theOrder = new BasicPizzaOrder();
        //when
        BigDecimal cost = theOrder.getTotalCost();
        //
        assertEquals(new BigDecimal(15),cost);
    }

    @Test
    void basicPizzaOrderTestGetIngredients(){
        //given
        BasicPizzaOrder theOrder = new BasicPizzaOrder();
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("Ingredients: Bottom, tomato sauce, cheese", ingredients);

    }

    @Test
    void pepperoniPizzaOrderTestGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaOrder(theOrder);
        //when
        BigDecimal cost = theOrder.getTotalCost();
        //
        assertEquals(new BigDecimal(17),cost);
    }
    @Test
    void pepperoniPizzaOrderTestGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniPizzaOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //
       assertEquals("Ingredients: Bottom, tomato sauce, cheese, pepperoni", ingredients);
    }

    @Test
    void salamiPizzaOrderTestGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrder(theOrder);
        //when
        BigDecimal cost = theOrder.getTotalCost();
        //
        assertEquals(new BigDecimal(25),cost);
    }
    @Test
    void salamiPizzaOrderTestGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //
        assertEquals("Ingredients: Bottom, tomato sauce, cheese, salami, onion", ingredients);
    }
    @Test
    void salamiPizzaAndExtraCheeseWithTabascoOrderTestGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrder(theOrder);
        theOrder = new TabascoOrder(theOrder);
        //when
        BigDecimal cost = theOrder.getTotalCost();
        //
        assertEquals(new BigDecimal(28),cost);
    }
    @Test
    void salamiPizzaAndExtraCheeseWithTabascoOrderTestGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrder(theOrder);
        theOrder = new TabascoOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //
        assertEquals("Ingredients: Bottom, tomato sauce, cheese, salami, onion, tabasco", ingredients);
    }
}
