package com.bookAnyWhere.models;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName,String lastname){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Name() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
