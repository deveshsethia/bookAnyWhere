package com.bookAnyWhere.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoachTest {


    Coach coach= new AcCoach("1","AC");
    @Test
    public void getSeats() {

        Seat testSeatNumber= coach.getSeats().get("UPPER").peek();
        assertEquals("UPPER1", testSeatNumber);
    }
}