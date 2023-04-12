package com.kodilla.testing.forum.statistics;

public class StatisticBuilder {

    private Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;


    private double numberOfAveragePostsPerUser;
    private double numberOfAverageCommentsPerUser;
    private double numberOfAverageCommentsPerPost;

    public StatisticBuilder(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getNumberOfAveragePostsPerUser() {
        return numberOfAveragePostsPerUser;
    }

    public double getNumberOfAverageCommentsPerUser() {
        return numberOfAverageCommentsPerUser;
    }

    public double getNumberOfAverageCommentsPerPost() {
        return numberOfAverageCommentsPerPost;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public void setNumberOfAveragePostsPerUser(double numberOfAveragePostsPerUser) {
        this.numberOfAveragePostsPerUser = numberOfAveragePostsPerUser;
    }

    public void setNumberOfAverageCommentsPerUser(double numberOfAverageCommentsPerUser) {
        this.numberOfAverageCommentsPerUser = numberOfAverageCommentsPerUser;
    }

    public void setNumberOfAverageCommentsPerPost(double numberOfAverageCommentsPerPost) {
        this.numberOfAverageCommentsPerPost = numberOfAverageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(numberOfPosts==0 || numberOfUsers==0){

        return;
        }else {
            numberOfAveragePostsPerUser=(double)(numberOfPosts/(double)numberOfUsers);
            numberOfAverageCommentsPerUser=(double)(numberOfComments/(double)numberOfUsers);
            numberOfAverageCommentsPerPost=(double)(numberOfComments/(double)numberOfPosts);
        }
        showStatistics();
    }

    public void showStatistics(){

        System.out.println("numberOfUsers=" + numberOfUsers +"\n"+
                "numberOfPosts=" + numberOfPosts +"\n"+
                "numberOfComments=" + numberOfComments +"\n"+
                "numberOfAveragePostsPerUser=" + numberOfAveragePostsPerUser +"\n"+
                "numberOfAverageCommentsPerUser=" + numberOfAverageCommentsPerUser +"\n"+
                "numberOfAverageCommentsPerPost=" + numberOfAverageCommentsPerPost );


    };


}

