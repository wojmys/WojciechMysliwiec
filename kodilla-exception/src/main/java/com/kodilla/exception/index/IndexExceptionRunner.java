package com.kodilla.exception.index;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {

        VideoCollector videoCollectorollector = new VideoCollector();
        List<String> collection = videoCollectorollector.getCollection();

        String movie = collection.get(0);
        System.out.println(movie);

        String anotherMovie = collection.get(2);
        System.out.println(anotherMovie);
    }
}
