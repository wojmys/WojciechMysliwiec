package com.kodilla.exception.test;

public class ExceptionHandling {

   public String secondChallengeMethodHandled(double x, double y) {
       SecondChallenge secondChallenge = new SecondChallenge();
       String text ="";
       try {
           text = secondChallenge.probablyIWillThrowException(x, y);
       } catch (Exception e) {
           System.out.println("Please try with another numbers");
       } finally {
           System.out.println("Method executed");
       }
       return text;
   }






//    public static void main(String[] args) {
//
//        SecondChallenge secondChallenge = new SecondChallenge();
//
//        try {
//            secondChallenge.probablyIWillThrowException(1.99,2.5);
//        }catch (Exception e){
//            System.out.println("Something went wrong. Please try another numbers");
//        }finally {
//            System.out.println("Method executed");
//        }
//
//    }
}
