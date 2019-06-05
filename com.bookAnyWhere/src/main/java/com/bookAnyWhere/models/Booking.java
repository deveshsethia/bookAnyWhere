package com.bookAnyWhere.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@TableGenerator(name = "booking",initialValue = 20000)
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "booking")
    private int id;
    @ManyToOne
    private Passenger passenger;
    @ManyToOne
    private Train train;

    public Booking() {
        super();
    }

    public int getId() {
        return id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

}
