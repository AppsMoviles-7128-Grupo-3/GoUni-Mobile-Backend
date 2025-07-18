package com.studentconnect.backendgouni.profiles.infrastructure.persistence.jpa.repositories;

import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Driver;
import com.studentconnect.backendgouni.profiles.domain.model.valueobjects.DriverLicense;
import com.studentconnect.backendgouni.profiles.domain.model.valueobjects.DriverName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findDriverByDriverName(DriverName driverName);
    Optional<Driver> findDriverByDriverLicense(DriverLicense driverLicense);
}
