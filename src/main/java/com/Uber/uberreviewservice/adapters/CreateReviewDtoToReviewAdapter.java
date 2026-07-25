package com.Uber.uberreviewservice.adapters;

import com.Uber.uberreviewservice.dtos.CreateReviewDto;
import com.Uber.uberreviewservice.models.Review;



public interface CreateReviewDtoToReviewAdapter {

    public Review convertDto(CreateReviewDto createReviewDto);
}
