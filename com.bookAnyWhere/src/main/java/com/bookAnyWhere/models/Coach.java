package com.bookAnyWhere.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
   private int trainId ;

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

   public int getTrainId() {
      return trainId;
   }

   public void setTrainId(int trainId) {
      this.trainId = trainId;
   }


}
