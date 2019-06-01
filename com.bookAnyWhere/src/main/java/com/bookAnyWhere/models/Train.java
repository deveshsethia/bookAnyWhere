package com.bookAnyWhere.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Train {

    @Id
    @GeneratedValue
    private int id;
    private String trainName;
    private String totalCoaaches;

    public int getId() {
        return id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTotalCoaaches() {
        return totalCoaaches;
    }

    public void setTotalCoaaches(String totalCoaaches) {
        this.totalCoaaches = totalCoaaches;
    }
}


