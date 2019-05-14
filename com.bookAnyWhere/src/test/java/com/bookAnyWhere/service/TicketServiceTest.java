package com.bookAnyWhere.service;

import com.bookAnyWhere.models.TicketRequest;
import com.bookAnyWhere.repositories.TicketIDPassengerIDRepository;
import com.bookAnyWhere.repositories.TicketRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TicketServiceTest {



    TicketService ticketService= new TicketService();

//    @Test
//    public void getAvailabilty() {
//        int count =ticketService.getAvailabilty("AC");
//        assertEquals(400, count);
//    }
  TicketRequest ticketRequest= new TicketRequest();


    @Test
    public void getTicket() {

    }
}