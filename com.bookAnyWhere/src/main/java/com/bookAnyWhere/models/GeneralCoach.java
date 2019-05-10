package com.bookAnyWhere.models;

public class GeneralCoach extends Coach{

 private String coachType;
    public GeneralCoach(int coachNumber, String coachType) {
        super(coachNumber);
        this.coachType= coachType;
    }

}
