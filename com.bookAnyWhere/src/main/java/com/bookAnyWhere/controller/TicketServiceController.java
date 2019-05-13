package com.bookAnyWhere.controller;

import com.bookAnyWhere.models.Ticket;
import com.bookAnyWhere.models.TicketRequest;
import com.bookAnyWhere.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/train")
public class TicketServiceController{

    @Autowired
    TicketService ticketService;

    @GetMapping("/availability/{type}")
    public int getAvailability(@PathVariable String type){
      return ticketService.getAvailabilty(type);

    }

    @PostMapping("/booking")
    public Ticket getBooking(@RequestBody TicketRequest ticketRequest){
       return ticketService.getTicket(ticketRequest);
    }
}
