package com.studentconnect.backendgouni.profiles.infrastructure.persistence.jpa.repositories;

import com.studentconnect.backendgouni.profiles.domain.model.entities.DriverImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverImageRepository extends JpaRepository<DriverImage, Long>{
    Optional<DriverImage> findDriverImageById(Long driverImageId);
}
