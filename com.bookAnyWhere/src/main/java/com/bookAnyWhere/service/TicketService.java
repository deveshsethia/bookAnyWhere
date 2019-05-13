package com.bookAnyWhere.service;

import com.bookAnyWhere.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TicketService{


    @Autowired
    TicketRepository ticketRepository;

    public int getAvailabilty(String type) {
    return ticketRepository.getTrain().getAvailabilityIn(type);

    }
}
