package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.commands.UpdateDriverCommand;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.CreateDriverResource;


public class UpdateDriverCommandFromResourceAssembler {

    public static UpdateDriverCommand toCommandFromResource(CreateDriverResource resource, Long driverId) {
        UpdateDriverCommand command = new UpdateDriverCommand(
                driverId,
                resource.name(),
                resource.email(),
                resource.license(),
                resource.phone(),
                resource.imageProfile(),
                resource.description()
        );
        return command;
    }
}
