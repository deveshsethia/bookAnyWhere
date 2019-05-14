package com.bookAnyWhere.models;

public class Ticket {


    private String uniqueTicketID;
    private String trainName;
    private Passenger passenger;
    private String coachName;
    private String timing;


    public Ticket(String uniqueTicketID, String trainName, Passenger passenger, String coachName, String timing) {
        this.uniqueTicketID = uniqueTicketID;
        this.trainName = trainName;
        this.passenger = passenger;
        this.coachName = coachName;
        this.timing = timing;
    }

    public Ticket() {
    }

    public String getUniqueTicketID() {
        return uniqueTicketID;
    }

    public void setUniqueTicketID(String uniqueTicketID) {
        this.uniqueTicketID = uniqueTicketID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
