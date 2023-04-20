package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    private Map<String, Boolean>airports = new HashMap<>();

    public RouteFinder() {
        airports.put("Amsterdam", true);
        airports.put("Heathrow",false);
        airports.put("Leonardo da Vinci", false);
        airports.put("Paris-Orly", true);
        airports.put("Sheremetyevo", false);
        airports.put("Budapest", true);
        airports.put("Warsaw Chopin", true);
        airports.put("Vaclav Havel", true);
        airports.put("Istanbul", false);
    }

    public Map<String, Boolean> getAirports() {
        return airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportMap = getAirports();

        if (!airportMap.containsKey(flight.getDepartureFlight())
                || !airportMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else if ((!airportMap.get(flight.getDepartureFlight()))||(!airportMap.get(flight.getArrivalAirport()))){
            System.out.println("Connection not possible!");
        } else {

            String departure = "Departure: " + flight.getDepartureFlight();
            String arrival = "Arrival: " + flight.getArrivalAirport();

            System.out.println("Connection found: "+departure + "\n" + arrival);

        }
    }
}
