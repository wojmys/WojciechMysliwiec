package com.kodilla.patterns.strategy.social;

public class User {

    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost(){
        String post= socialPublisher.share();
        return post;
    }

    public void changeSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
