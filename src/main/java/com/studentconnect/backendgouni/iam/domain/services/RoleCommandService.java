package com.studentconnect.backendgouni.iam.domain.services;

import com.studentconnect.backendgouni.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
