package com.kodilla.exception.test;

public class Flight {

    private String departureFlight;
    private String arrivalAirport;

    public Flight(String departureFlight, String arrivalAirport) {
        this.departureFlight = departureFlight;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureFlight() {
        return departureFlight;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return
                "departureFlight='" + departureFlight + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\''
                ;
    }
}
