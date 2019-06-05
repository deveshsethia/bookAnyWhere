package com.bookAnyWhere.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Entity
public class Seat {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    String seatNumber ;
    private SeatType seat;
    @ManyToOne
    private Coach coach;
    public Seat() {
    }
    public int getId() {
        return id;
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

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

}
