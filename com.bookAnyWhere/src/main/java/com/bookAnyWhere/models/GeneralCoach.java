package com.bookAnyWhere.models;

public class GeneralCoach extends Coach{

 private String coachType;

    public String getCoachType() {
        return coachType;
    }

    public GeneralCoach(String coachNumber, String coachType) {
        super(coachNumber);
        this.coachType= coachType;
    }

}
