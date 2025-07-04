package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.entities.Review;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.ReviewResource;
import org.springframework.stereotype.Component;

@Component
public class ReviewResourceFromEntityAssembler {

        public ReviewResource toResourceFromEntity(Review review) {
            return new ReviewResource(
                    review.getId(),
                    review.getDriver().getId(),
                    review.getPassenger().getId(),
                    review.getRating(),
                    review.getComments()
            );
        }
}
