package com.studentconnect.backendgouni.profiles.domain.model.commands;

public record CreateReviewCommand(Long driverId, Long passengerId, int rating, String comments) {
}
