package com.bookAnyWhere.models;

public class SleeperCoach extends Coach {

    private String coachType;
    public SleeperCoach(String coachNumber, String coachType) {
        super(coachNumber);
    }

    public String getCoachType() {
        return coachType;
    }
}
