package com.example.springexercises.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Calculator {

    @Autowired
    private Display display;

//    @Autowired
//    public Calculator(Display display) {
//        this.display = display;
//    }

    public double add(double a, double b) {

        display.displayValue(a + b);
        return a + b;
    }

    public double sub(double a, double b) {

        display.displayValue(a - b);
        return a - b;
    }

    public double mul(double a, double b) {
        if (a == 0 || b == 0) {
            display.displayValue(0);
            return 0;
        } else {
            display.displayValue(a * b);
            return a * b;
        }
    }

    public double div(double a, double b) {
        if (a == 0 || b == 0) {
            display.displayValue(0);
            return 0;
        } else {
            display.displayValue(a / b);
            return a / b;
        }
    }
}
