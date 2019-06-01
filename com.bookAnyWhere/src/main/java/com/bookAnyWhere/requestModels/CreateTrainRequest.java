package com.bookAnyWhere.requestModels;

import java.sql.Time;
import java.util.Map;

public class CreateTrainRequest {

    private String trainName;
    private int numberOfCoaches;
    private int numberOfSeatsPerCoach;
    private Map<String, Time> ArrivalMap;
    private Map<String, Time> DepartureMap;

    public CreateTrainRequest() {
    }

    public CreateTrainRequest(String trainName,
                              int numberOfCoaches,
                              int numberOfSeatsPerCoach,
                              Map<String, Time> arrivalMap,
                              Map<String, Time> departureMap) {
        this.trainName = trainName;
        this.numberOfCoaches = numberOfCoaches;
        this.numberOfSeatsPerCoach = numberOfSeatsPerCoach;
        ArrivalMap = arrivalMap;
        DepartureMap = departureMap;
    }



    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    public int getNumberOfSeatsPerCoach() {
        return numberOfSeatsPerCoach;
    }

    public void setNumberOfSeatsPerCoach(int numberOfSeatsPerCoach) {
        this.numberOfSeatsPerCoach = numberOfSeatsPerCoach;
    }

    public Map<String, Time> getArrivalMap() {
        return ArrivalMap;
    }

    public void setArrivalMap(Map<String, Time> arrivalMap) {
        ArrivalMap = arrivalMap;
    }

    public Map<String, Time> getDepartureMap() {
        return DepartureMap;
    }

    public void setDepartureMap(Map<String, Time> departureMap) {
        DepartureMap = departureMap;
    }

}
