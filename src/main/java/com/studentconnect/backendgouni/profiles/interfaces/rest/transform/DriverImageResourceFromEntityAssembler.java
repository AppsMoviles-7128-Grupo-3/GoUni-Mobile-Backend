package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.entities.DriverImage;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.DriverImageResource;

public class DriverImageResourceFromEntityAssembler {
    public static DriverImageResource ToResourceFromEntity(DriverImage driverImage){
        return new DriverImageResource(driverImage.getId(), driverImage.getUrl());
    }
}
