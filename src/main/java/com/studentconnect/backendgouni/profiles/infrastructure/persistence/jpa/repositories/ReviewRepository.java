package com.studentconnect.backendgouni.profiles.infrastructure.persistence.jpa.repositories;

import com.studentconnect.backendgouni.profiles.domain.model.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findReviewByDriverId(Long driverId);
    List<Review> findReviewByPassengerId(Long passengerId);
}
