package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class PassengerRepo {


    @Autowired
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
