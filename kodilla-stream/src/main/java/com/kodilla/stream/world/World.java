package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    Set<Continent> continentsSet = new HashSet<>();


   public void addContinent(Continent continent){
        continentsSet.add(continent);
    }

    public BigDecimal getPeopleQuantity(Set<Continent>continents){
       BigDecimal result = continents.stream()
               .flatMap(continent -> continent.getCountries().stream())
               .map(Country::getPeopleQuantity)
        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


       return result;
    }


    }





