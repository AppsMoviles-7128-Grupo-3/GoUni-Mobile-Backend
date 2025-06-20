package com.studentconnect.backendgouni.carpooling.domain.services;

import com.studentconnect.backendgouni.carpooling.domain.model.aggregates.Student;
import com.studentconnect.backendgouni.carpooling.domain.model.queries.GetStudentByProfileIdQuery;
import com.studentconnect.backendgouni.carpooling.domain.model.queries.GetStudentByUniRiderStudentRecordIdQuery;

import java.util.Optional;

public interface StudentQueryService {
    Optional<Student> handle(GetStudentByProfileIdQuery query);
    Optional<Student> handle(GetStudentByUniRiderStudentRecordIdQuery query);

}
