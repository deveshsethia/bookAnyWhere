package com.bookAnyWhere.models;

import java.util.*;

public abstract class Coach {

    private String  coachNumber;
    private Map<String , Queue<Seat>> seats= new HashMap<>();
    public Coach(String coachNumber){
        this.coachNumber= coachNumber;
        seats.put("UPPER", new LinkedList<>());
        seats.put("MIDDLE", new LinkedList<>());
        seats.put("LOWER", new LinkedList<>());
        seats.put("SIDELOWER", new LinkedList<>());
        seats.put("SIDEUPPER", new LinkedList<>());
        setSeatNumberInTheCoach(seats);
    }

    private void setSeatNumberInTheCoach(Map<String, Queue<Seat>> seats) {
        int i = 1;
        while (i < 40) {
            switch (i % 4) {
                case 1:
                    seats.get("UPPER").add(new Seat("UPPER" + i));
                    break;
                case 2:
                    seats.get("MIDDLE").add(new Seat("MIDDLE" + i));
                    break;
                case 3:
                    seats.get("LOWER").add(new Seat("LOWER" + i));
                    break;
                default:
                    if (i % 8 == 0) {
                        seats.get("SIDEUPPER").add(new Seat("SIDEUPPER" + i));
                    } else {
                        seats.get("SIDELOWER").add(new Seat("SIDELOWER" + i));
                    }
            }
            i++;
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
