package com.bookAnyWhere.controller;

import com.bookAnyWhere.models.Passenger;
import com.bookAnyWhere.repositories.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/register")
public class TrainController {

    @Autowired
    TrainRepo passengerRepo;

    @PostMapping("/addTrain")
    public int addPassenger(@RequestBody Passenger passenger){
        passengerRepo.savePassenger(passenger);
        return passengerRepo.totalPassenger();
    }

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable int id){
        return passengerRepo.findById(id);
    }



}
