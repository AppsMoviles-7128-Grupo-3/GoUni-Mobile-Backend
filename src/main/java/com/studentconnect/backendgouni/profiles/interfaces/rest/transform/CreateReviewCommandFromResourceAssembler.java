package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateReviewCommand;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.CreateReviewResource;
import org.springframework.stereotype.Component;

@Component
public class CreateReviewCommandFromResourceAssembler {

        public CreateReviewCommand toCommandFromResource(CreateReviewResource resource) {
            return new CreateReviewCommand(
                    resource.driverId(),
                    resource.passengerId(),
                    resource.rating(),
                    resource.comments()
            );
        }
}
