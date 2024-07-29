package org.caixuan;
import java.time.LocalDateTime;
public class Reservation {
    private LocalDateTime now;
    private String reservationID;

    private String status; // available, pending, reserved

    private String specialRequests; // for remark

    private String paymentMethod; // to store the way will be paid
    private LocalDateTime reservationDate;

    private Flight flight;
    private Seat seat;
    private Passenger passenger;


    public Reservation(String reservationID, String status, String specialRequests, String paymentMethod, LocalDateTime reservationDate, Flight flight, Seat seat, Passenger passenger) {
        this.reservationID = reservationID;
        this.status = status;
        this.specialRequests = specialRequests;
        this.paymentMethod = paymentMethod;
        this.reservationDate = reservationDate;
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
    }

    public Reservation(String reservationID, Flight flight, Seat seat, Passenger passenger, LocalDateTime now) {
        this.reservationID = reservationID;
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
        this.now=now;

    }

    public LocalDateTime getNow() {
        return now;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public String getStatus() {
        return status;
    }

    public Flight getFlight() {
        return flight;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
