package com.Uber.UberReviewService.services;



import com.Uber.UberReviewService.models.Driver;

import com.Uber.UberReviewService.repositories.BookingRepository;
import com.Uber.UberReviewService.repositories.DriverRepository;
import com.Uber.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    private DriverRepository driverRepository;

    public ReviewService(
                         ReviewRepository reviewRepository,
                         BookingRepository bookingRepository,
                         DriverRepository driverRepository ){

        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }
    @Override
    public  void  run(String...args){
        System.out.println("***************************************************");
//        Review r = Review.builder()
//                .content("Amazing ride babe")
//                .rating(5.0)
//                .build();
//        Booking b = Booking
//                .builder()
//                .review(r)
//                .endTime(new Date())
//                .build();
//        bookingRepository.save(b);
//        reviewRepository.save(r);
//        List<Review> reviews = reviewRepository.findAll();

        Optional<Driver> driver = driverRepository.findById(1L);

        if(driver.isPresent()){
            System.out.println(driver.get().getName());
//            List<Booking> bookings = bookingRepository.findAllByDriverId(1L);
//            for (Booking booking : bookings){
//                System.out.println(booking.getBookingStatus());
//            }
        }

    }
}
