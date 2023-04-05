package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

//        Test1
        int result1 =calculator.add(2,5);

        if(result1==7){
            System.out.println("add() test OK");
        } else {
            System.out.println("add() test FAILED");
        }

//        Test2
        int result2 = calculator.subtract(100,99);
        if(result2==1){
            System.out.println("substract() test OK");
        } else {
            System.out.println("substract() test FAILED");
        }

        }






    }

