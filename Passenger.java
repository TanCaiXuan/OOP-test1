package org.caixuan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Passenger {

    //gender,fName,lName,phoneNum
    private String passengerID;
    private String gender;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private ArrayList<Reservation> reservations;

    protected Passenger() {
        this("P001","Male","Lee","Ming","0101234567");
    }
    public Passenger(String passengerID, String gender, String firstName, String lastName, String phoneNum) {
        this.passengerID = passengerID;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.reservations = new ArrayList<>();
    }

    //This public method creates a reservation and adds it to a list of passenger reservations.
    public Reservation createReservation(Flight flight, Seat seat) {
        String reservationID = generateRandomString(8);
        Reservation reservation = new Reservation(reservationID, flight, seat, this, LocalDateTime.now());
        reservations.add(reservation);
        seat.setAvailability(false);
        return reservation;
    }
    //This private method returns a random string that will be used as the reservationID in the createReservation method.
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
}
