package com.bookAnyWhere.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class TicketIDPassengerIDRepository {

    Map<String, String> tkIdPassIdMap= new HashMap<>();


    public Map<String, String> getTkIdPassIdMap() {
        return tkIdPassIdMap;
    }

    public void setTkIdPassIdMap(String ticketId, String passengerId) {
        tkIdPassIdMap.put(ticketId,passengerId);
    }
}
