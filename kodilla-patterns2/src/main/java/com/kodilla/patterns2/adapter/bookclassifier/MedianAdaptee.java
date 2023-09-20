package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatisticks;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statisticks;

import java.util.Map;

public class MedianAdaptee implements BookStatisticks {
    Statisticks statisticks = new Statisticks();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statisticks.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statisticks.medianPublicationYear(books);
    }
}
