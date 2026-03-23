package com.Uber.UberReviewService.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PassengerReview extends Review {
    private  String passengerReviewComment;

    private  String  passengerReview;

}
