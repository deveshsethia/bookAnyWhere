package com.bookAnyWhere.controller;

import com.bookAnyWhere.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/train")
public class TicketServiceController{

    @Autowired
    TicketService ticketService;

    @GetMapping("/availability/{type}")
    public int getAvailability(@PathVariable String type){
      return ticketService.getAvailabilty(type);

    }
}
