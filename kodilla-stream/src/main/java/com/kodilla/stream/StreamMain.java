package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.Map;
import java.util.stream.*;


public class StreamMain {

    public static void main(String[] args) {

    try {
        Forum forum = new Forum();

        Map<Integer, ForumUser> results = forum.getList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user->ChronoUnit.YEARS.between(user.getDateOfBirth(), LocalDate.now())>20)
                .filter(user -> user.getNumberOFPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        results.entrySet().stream()
                .map(entry ->"key: "+ entry.getKey() + ", value: " + entry.getValue())
                .forEach(System.out::println);


    }catch(Exception e){

        e.printStackTrace();
    }

    }

}


