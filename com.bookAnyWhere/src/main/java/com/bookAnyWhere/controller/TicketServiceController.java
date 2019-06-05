package com.bookAnyWhere.controller;

import com.bookAnyWhere.models.Passenger;
import com.bookAnyWhere.requestModels.TicketRequest;
import com.bookAnyWhere.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/train")
public class TicketServiceController{

    @Autowired
    TicketService ticketService;

    @GetMapping("/availability/{type}")
    public void getAvailability(@PathVariable String type){


    }
    @PostMapping("/addPassenger")
    public void addPassenger(@RequestBody Passenger passenger){
        
    }

    @PostMapping("/booking")
    public void getBooking(@RequestBody TicketRequest ticketRequest){
     //  return ticketService.getTicket(ticketRequest);
    }
}
