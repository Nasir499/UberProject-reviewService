package com.Uber.UberReviewService.services;

import com.Uber.UberReviewService.models.Booking;
import com.Uber.UberReviewService.models.Review;
import com.Uber.UberReviewService.repositories.BookingRepository;
import com.Uber.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;

    public ReviewService(
                         ReviewRepository reviewRepository,
                         BookingRepository bookingRepository){

        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
    @Override
    public  void  run(String...args){
        System.out.println("***************************************************");
        Review r = Review.builder()
                .content("Amazing ride babe")
                .rating(5.0)
                .build();
        Booking b = Booking
                .builder()
                .review(r)
                .endTime(new Date())
                .build();
        bookingRepository.save(b);
        reviewRepository.save(r);
        List<Review> reviews = reviewRepository.findAll();

        for(Review review : reviews){
            System.out.println(review.getContent());
        }
    }
}
