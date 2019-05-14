package com.bookAnyWhere.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class TicketIDTrainSeatIDRepository {

    Map<String, String> tkIdSeatIdMap = new HashMap<>();


    public Map<String, String> getTkIdSeatIdMap() {
        return tkIdSeatIdMap;
    }

    public void setTkIdSeatIdMap(String ticketId, String seatId) {
        tkIdSeatIdMap.put(ticketId,seatId);
    }
}
