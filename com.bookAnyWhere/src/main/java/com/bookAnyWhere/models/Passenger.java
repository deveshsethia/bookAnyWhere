package com.bookAnyWhere.models;

public class Passenger {

    private String name;
    private String age;
    private String gender;
    private String typeOfPassenger;

    public Passenger(String name ,String age , String gender ){
        this.name= name;
        this.age= age;
        this.gender= gender;
    }

    //public abstract int passengerDiscount();

    public Passenger() {
    }

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
