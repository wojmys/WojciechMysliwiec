package com.kodilla.stream.forumUser;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theList = new ArrayList<>();

    public Forum() {
        theList.add(new ForumUser(001,"Jerry Newmann",'M',"2022-01-20",3));
        theList.add(new ForumUser(002,"Monica Newmann",'F',"1999-10-01",3555));
        theList.add(new ForumUser(003,"John Smith",'F',"2001-01-09",35));
        theList.add(new ForumUser(004,"Jerry Bale",'M',"1890-05-06",0));
        theList.add(new ForumUser(005,"Agatha Loris",'F',"1961-10-09",32));
        theList.add(new ForumUser(006,"Jerry Holy",'M',"2001-10-06",3));
        theList.add(new ForumUser(007,"Monica Belucci",'F',"1989-02-05",3555));
        theList.add(new ForumUser(011,"John Jimmy",'F',"1909-05-28",35));
        theList.add(new ForumUser(020,"Jerry Bales",'M',"1990-01-10",213));
        theList.add(new ForumUser(010,"Mary Loris",'F',"2020-01-20",32));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theList);
    }
}