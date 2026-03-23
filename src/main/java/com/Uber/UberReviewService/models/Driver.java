package com.Uber.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jdk.jfr.Enabled;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    private String name;

    @Column(nullable = false,unique = true)
    private String licenseNo;

//    1:n -> Driver has many bookings
    @OneToMany(mappedBy = "driver")
    List<Booking> bookings = new ArrayList<>();

}
