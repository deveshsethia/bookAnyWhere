package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class SeatRepo {


    @PersistenceContext
    EntityManager em;

    public Seat findById(int id){
        return em.find(Seat.class, id);
    }
    public void saveSeat(Seat seat){
          em.persist(seat);
    }
    public void deleteSeatById(int id){
          em.remove(findById(id));
    }
}
