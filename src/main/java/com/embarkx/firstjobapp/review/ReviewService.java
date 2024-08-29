package com.embarkx.firstjobapp.review;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

}
