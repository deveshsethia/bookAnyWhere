package com.bookAnyWhere.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@TableGenerator(name = "train",initialValue = 30000)
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "train")
    private int id;
    @OneToOne
    private AvalibilityDisplay avalibilityDisplay;
    private String trainName;
    private String totalCoaaches;
    @OneToMany(mappedBy = "train")
    private Set<Booking> trainBookings;
    @OneToMany(mappedBy = "train")
    private Set<Coach> coaches;

    public AvalibilityDisplay getAvalibilityDisplay() {
        return avalibilityDisplay;
    }

    public void setAvalibilityDisplay(AvalibilityDisplay avalibilityDisplay) {
        this.avalibilityDisplay = avalibilityDisplay;
    }

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


