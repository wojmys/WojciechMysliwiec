package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNumberOfIngredients() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bread(Bread.BUN)
                .sauce(Sauce.BARBECUE)
                .burgers(2)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BACON)
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }

    @Test
    void testReturnCorrectValues() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bread(Bread.ROLL)
                .sauce(Sauce.BARBECUE)
                .burgers(2)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.BACON)
                .build();
        //When
        Bread bread = Bread.ROLL;
        Bread actualBread = bigmac.getBread();
        Sauce sauce = Sauce.BARBECUE;
        Sauce sauceActual = bigmac.getSauce();
        Ingredient onion = Ingredient.ONION;
        Ingredient ingredientActual = bigmac.getIngredients().get(0);
        Ingredient bacon = Ingredient.BACON;
        Ingredient ingredientActual2 = bigmac.getIngredients().get(1);

        //Then
        assertEquals(bread, actualBread);
        assertEquals(sauce, sauceActual);
        assertEquals(onion, ingredientActual);
        assertEquals(bacon, ingredientActual2);

    }
}
