package com.Uber.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
    @OneToMany(mappedBy = "driver",fetch = FetchType.LAZY)
    List<Booking> bookings = new ArrayList<>();
}
