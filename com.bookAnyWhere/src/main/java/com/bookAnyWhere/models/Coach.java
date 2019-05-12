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
    }

    private void setSeatNumberInTheCoach(Map<String, Queue> seats){
        int i=1;
       while(i<40)
        switch(i%4){
            case 1:
                seats.get("UPPER").add("UPPER"+i);
            case 2:
                seats.get("MIDDLE").add("MIDDLE"+i);
            case 3:
                seats.get("LOWER").add("LOWER"+i);
             default:
                 if(i%8==0){
                     seats.get("SIDEUPPER").add("SIDEUPPER"+i);
                 }
                 else{
                     seats.get("SIDELOWER").add("SIDELOWER"+i);
                 }
        }
        i++;
    }
    public String getCoachNumber() {
        return coachNumber;
    }

    public Map<String, Queue<Seat>> getSeats() {
        return seats;
    }
}
