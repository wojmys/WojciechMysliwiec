package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {

        //given
        Product chair = new Product("Chair");
        Product fridge = new Product("Fridge");
        productDao.save(chair);
        productDao.save(fridge);

        //zmien na konstruktory
        Item itemChair = new Item(chair,new BigDecimal(50), 2, new BigDecimal(100));
        Item itemFridge = new Item(fridge,new BigDecimal(2550), 1, new BigDecimal(2550));
        Invoice invoice = new Invoice("123");
        invoice.getItems().add(itemChair);
        invoice.getItems().add(itemFridge);


        //when
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //then
        Assertions.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
