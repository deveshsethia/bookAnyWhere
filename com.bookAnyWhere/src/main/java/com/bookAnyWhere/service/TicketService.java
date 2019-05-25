package com.bookAnyWhere.service;

import com.bookAnyWhere.models.*;
import com.bookAnyWhere.repositories.TicketRepository;
import com.bookAnyWhere.repositories.TrainTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TicketService{

    @Autowired
    TrainTimeRepository trainTimeRepository;

    @Autowired
    TicketRepository ticketRepository;

    public int getAvailabilty(String type) {
    return ticketRepository.getTrain().getAvailabilityIn(type);

    }

    public Ticket getTicket(TicketRequest ticketRequest) {
        Passenger passenger = new Passenger(ticketRequest.getPassenger().getName(),
                ticketRequest.getPassenger().getAge(),
                ticketRequest.getPassenger().getGender());
            String seatNumber= getCoachNameWithSeat(ticketRequest.getCoachType(),ticketRequest.getSeatPreference());
            String trainTiming= trainTimeRepository.getTrainTiming(ticketRequest.getTrainName());
        Ticket ticket= new Ticket("AC1UPPER",
                ticketRequest.getTrainName(),
                passenger,
                seatNumber,
               trainTiming);

        return ticket;
    }
    private String getCoachNameWithSeat(String type , String seatPreference){
        if(ticketRepository.getTrain().getAvailabilityIn("AC")!=0){
            int checkoutCoaches=0;
            Seat passengerseat= null;
            while(checkoutCoaches<ticketRepository.getTrain().getTrainCoaches().get(type).length) {
                if (!ticketRepository.getTrain().getTrainCoaches().get(type)[checkoutCoaches].getSeats().get(seatPreference).isEmpty()) {
                    passengerseat = ticketRepository.
                            getTrain().
                            getTrainCoaches().
                            get(type)[checkoutCoaches]
                            .getSeats().
                                    get(seatPreference).poll();
                    break;
                }
                checkoutCoaches++;
            }
                return type+checkoutCoaches +"-"+ passengerseat.getSeatNumber();
        }
        return  "NO seat";
    }
}
