package com.bookAnyWhere.models;

import javax.persistence.*;

@Entity
public class ReservedSeat {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private int bookingId;
    @ManyToOne
    private int seatId;


    public int getId() {
        return id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
}
