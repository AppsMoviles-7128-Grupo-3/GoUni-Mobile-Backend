package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateDriverImageCommand;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.CreateDriverImageResource;
import org.springframework.stereotype.Component;

@Component
public class CreateDriverImageCommandFromResource {
    public static CreateDriverImageCommand ToCommandFromResource(Long driverId,CreateDriverImageResource resource){
        return new CreateDriverImageCommand( driverId,resource.imageUrl());
    }
}
