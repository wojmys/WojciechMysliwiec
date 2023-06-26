//package com.kodilla.hibernate.invoice;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//
//@Entity
//@Table(name="PRODUCTS")
//public class Product {
//
//    private int id;
//    private String name;
//
//    public Product() {
//    }
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name = "ID", unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @NotNull
//    @Column(name = "NAME")
//    public String getName() {
//        return name;
//    }
//
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//
//}
