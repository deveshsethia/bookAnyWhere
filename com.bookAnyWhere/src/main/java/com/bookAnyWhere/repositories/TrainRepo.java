package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Passenger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Transactional
public class TrainRepo {


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

    public int totalPassenger() {
        Query query= em.createNativeQuery("select count(id) from passenger");
        return query.getResultList().size();
    }
}
