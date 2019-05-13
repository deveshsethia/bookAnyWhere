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


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
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
