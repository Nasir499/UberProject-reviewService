package com.Uber.UberReviewService.repositories;

import com.Uber.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;



public interface DriverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNo(Long id , String licenseNo);

    @Query(nativeQuery = true,value = "select * from driver where id=:id")
    Optional<Driver> raw();
}
