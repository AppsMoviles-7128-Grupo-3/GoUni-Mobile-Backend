package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreatePassengerCommand;
import com.studentconnect.backendgouni.profiles.domain.model.commands.UpdatePassengerCommand;


public interface PassengerCommandService {
    Long handle(CreatePassengerCommand command);
    Long handle(UpdatePassengerCommand command);
}
