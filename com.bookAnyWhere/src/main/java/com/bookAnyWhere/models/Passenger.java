package com.bookAnyWhere.models;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Transactional
public class Passenger {

    @Id
    @GeneratedValue
    private int passengerID;

    private String name;
    private String age;
    private String gender;
    private String typeOfPassenger="normal";

    public Passenger() {
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getTypeOfPassenger() {
        return typeOfPassenger;
    }

    public Passenger(String name , String age , String gender ){
        this.name= name;
        this.age= age;
        this.gender= gender;
    }

    //public abstract int passengerDiscount();



    private void getPassengerType() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
