package com.bookAnyWhere.models;


import java.util.*;

public class Train {

    private static final int NUMBEROFCOACHES = 10;
    private Map<String, Coach[]> trainCoaches = new HashMap<String, Coach[]>();
    public static final String AC="AC";
    public static final String GE="GE";
    public static final String SL="SL";


    public Train() {
        trainCoaches.put(AC, new AcCoach[NUMBEROFCOACHES]);
        getCoach(trainCoaches.get(AC), AC);
        trainCoaches.put(GE, new GeneralCoach[NUMBEROFCOACHES]);
        getCoach(trainCoaches.get(GE),GE);
        trainCoaches.put(SL, new SleeperCoach[NUMBEROFCOACHES]);
        getCoach(trainCoaches.get(SL), SL);

    }

    private void getCoach(Coach coaches[], String type) {
        int currentCoach = 0;
        while (currentCoach < NUMBEROFCOACHES) {
            switch(type){
                case AC :
                    coaches[currentCoach] = new AcCoach(type + currentCoach, type);
                    break;
                case GE :
                    coaches[currentCoach] = new GeneralCoach(type + currentCoach, type);
                    break;
                case SL :
                    coaches[currentCoach] = new SleeperCoach(type + currentCoach, type);
                    break;
                default:
                    new Exception("Entry is not valid");
            }

            currentCoach++;
        }
    }

    public Map<String, Coach[]> getTrainCoaches() {
        return trainCoaches;
    }

    public int getAvailabilityIn(String type){
        int totalCoachSeats=0;
        for(Coach coachls: trainCoaches.get(type)){
            totalCoachSeats+=coachls.getAvalaibleSeats();
        }
        return totalCoachSeats;
    }

}


