package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int numberOFPosts;



    public ForumUser(final int userId,final String userName,final char userSex,final String dateOfBirth,final int numberOFPosts) {

        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.numberOFPosts = numberOFPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOFPosts() {
        return numberOFPosts;
    }

    @Override
    public String toString() {
        return
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOFPosts=" + numberOFPosts +
                '}';
    }


}
