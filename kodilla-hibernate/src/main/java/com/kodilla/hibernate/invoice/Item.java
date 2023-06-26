//package com.kodilla.hibernate.invoice;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//
//import java.math.BigDecimal;
//
//
//@Entity
//@Table(name = "ITEMS")
//public class Item {
//
//    private int id;
//    private Product product;
//    private BigDecimal price;
//    private int quantity;
//    private BigDecimal value;
//    private Invoice invoice;
//
//    public Item() {
//    }
//
//    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
//        this.product = product;
//        this.price = price;
//        this.quantity = quantity;
//        this.value = value;
//    }
//
//    @Id
//    @NotNull
//    @GeneratedValue
//    @Column(name = "ID",unique = true)
//    public int getId() {
//        return id;
//    }
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "PRODUCT_ID")
//    public Product getProduct() {
//        return product;
//    }
//
//    @NotNull
//    @Column(name = "PRICE")
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    @NotNull
//    @Column(name = "QUANTITY")
//    public int getQuantity() {
//        return quantity;
//    }
//
//    @NotNull
//    @Column(name = "VALUE")
//    public BigDecimal getValue() {
//        return value;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "INVOICE_ID")
//    public Invoice getInvoice() {
//        return invoice;
//    }
//
//    public void setInvoice(Invoice invoice) {
//        this.invoice = invoice;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    private void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    private void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    private void setValue(BigDecimal value) {
//        this.value = value;
//    }
//}
