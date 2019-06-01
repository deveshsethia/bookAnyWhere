package com.bookAnyWhere.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Entity
public class Seat {

    @Id
    @GeneratedValue
    private int seatId;
    @NotNull
    String seatNumber ;
    private SeatType seat;
    @ManyToOne
    private int coachId;

    public Seat() {
    }

    public int getSeatId() {
        return seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeat() {
        return seat;
    }

    public void setSeat(SeatType seat) {
        this.seat = seat;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }
}
