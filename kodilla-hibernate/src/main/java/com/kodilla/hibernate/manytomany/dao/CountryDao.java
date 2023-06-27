package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CountryDao extends CrudRepository<Country, Integer> {

    @Query
    List<Country> retrieveCountryByName(@Param("NAME")String name);

    @Query
    List<Country>retrieveCountryByPopulationNumber(@Param("POPULATION")int population);

    @Query
    List<Country>retrieveCountryByCapital(@Param("CAPITAL")String capital);
}
