package com.bookAnyWhere.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoachTest {


    Coach coach= new AcCoach("1","AC");
    @Test
    public void getSeats() {

        Seat testSeatNumber= coach.getSeats().get("UPPER").peek();
        assertEquals("UPPER1", testSeatNumber.seatNumber);
        Seat testSideLower = coach.getSeats().get("SIDELOWER").peek();
        assertEquals("SIDELOWER4", testSideLower.seatNumber);
        Seat testSideUpper = coach.getSeats().get("SIDEUPPER").peek();
        assertEquals("SIDEUPPER8", testSideUpper.seatNumber);
    }
}