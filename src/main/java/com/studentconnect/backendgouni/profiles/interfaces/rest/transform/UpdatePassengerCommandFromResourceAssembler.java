package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.commands.UpdatePassengerCommand;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.CreatePassengerResource;


public class UpdatePassengerCommandFromResourceAssembler {

    public static UpdatePassengerCommand toCommandFromResource(CreatePassengerResource resource, Long passengerId) {
        UpdatePassengerCommand command = new UpdatePassengerCommand(
                passengerId,
                resource.name(),
                resource.email(),
                resource.dni(),
                resource.phone(),
                resource.photo()
        );
        return command;
    }

}
