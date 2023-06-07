package com.kodilla.spring.c;

import com.kodilla.spring.calculator.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calc {

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
}
