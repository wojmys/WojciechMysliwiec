package com.kodilla.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection conn;

    DbManager() {                                              // [3]
        Properties connectionProps = new Properties();          // [4]
        connectionProps.put("user", "kodilla2");            // [5]
        connectionProps.put("password", "password");     // [6]
        try {
            conn = DriverManager.getConnection(                  // [7]
                    "jdbc:mysql://localhost:3306/task_crud" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",                                  // [10]
                    connectionProps);                                 // [11]
        } catch (SQLException e) {                              // [12]
            throw new ExceptionInInitializerError(e);            // [13]
        }                                                       // [14]
    }                                                          // [15]

    public static DbManager getInstance() {                    // [16]
        return INSTANCE;                                        // [17]
    }                                                          // [18]

    public Connection getConnection() {                        // [19]
        return conn;                                            // [20]
    }

}
