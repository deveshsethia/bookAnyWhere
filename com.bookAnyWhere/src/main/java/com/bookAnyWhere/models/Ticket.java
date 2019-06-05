package com.bookAnyWhere.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@TableGenerator(name = "ticket",initialValue = 40000)
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ticket")
    private String id;
    @ManyToOne
    private Train train;
    private Date date;
    private String timing;

    public String getId() {
        return id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
