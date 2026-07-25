package com.uberreviewservice.adapters;

import com.uberreviewservice.dtos.CreateReviewDto;
import com.uberreviewservice.models.Review;



public interface CreateReviewDtoToReviewAdapter {

    Review convertDto(CreateReviewDto createReviewDto);
}
