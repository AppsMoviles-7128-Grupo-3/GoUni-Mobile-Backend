package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateReviewCommand;
import com.studentconnect.backendgouni.profiles.domain.model.entities.Review;

public interface ReviewCommandService {
    Review handle(CreateReviewCommand command);
}
