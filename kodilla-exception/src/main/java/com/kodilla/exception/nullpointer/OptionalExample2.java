package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        User user = new User("Andreas");
        user=null;
        Optional<User> optionalUser = Optional.ofNullable(user);

        String name = optionalUser.orElse(new User("hey")).getName();
        System.out.println(name);
    }




}
