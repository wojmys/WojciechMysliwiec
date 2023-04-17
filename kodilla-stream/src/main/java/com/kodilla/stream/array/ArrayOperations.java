package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import java.util.stream.IntStream;


public interface ArrayOperations {

    static double getAverage(int[] numbers) {


        List<Integer> list =  new ArrayList<>();
        for (int i : numbers)
        {
            list.add(i);
        }
        IntStream.range(0,list.size())
                .map(n->list.get(n))
                .forEach(System.out::println);


        OptionalDouble result= IntStream.range(0,list.size())
                .map(n->list.get(n))
                .average();


        return  result.getAsDouble();

    }

}
