package com.bookAnyWhere.repositories;

import com.bookAnyWhere.models.Train;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    Train train;

    public  Train getTrainInstance() {
        return train;
    }

    private TicketRepository() {

        this.train = new Train();
    }
}
