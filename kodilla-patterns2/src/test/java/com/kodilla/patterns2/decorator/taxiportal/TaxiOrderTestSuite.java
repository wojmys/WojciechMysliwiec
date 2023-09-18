package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class TaxiOrderTestSuite {

    @Test
    void testBasicTaxiOrderGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        Assertions.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    void testBasicTaxiOrderGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String description = theOrder.getDescription();
        ;
        //then
        Assertions.assertEquals("Drive a course", description);
    }

    @Test
    void testTaxiNetworkGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
    BigDecimal theCost = theOrder.getCost();
    //then
        Assertions.assertEquals(new BigDecimal(40),theCost);
    }

    @Test
    void testTaxiNetworkGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        Assertions.assertEquals("Drive a course by Taxi Network", description);
    }
    @Test
    void testMyTaxiWithChildSeatGetCost(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder=new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        Assertions.assertEquals(new BigDecimal(37),theCost);
    }

    @Test
    void testMyTaxiWithChildSeatGetDescription(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder=new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder=new ChildSeatDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by MyTaxi Network + child seat",description);

    }
    @Test
    public void testUberWithTwoChildSeatsGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(57), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by Taxi Network express service variant VIP + child seat", description);
    }
}
