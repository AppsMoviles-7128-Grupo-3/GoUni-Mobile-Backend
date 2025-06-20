package com.studentconnect.backendgouni.carpooling.infrastructure.persistence.jpa.repositories;


import com.studentconnect.backendgouni.carpooling.domain.model.aggregates.Student;
import com.studentconnect.backendgouni.carpooling.domain.model.valueobjects.ProfileId;
import com.studentconnect.backendgouni.carpooling.domain.model.valueobjects.UniRiderStudentRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByProfileId(ProfileId profileId);
    Optional<Student> findByUniRiderStudentRecordId(UniRiderStudentRecordId studentRecordId);
}
