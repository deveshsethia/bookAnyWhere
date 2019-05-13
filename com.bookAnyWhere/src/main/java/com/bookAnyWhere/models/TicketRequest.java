package com.bookAnyWhere.models;

public class TicketRequest {

    String trainName;
    String coachType;
    Passenger passenger;
    String SeatPreference;


    public TicketRequest(String trainName, String coachType, Passenger passenger, String seatPreference) {
        this.trainName = trainName;
        this.coachType = coachType;
        this.passenger = passenger;
        SeatPreference = seatPreference;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatPreference() {
        return SeatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        SeatPreference = seatPreference;
    }
}
