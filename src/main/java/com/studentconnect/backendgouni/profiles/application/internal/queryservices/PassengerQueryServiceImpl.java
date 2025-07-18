package com.studentconnect.backendgouni.profiles.application.internal.queryservices;


import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Passenger;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetAllPassengersQuery;
import com.studentconnect.backendgouni.profiles.domain.model.queries.GetPassengerByIdQuery;
import com.studentconnect.backendgouni.profiles.domain.services.PassengerQueryService;
import com.studentconnect.backendgouni.profiles.infrastructure.persistence.jpa.repositories.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerQueryServiceImpl  implements  PassengerQueryService {

    private final PassengerRepository passengerRepository;

    public PassengerQueryServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public List<Passenger> handle(GetAllPassengersQuery query) {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> handle(GetPassengerByIdQuery query) {
        return passengerRepository.findById(query.id());
    }
}
