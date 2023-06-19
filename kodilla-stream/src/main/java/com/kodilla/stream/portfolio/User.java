package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {

    private final String userName;
    private final String realName;

    public User(final String userName,final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(userName, user.userName)) return false;
        return Objects.equals(realName, user.realName);
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        return result;
    }
}

