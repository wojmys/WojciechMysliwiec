package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }



    @Test
    void testListBooksWithConditionReturnList() {
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);


        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        Assertions.assertEquals(4, theListOfBooks.size());


    }

    @Test
    void testListBookWithConditionMoreThan20() {
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //when
        List<Book>theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book>theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book>theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //then
        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(15, theListOfBooks15.size());
        Assertions.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBookWithConditionShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assertions.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }
    @Test
    void testListBooksInHandsOf() {
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user1 = new LibraryUser("Adam","Smith","12345");
        LibraryUser user2 = new LibraryUser("Adam","Smith2","45678");
        LibraryUser user3 = new LibraryUser("Adam","Smith3","89000");




        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);


        when(libraryDatabaseMock.listBooksInHandsOf(user1))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user2))
                .thenReturn(resultListOf1Book);
        when(libraryDatabaseMock.listBooksInHandsOf(user3))
                .thenReturn(resultListOf5Books);

        //when
        List<Book>theListOfBooks0 = bookLibrary.listBooksInHandsOf(user1);
        List<Book>theListOfBooks1 = bookLibrary.listBooksInHandsOf(user2);
        List<Book>theListOfBooks5 = bookLibrary.listBooksInHandsOf(user3);

        //then
        Assertions.assertEquals(0, theListOfBooks0.size());
        Assertions.assertEquals(1, theListOfBooks1.size());
        Assertions.assertEquals(5, theListOfBooks5.size());

    }


}
