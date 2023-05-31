package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Library {

    @Autowired
    private LibraryDbController libraryDbController;

//    @Autowired
//    public Library(LibraryDbController libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }
//    public Library(){
//
//    }

    public void saveToDb(){
        libraryDbController.saveData();
    }

    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
