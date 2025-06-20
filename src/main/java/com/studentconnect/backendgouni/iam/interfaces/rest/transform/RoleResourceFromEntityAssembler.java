package com.studentconnect.backendgouni.iam.interfaces.rest.transform;

import com.studentconnect.backendgouni.iam.domain.model.entities.Role;
import com.studentconnect.backendgouni.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}

