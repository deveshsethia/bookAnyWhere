package com.bookAnyWhere.models;

public class Seat {

 String seatNumber ;

 public Seat(String seatNumber){
     this.seatNumber= seatNumber;
 }

    public Seat() {
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
