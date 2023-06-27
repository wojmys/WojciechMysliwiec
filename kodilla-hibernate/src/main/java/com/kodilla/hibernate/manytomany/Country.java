package com.kodilla.hibernate.manytomany;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@NamedQueries({

        @NamedQuery(
                name = "Country.retrieveCountryByName",
                query = "FROM Country WHERE name= :NAME"
        ),
        @NamedQuery(
                name= "Country.retrieveCountryByPopulationNumber",
                query= "FROM Country WHERE population= :POPULATION"
        ),
        @NamedQuery(
                name= "Country.retrieveCountryByCapital",
                query= "FROM Country WHERE capital= :CAPITAL"
        )
})
@Entity
@Table(name = "COUNTRIES")
public class Country {


    private int id;
    private String name;
    private int population;
    private String capital;

    public Country() {
    }

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    @NotNull
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COUNTRY_NAME")
    public String getName() {
        return name;
    }

    @NotNull
    @Column(name = "POPULATION")
    public int getPopulation() {
        return population;
    }

    @NotNull
    @Column(name = "CAPITAL")
    public String getCapital() {
        return capital;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPopulation(int population) {
        this.population = population;
    }

    private void setCapital(String capital) {
        this.capital = capital;
    }
}
