package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.List;

@SpringBootTest
public class CountryTestSuite {

    @Autowired
    private CountryDao countryDao;

    @Test
    void testCountryNamedQueries() {

        //given
        Country poland = new Country("Poland", 40000000, "Warsaw");
        Country germany = new Country("Germany", 85000000, "Berlin");
        Country russia = new Country("Russia", 150000000, "Moscow");
        Country france = new Country("France", 60000000, "Paris");
        //when
        countryDao.save(poland);
        int polandID = poland.getId();
        countryDao.save(germany);
        int germanyID = germany.getId();
        countryDao.save(russia);
        int russiaID = russia.getId();
        countryDao.save(france);
        int franceID = france.getId();
        List<Country> retrieveByNameList = countryDao.retrieveCountryByName("France");
        List<Country> retrieveCountryByPopulationList = countryDao.retrieveCountryByPopulationNumber(40000000);
        List<Country> retrieveCountryByCapital = countryDao.retrieveCountryByCapital("Moscow");

        String actual1=retrieveByNameList.get(0).getName();
        String actual2=retrieveCountryByPopulationList.get(0).getName();
        String actual3=retrieveCountryByCapital.get(0).getName();
        //then
        Assertions.assertEquals(1, retrieveByNameList.size());
        Assertions.assertEquals(1, retrieveCountryByPopulationList.size());
        Assertions.assertEquals(1,retrieveCountryByCapital.size());
        Assertions.assertEquals("France",actual1);
        Assertions.assertEquals("Poland",actual2);
        Assertions.assertEquals("Russia",actual3);


        //cleanUP
        countryDao.deleteById(polandID);
        countryDao.deleteById(germanyID);
        countryDao.deleteById(russiaID);
        countryDao.deleteById(franceID);


    }

    @Test
    void testCountryDao(){
        //given
        Country poland = new Country("Poland", 40000000, "Warsaw");
        Country germany = new Country("Germany", 85000000, "Berlin");
        Country russia = new Country("Russia", 150000000, "Moscow");
        Country france = new Country("France", 60000000, "Paris");
        //when
        countryDao.save(poland);
        int polandID = poland.getId();
        countryDao.save(germany);
        int germanyID = germany.getId();
        countryDao.save(russia);
        int russiaID = russia.getId();
        countryDao.save(france);
        int franceID = france.getId();

        List<Country>allCountries=countryDao.findAllCountries(JpaSort.unsafe("LENGTH(name)"));
        System.out.println(allCountries);
        //then
        Assertions.assertEquals(4,allCountries.size());

        //cleanUP
        countryDao.deleteById(polandID);
        countryDao.deleteById(germanyID);
        countryDao.deleteById(russiaID);
        countryDao.deleteById(franceID);
    }


}
