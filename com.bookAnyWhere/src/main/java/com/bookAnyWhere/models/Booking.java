package com.bookAnyWhere.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private int passengerId;
    @ManyToOne
    private int ticketId;
    public Booking() {
        super();
    }

    public int getId() {
        return id;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
