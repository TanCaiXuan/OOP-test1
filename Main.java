package org.caixuan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a flight object
        Flight flight = new Flight("F001", "MH001", "Johor", "Senai Airport", 2.5f);

        // Create seats
        Seat seat1 = new Seat("S1", "1A", "Business", true, true, flight);
        Seat seat2 = new Seat("S2", "1B", "Business", true, true, flight);
        Seat seat3 = new Seat("S3", "2A", "Economy", true, false, flight);
        Seat seat4 = new Seat("S4", "2B", "Premium Economy", false, true, flight);

        // Add seats to the flight
        flight.addSeat(seat1);
        flight.addSeat(seat2);
        flight.addSeat(seat3);
        flight.addSeat(seat4);

        // Display flight information
        System.out.println("Flight ID: " + flight.getId());
        System.out.println("Flight Name: " + flight.getName());
        System.out.println("Departure Airport: " + flight.getDepartureAirport());
        System.out.println("Arrival Country: " + flight.getArrivalCountry());
        System.out.println("Duration: " + flight.getDuration() + " hours");

        // Display seat information
        System.out.println("Seats on Flight " + flight.getId() + ":");
        for (Seat seat : flight.getSeats()) {
            System.out.println("Seat Number: " + seat.getSeatNumber() +
                    ", Class: " + seat.getSeatClass() +
                    ", Available: " + (seat.isAvailable() ? "Yes" : "No") +
                    ", In-Flight Entertainment: " + (seat.isInFlightEntertainment() ? "Yes" : "No"));
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        // Create a passenger
        Passenger passenger = new Passenger("P002","Male","John","Doen","0101234327");

        // Make a reservation for a specific seat
        Reservation reservation = passenger.createReservation(flight, seat1); // Attempt to reserve seat1

        if (reservation != null) {
            System.out.println("Reservation successful!");
            System.out.println("Passenger: " + passenger.getLastName());
            System.out.println("Flight ID: " + reservation.getFlight().getId());
            System.out.println("Seat Number: " + reservation.getSeat().getSeatNumber());
        } else {
            System.out.println("Reservation failed. Seat may not be available.");
        }

        // Attempt to reserve the same seat again to see the failure case
        Reservation secondReservation = passenger.createReservation(flight, seat1); // Attempt to reserve seat1 again

        if (secondReservation != null) {
            System.out.println("Second reservation successful!");
        } else {
            System.out.println("Second reservation failed. Seat may not be available.");
        }

    }
}