package com.bookAnyWhere.models;

public class AcCoach extends Coach{

    private String coachType;


    public AcCoach(String coachNumber, String coachType) {
        super(coachNumber);
        this.coachType=coachType;
    }

    public String getCoachType() {
        return coachType;
    }
}
