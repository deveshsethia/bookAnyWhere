package com.bookAnyWhere.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1")
public class TicketServiceController{

    @Autowired
    public TicketServiceController(){
    }



}
