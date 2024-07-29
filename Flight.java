package org.caixuan;

import java.util.ArrayList;

public class Flight {
    private String id;
    private String name;
    private String arrivalCountry;
    private String departureAirport;
    private float duration;

    private ArrayList<Flight> segments; //to store round trip, one way , multi-city

    private ArrayList<Seat> seats;

    public Flight(String f001, String mh001, String johor, String senaiAirport, float v) {
        this("F001", "MH001", "Johor","Senai Airport",2.5f,new ArrayList<>());
    }
    public Flight(String id, String name, String arrivalCountry, String departureAirport, float duration,ArrayList<Flight> segments) {
        this.id = id;
        this.name = name;
        this.arrivalCountry=arrivalCountry;
        this.departureAirport = departureAirport;
        this.duration= duration;
        this.segments = segments;
        this.seats = new ArrayList<>(); // a flight has many seats
    }
    //: This public method retrieves a list of all available seats.
    public ArrayList<Seat> findAvailableSeats() {
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Flight> getSegments() {
        return segments;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public float getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public String getArrivalCountry() {
        return arrivalCountry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setSegments(ArrayList<Flight> segments) {
        this.segments = segments;
    }

    public void setArrivalCountry(String arrivalCountry) {
        this.arrivalCountry = arrivalCountry;
    }

    public void addSeat(Seat seat) {
        if(seats != null) {
            seats.add(seat);
            System.out.println("Meet " + seat.getSeatID() + "! A new stylish seat");
        }
    }

}
