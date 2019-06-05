package com.bookAnyWhere.models;

import javax.persistence.*;

@Entity
public class ReservedSeat {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Booking booking;
    @ManyToOne
    private Seat seat;


    public int getId() {
        return id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

}
