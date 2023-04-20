package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {

        RouteFinder routeFinder = new RouteFinder();
        Flight flight1 = new Flight("London City Airport","Paris-Orly");

        System.out.println("Searching for flight 1");
        try {
            boolean routeFound=routeFinder.findFlight(flight1);
            System.out.println(routeFound);
        }catch(RouteNotFoundException e){
            System.out.println("Please try another route");
        }

        Flight flight2 = new Flight("Istanbul","Budapest");

        System.out.println("Searching for flight 2");
        try {
            boolean routeFound=routeFinder.findFlight(flight2);
            System.out.println(routeFound);
        }catch(RouteNotFoundException e){
            System.out.println("Please try another route");
        }

        Flight flight3 = new Flight("Vaclav Havel","Warsaw Chopin");

        System.out.println("Searching for flight 3");
        try {
            boolean routeFound=routeFinder.findFlight(flight3);
            System.out.println(routeFound);
        }catch(RouteNotFoundException e){
            System.out.println("Please try another route");
        }

    }
}
