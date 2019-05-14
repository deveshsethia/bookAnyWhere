package com.bookAnyWhere.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class TrainTimeRepository {

    Map<String , String> trainTiming= new HashMap<>();



    public TrainTimeRepository() {
        trainTiming.put("TRAIN1", "9pm , monday");
    }

    public String getTrainTiming(String trainName) {
        return trainTiming.get(trainName);
    }

    public void setTrainTiming(String trainName, String timing) {
        this.trainTiming.put(trainName, timing);
    }
}
