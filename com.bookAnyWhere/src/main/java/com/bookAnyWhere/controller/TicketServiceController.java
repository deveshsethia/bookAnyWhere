package com.bookAnyWhere.controller;


import com.bookAnyWhere.models.Ticket;
import com.bookAnyWhere.repositories.TicketRepository;
import com.bookAnyWhere.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/train")
public class TicketServiceController{

    @Autowired
    TicketService ticketService;

    @Autowired
    TicketRepository ticketRepository;



}
