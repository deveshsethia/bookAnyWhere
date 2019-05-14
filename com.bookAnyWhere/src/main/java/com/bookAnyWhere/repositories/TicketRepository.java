package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {
    Train train;

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public  Train getTrainInstance() {
        return train;
    }

    public TicketRepository() {
        this.train= new Train();
    }
}
