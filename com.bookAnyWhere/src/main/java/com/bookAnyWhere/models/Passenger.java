package com.bookAnyWhere.models;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
@Transactional
public class Passenger {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String age;
    private String gender;
    private PassengerType passengerType;

    @OneToMany(mappedBy = "passenger")
    private Set<Booking> bookings;

    public Set<Booking> getBooking() {
        return bookings;
    }

    public void createBooking(Booking booking) {
        bookings.add(booking);    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);    }

    public Passenger() {
    }

    public int getId() {
        return id;
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

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

}
