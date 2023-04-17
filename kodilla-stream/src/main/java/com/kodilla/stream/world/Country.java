package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private String countryName;
    private final BigDecimal peopleQuantity;


    public Country(final String name,final BigDecimal peopleQuantity) {
        this.countryName = name;
        this.peopleQuantity = peopleQuantity;
    }

    public Country(final BigDecimal peopleQuantity) {

        this.peopleQuantity =  peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
