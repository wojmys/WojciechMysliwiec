package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("John", "Title1", 2000, "Signature");
        Book book2 = new Book("John", "Title2", 2001, "Signature2");
        Book book3 = new Book("John", "Title3", 2002, "Signature3");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int result = medianAdapter.publicationYearMedian(bookSet);

        //then
        assertEquals(2001,result);
    }
}
