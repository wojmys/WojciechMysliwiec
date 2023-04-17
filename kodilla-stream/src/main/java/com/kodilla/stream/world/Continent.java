package com.kodilla.stream.world;


import java.util.HashSet;

import java.util.Set;


public final class Continent {

   private String name;


    private Set<Country> countries = new HashSet<>();

    public Continent() {

    }

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Country> getCountries() {
        return new HashSet<>(countries);
    }

    public void addCountry(Country country){
        countries.add(country);
    }

}
