package com.bookAnyWhere.models;

import java.util.*;

public abstract class Coach {

    private static final String UPP ="UPPER";
    private static final String MDL ="MIDDLE";
    private static final String LRE ="LOWER";
    private static final String SLE="SIDELOWER";
    private static final String SUP ="SIDEUPPER";
    private static final int TOTALSEATS =40;//must be divisible by 8 .


    private String  coachNumber;
    private Map<String , Queue<Seat>> seats= new HashMap<>();
    public Coach(String coachNumber){
        this.coachNumber= coachNumber;
        seats.put(UPP, new LinkedList<>());
        seats.put(MDL, new LinkedList<>());
        seats.put(LRE, new LinkedList<>());
        seats.put(SLE, new LinkedList<>());
        seats.put(SUP, new LinkedList<>());
        setSeatNumberInTheCoach(seats);
    }

    private void setSeatNumberInTheCoach(Map<String, Queue<Seat>> seats) {
        int currentSeat = 1;
        while (currentSeat < TOTALSEATS) {
            switch (currentSeat % 4) {
                case 1:
                    seats.get(UPP).add(new Seat(currentSeat+ UPP));
                    break;
                case 2:
                    seats.get(MDL).add(new Seat( currentSeat+ MDL));
                    break;
                case 3:
                    seats.get(LRE).add(new Seat(currentSeat+ LRE));
                    break;
                default:
                    if (currentSeat % 8 == 0) {
                        seats.get(SUP).add(new Seat(currentSeat+ SUP));
                    } else {
                        seats.get(SLE).add(new Seat(currentSeat+SLE));
                    }
            }
            currentSeat++;
        }
    }
    public String getCoachNumber() {
        return coachNumber;
    }

    public Map<String, Queue<Seat>> getSeats() {
        return seats;
    }

    public int getAvalaibleSeats(){
        int totalSeats=1;
        for(Map.Entry<String,Queue<Seat>> seats1: seats.entrySet()){
            totalSeats+=seats1.getValue().size();
        }
        return totalSeats;
    }
    private int availableSeatInCoach(String type){

        return seats.get(type).size();
    }
}
