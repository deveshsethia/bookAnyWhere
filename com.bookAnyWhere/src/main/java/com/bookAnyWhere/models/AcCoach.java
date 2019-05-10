package com.bookAnyWhere.models;

public class AcCoach extends Coach{

    private String coachType;


    public AcCoach(int coachNumber, String coachType) {
        super(coachNumber);
        this.coachType=coachType;
    }

}
