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



}