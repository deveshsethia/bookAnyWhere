package com.bookAnyWhere.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Coach {

   @Id
   @GeneratedValue
   private int id;
   private int totalSeats;
   private CoachType coachType;
   @ManyToOne
   private Train train ;
   @OneToMany(mappedBy = "coach")
   private Set<Seat> seats;

   public int getId() {
      return id;
   }

   public int getTotalSeats() {
      return totalSeats;
   }

   public void setTotalSeats(int totalSeats) {
      this.totalSeats = totalSeats;
   }

   public CoachType getCoachType() {
      return coachType;
   }

   public void setCoachType(CoachType coachType) {
      this.coachType = coachType;
   }

   public Train getTrain() {
      return train;
   }

   public void setTrain(Train train) {
      this.train = train;
   }

   public Set<Seat> getSeat() {
      return seats;
   }

   public void setSeat(Seat seat) {
      seats.add(seat);
   }

   public void remove(Seat seat){
      seats.remove(seat);
   }
}
