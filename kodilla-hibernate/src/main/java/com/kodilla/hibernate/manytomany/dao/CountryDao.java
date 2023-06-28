package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Country;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CountryDao extends CrudRepository<Country, Integer> {

    @Query(value = "SELECT u FROM Country u")
    List<Country> findAllCountries(Sort sort);

    @Query( value="FROM Country WHERE name= :NAME")
    List<Country> retrieveCountryByName(@Param("NAME")String name);

    @Query(value="FROM Country WHERE population= :POPULATION")
    List<Country>retrieveCountryByPopulationNumber(@Param("POPULATION")int population);

    @Query(value = "FROM Country WHERE capital= :CAPITAL")
    List<Country>retrieveCountryByCapital(@Param("CAPITAL")String capital);
}
