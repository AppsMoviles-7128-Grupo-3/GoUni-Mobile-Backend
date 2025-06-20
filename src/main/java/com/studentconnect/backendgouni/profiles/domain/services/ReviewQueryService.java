package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.entities.Review;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetAllReviewByDriverIdQuery;

import java.util.List;

public interface ReviewQueryService {
    List<Review> handle(GetAllReviewByDriverIdQuery query);
}
