package com.bookAnyWhere.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoachTest {


    Coach coach= new AcCoach("1","AC");
    @Test
    public void getSeats() {

        Seat testSeatNumber= coach.getSeats().get("UPPER").peek();
        assertEquals("1UPPER", testSeatNumber.seatNumber);
        Seat testSideLower = coach.getSeats().get("SIDELOWER").peek();
        assertEquals("4SIDELOWER", testSideLower.seatNumber);
        Seat testSideUpper = coach.getSeats().get("SIDEUPPER").peek();
        assertEquals("8SIDEUPPER", testSideUpper.seatNumber);
    }
    @Test
    public void getAvailableSeats(){

       int count= coach.getAvalaibleSeats();
        assertEquals(40,count);
    }
}