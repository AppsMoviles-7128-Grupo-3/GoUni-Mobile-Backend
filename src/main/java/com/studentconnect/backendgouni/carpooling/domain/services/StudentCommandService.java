package com.studentconnect.backendgouni.carpooling.domain.services;

import com.studentconnect.backendgouni.carpooling.domain.model.commands.CreateStudentCommand;
import com.studentconnect.backendgouni.carpooling.domain.model.commands.UpdateStudentMetricsOnRideOfferedCommand;
import com.studentconnect.backendgouni.carpooling.domain.model.valueobjects.UniRiderStudentRecordId;

public interface StudentCommandService {
    UniRiderStudentRecordId handle(CreateStudentCommand command);
    UniRiderStudentRecordId handle(UpdateStudentMetricsOnRideOfferedCommand command);
}
