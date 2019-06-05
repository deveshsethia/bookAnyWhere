package com.bookAnyWhere.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Train {

    @Id
    @GeneratedValue
    private int id;
    private String trainName;
    private String totalCoaaches;
    @OneToMany(mappedBy = "train")
    private Set<Booking> trainBookings;
    @OneToMany(mappedBy = "train")
    private Set<Coach> coaches;
    @OneToMany(mappedBy = "train")
    private Set<Ticket> tickets;


    public int getId() {
        return id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTotalCoaaches() {
        return totalCoaaches;
    }

    public void setTotalCoaaches(String totalCoaaches) {
        this.totalCoaaches = totalCoaaches;
    }

    public Set<Booking> getTrainBookings() {
        return trainBookings;
    }

    public void createTrainBooking(Booking trainBooking) {
        this.trainBookings.add(trainBooking);
    }

    public void cancelTrainBooking(Booking trainBooking) {
        this.trainBookings.remove(trainBooking);
    }

    public Set<Coach> getCoaches() {
        return coaches;
    }

    public void addCoach(Coach coach) {
        this.coaches.add(coach);
    }
    public void removeCoach(Coach coach) {
        this.coaches.remove(coach);
    }
    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void createTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
    public void cancelTicket(Ticket ticket) {
        this.tickets.remove(ticket);
    }
}


