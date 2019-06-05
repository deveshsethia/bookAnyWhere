package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TicketRepo {


    @PersistenceContext
    EntityManager em;

    public Passenger findById(int id){
        return em.find(Passenger.class, id);
    }
    public void savePassenger(Passenger passenger){
          em.persist(passenger);
    }
    public void deletePassengerById(int id){
          em.remove(findById(id));
    }
}
