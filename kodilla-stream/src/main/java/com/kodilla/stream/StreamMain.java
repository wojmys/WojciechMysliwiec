package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("Life Is Beautiful",(i)->i.toLowerCase()));
        System.out.println(poemBeautifier.beautify("life is a bitch",(i)->i.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Life Is Beautiful",(i)->i+" isn't it?"));
        };
    }


