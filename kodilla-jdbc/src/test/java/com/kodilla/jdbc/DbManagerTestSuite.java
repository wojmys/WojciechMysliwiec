package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sglQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sglQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ". " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME")
            );
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
                FROM USERS U
                         JOIN POSTS P ON U.ID=P.USER_ID
                GROUP BY U.ID
                HAVING COUNT(*)>=2;
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(
                    rs.getString("FIRSTNAME") + ", " +
                            rs.getString("LASTNAME") + ", " +
                            rs.getInt("POSTS_NUMBER")
            );
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }

}


