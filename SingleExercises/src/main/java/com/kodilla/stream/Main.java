package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        DealerStore dealerStore = DealerStore.INSTANCE;

        List<Car> cars = dealerStore.getGarage().stream()
                .filter(s->s.getMotorCapacity()>1200)
                .filter(s->s.getMotorCapacity()<1705)
                .filter(p->p.getPrice()<5000)
                .collect(Collectors.toList());

        cars.stream()
                .forEach(System.out::println);
    }
}
