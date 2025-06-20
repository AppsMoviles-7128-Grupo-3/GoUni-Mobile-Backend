package com.studentconnect.backendgouni.profiles.domain.services;

import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Passenger;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetAllPassengersQuery;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetPassengerByIdQuery;

import java.util.List;
import java.util.Optional;


public interface PassengerQueryService {
    Optional<Passenger> handle(GetPassengerByIdQuery query);
    List<Passenger> handle(GetAllPassengersQuery query);
}
