package com.bookAnyWhere.models;

public class Passenger {

    private Name name;
    private String age;
    private String gender;

    public Passenger(String firstName, String LastName ,String age , String gender ){
        this.name= new Name(firstName,LastName);
        this.age= age;
        this.gender= gender;
    }


}
