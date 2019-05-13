package com.bookAnyWhere.repositories;

import java.util.HashMap;
import java.util.Map;

public class TicketIDTrainSeatIDRepository {

    Map<String, String> tkIdSeatIdMap = new HashMap<>();


    public Map<String, String> getTkIdSeatIdMap() {
        return tkIdSeatIdMap;
    }

    public void setTkIdSeatIdMap(String ticketId, String seatId) {
        tkIdSeatIdMap.put(ticketId,seatId);
    }
}
