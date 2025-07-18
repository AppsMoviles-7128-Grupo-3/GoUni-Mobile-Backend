package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Driver;
import com.studentconnect.backendgouni.profiles.domain.model.entities.DriverImage;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetAllDriverImagesByDriverIdQuery;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetAllDriversQuery;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetDriverByIdQuery;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetDriverByNameQuery;

import java.util.List;
import java.util.Optional;


public interface DriverQueryService {
    Optional<Driver> handle(GetDriverByIdQuery query);
    Optional<Driver> handle(GetDriverByNameQuery query);
    List<Driver> handle(GetAllDriversQuery query);
    List<DriverImage> handle(GetAllDriverImagesByDriverIdQuery query);
}
