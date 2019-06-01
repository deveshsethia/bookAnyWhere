package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Coach;
import com.bookAnyWhere.models.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CoachRepo {

    @Autowired
    EntityManager em;
    
    public Coach findById(int id){
        return em.find(Coach.class, id);
    }
    public void saveCoach(Coach coach){
          em.persist(coach);
    }
    public void deleteCoachById(int id){
          em.remove(findById(id));
    }
}
