package com.bookAnyWhere.models;


import java.util.*;

public class Train {

    private Map<String, Coach[]> trainCoaches = new HashMap<String, Coach[]>();

    public Train() {
        trainCoaches.put("AC", new AcCoach[10]);
        getCoach(trainCoaches.get("AC"), "AC");
        trainCoaches.put("GE", new GeneralCoach[10]);
        getCoach(trainCoaches.get("GE"), "GE");
        trainCoaches.put("SL", new SleeperCoach[10]);
        getCoach(trainCoaches.get("SL"), "SL");

    }

    private void getCoach(Coach coaches[], String type) {
        int i = 0;
        while (i < 10) {
            switch(type){
                case "AC" :
                    coaches[i] = new AcCoach(type + i, type);
                    break;
                case "GE" :
                    coaches[i] = new GeneralCoach(type + i, type);
                    break;
                case "SL" :
                    coaches[i] = new SleeperCoach(type + i, type);
                    break;
                default:
                    new Exception("Entry is not valid");
            }

            i++;
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


