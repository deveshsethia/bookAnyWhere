package com.bookAnyWhere.service;

import com.bookAnyWhere.models.Passenger;
import com.bookAnyWhere.models.Ticket;
import com.bookAnyWhere.models.TicketRequest;
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

    public Ticket getTicket(TicketRequest ticketRequest) {
        Passenger passenger = new Passenger(ticketRequest.getPassenger().getName().getFirstName(),
                ticketRequest.getPassenger().getName().getLastName(),
                ticketRequest.getPassenger().getAge(),
                ticketRequest.getPassenger().getGender());
        return new Ticket("AC1UPPER",ticketRequest.getTrainName(),
                passenger,"1","AC1","9pm");
    }
}
