package com.bookAnyWhere.utilityClasses;

import org.springframework.beans.factory.annotation.Value;
import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;

public class UtilityFunction {

    @Value("{#{${discountfor}}}")
    private Map<String, Integer>  discountfor= new HashMap<>();

    public UtilityFunction(){

    }

    public int getDiscountFor(String passengerType){
        return discountfor.get(passengerType);

    }
    public static final String getPassengerType(String age){
                        return null;
    }

}
