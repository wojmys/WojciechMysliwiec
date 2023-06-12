package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share() {

        System.out.println("Snapchat");
        return "Published on Snapchat";
    }
}
