package org.caixuan;

public class Seat {

    private String seatID;
    private String seatNumber;
    private String seatClass; // Economy,Premium Economy,Business,First Class
    private boolean availability;
    private boolean FlightEntertainment;
    private Flight flight; // a flight has many seats

    public Seat() {
        this("A", "001", "Economy",true, false,new Flight("F001", "MH001", "Johor", "Senai Airport", 2.5f));
    }
    public Seat(String seatID, String seatNumber, String seatClass, boolean availability, boolean FlightEntertainment,Flight flight) {
        this.seatID = seatID;
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.availability = availability;
        this.FlightEntertainment=FlightEntertainment;
        this.flight = flight;
    }
    //This public method sets the availability of a seat to either true or false.

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    //This public method returns the availability status of a seat.
    public boolean isAvailable(){
        return availability;
    }

    public void createSeat() {
        flight.addSeat(this);
    }
    public boolean isInFlightEntertainment(){
        return FlightEntertainment;
    }

    public Flight getFlight() {
        return flight;
    }
    public String getSeatID() {
        return seatID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setInFlightEntertainment(boolean inFlightEntertainment) {
        this.FlightEntertainment = inFlightEntertainment;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }


}
