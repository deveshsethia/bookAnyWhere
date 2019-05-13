package com.bookAnyWhere.models;

public class Ticket {


    private String uniqueTicketID;
    private String trainName;
    private Passenger passenger;
    private String seatName;
    private String coachName;
    private String timing;


    public Ticket(String uniqueTicketID, String trainName, Passenger passenger, String seatName, String coachName, String timing) {
        this.uniqueTicketID = uniqueTicketID;
        this.trainName = trainName;
        this.passenger = passenger;
        this.seatName = seatName;
        this.coachName = coachName;
        this.timing = timing;
    }
}
