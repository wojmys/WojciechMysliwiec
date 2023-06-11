package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //given
        int count=0;

        Library library = new Library("Library1");
        Book book1 = new Book("title1","author1",LocalDate.of(2001,02,01));
        Book book2 = new Book("title2","author2",LocalDate.of(2002,02,01));
        Book book3 = new Book("title3","author3",LocalDate.of(2003,02,01));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making clones
        Library shallowCloneLibrary=null;
        try{
            shallowCloneLibrary=library.shallowCopy();
            shallowCloneLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCloneLibrary=null;
        try{
            deepCloneLibrary=library.deepCopy();
            deepCloneLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //when
        library.getBooks().remove(book1);

        //then
        Assertions.assertEquals(2,library.getBooks().size());
        Assertions.assertEquals(2,shallowCloneLibrary.getBooks().size());
        Assertions.assertEquals(3,deepCloneLibrary.getBooks().size());
        assertEquals(shallowCloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }

}
