package com.bookAnyWhere.requestModels;

import com.bookAnyWhere.models.Passenger;

public class TicketRequest {

    String trainName;
    String coachType;
    Passenger passenger;
    String seatPreference;



    public TicketRequest(String trainName, String coachType,Passenger passenger, String seatPreference) {
        this.trainName = trainName;
        this.coachType = coachType;
        this.passenger = passenger;
        this.seatPreference = seatPreference;
    }

    public TicketRequest() {
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
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }
}
