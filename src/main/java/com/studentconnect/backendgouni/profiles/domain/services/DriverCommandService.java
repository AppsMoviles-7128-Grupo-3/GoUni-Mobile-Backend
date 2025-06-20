package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateDriverCommand;
import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateDriverImageCommand;
import com.studentconnect.backendgouni.profiles.domain.model.commands.UpdateDriverCommand;

public interface DriverCommandService {
    Long handle(CreateDriverCommand command);
    Long handle(UpdateDriverCommand command);
    Long handle(CreateDriverImageCommand command);
}
