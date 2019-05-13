package com.bookAnyWhere.repositories;

import java.util.HashMap;
import java.util.Map;

public class TicketIDPassengerIDRepository {

    Map<String, String> tkIdPassIdMap= new HashMap<>();


    public Map<String, String> getTkIdPassIdMap() {
        return tkIdPassIdMap;
    }

    public void setTkIdPassIdMap(String ticketId, String passengerId) {
        tkIdPassIdMap.put(ticketId,passengerId);
    }
}
