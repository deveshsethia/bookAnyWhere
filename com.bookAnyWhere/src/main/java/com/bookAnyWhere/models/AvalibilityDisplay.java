package com.bookAnyWhere.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@TableGenerator(name = "display",initialValue = 10000)
public class AvalibilityDisplay {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "display")
    private int id;
    @OneToOne
    private Train train;

    private String AcSeats;

    public int getId() {
        return id;
    }
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getAcSeats() {
        return AcSeats;
    }

    public void setAcSeats(String acSeats) {
        AcSeats = acSeats;
    }

    public String getSleeperSeats() {
        return SleeperSeats;
    }

    public void setSleeperSeats(String sleeperSeats) {
        SleeperSeats = sleeperSeats;
    }

    public String getGeneralSeats() {
        return GeneralSeats;
    }

    public void setGeneralSeats(String generalSeats) {
        GeneralSeats = generalSeats;
    }

    public String getWaitingSeats() {
        return WaitingSeats;
    }

    public void setWaitingSeats(String waitingSeats) {
        WaitingSeats = waitingSeats;
    }

    private String SleeperSeats;
    private String GeneralSeats;
    private String WaitingSeats;

}
