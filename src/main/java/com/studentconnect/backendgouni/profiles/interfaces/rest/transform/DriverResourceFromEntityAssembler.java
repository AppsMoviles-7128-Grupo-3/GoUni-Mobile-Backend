package com.studentconnect.backendgouni.profiles.interfaces.rest.transform;

import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Driver;
import com.studentconnect.backendgouni.profiles.interfaces.rest.resources.DriverResource;

public class DriverResourceFromEntityAssembler {

    public static DriverResource toResourceFromEntity(Driver driver){
        return new DriverResource(
                driver.getId(),
                driver.getName(),
                driver.getEmail(),
                driver.getLicense(),
                driver.getPhone(),
                driver.getDriverImageProfile(),
                driver.getDriverDescription()
        );
    }
}
