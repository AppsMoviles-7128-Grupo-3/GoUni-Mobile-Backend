package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreatePassengerCommand;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.CreatePassengerResource;


public class CreatePassengerCommandFromResourceAssembler {

    public static CreatePassengerCommand toCommandFromResource(CreatePassengerResource resource) {
        return new CreatePassengerCommand(
                resource.name(),
                resource.email(),
                resource.dni(),
                resource.phone(),
                resource.photo()
        );
    }
}
