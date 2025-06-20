package com.studentconnect.backendgouni.carpooling.interfaces.rest.transform;

import com.studentconnect.backendgouni.carpooling.domain.model.aggregates.Student;
import com.studentconnect.backendgouni.carpooling.interfaces.rest.resources.StudentResource;

public class StudentResourceFromEntityAssembler {
    public static StudentResource toResourceFromEntity(Student student) {
        return new StudentResource(
                student.getStudentRecordId(),
                student.getProfileId()
        );
    }
}
