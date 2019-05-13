package com.bookAnyWhere.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrainTest {


    Train train= new Train();

    @Test
    public void shouldReturnValidCoachNameWithValidGetRequest() {

       String testCoachname= train.getTrainCoaches().get("AC")[0].getCoachNumber();
       assertEquals("AC0",testCoachname);
    }
    @Test
    public  void getAvailabilityInAcCoach(){
    int count = train.getAvailabilityIn("AC");
    assertEquals(400,count);}
    @Test
    public  void getAvailabilityInSLCoach(){
        int count = train.getAvailabilityIn("SL");
        assertEquals(400,count);}
}