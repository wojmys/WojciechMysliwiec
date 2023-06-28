package com.kodilla.hibernate.manytomany;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "COUNTRIES")
public class Country {

    @NotNull
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "COUNTRY_NAME")
    private String name;

    @NotNull
    @Column(name = "POPULATION")
    private int population;

    @NotNull
    @Column(name = "CAPITAL")
    private String capital;

    public Country() {
    }

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

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

    @Override
    public String toString() {
        return name;
    }
}
