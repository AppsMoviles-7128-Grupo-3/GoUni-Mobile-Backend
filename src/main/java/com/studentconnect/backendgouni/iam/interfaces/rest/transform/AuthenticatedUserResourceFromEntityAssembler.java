package com.studentconnect.backendgouni.iam.interfaces.rest.transform;

import com.studentconnect.backendgouni.iam.domain.model.aggregates.User;
import com.studentconnect.backendgouni.iam.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {
    public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedUserResource(user.getId(), user.getUsername(), token);
    }
}