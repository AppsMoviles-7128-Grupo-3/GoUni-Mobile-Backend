package com.studentconnect.backendgouni.carpooling.application.internal.eventhandlers;


import com.studentconnect.backendgouni.carpooling.domain.services.StudentCommandService;
import org.springframework.stereotype.Service;

@Service
public class RideOfferedEventHandler {
    private final StudentCommandService studentCommandService;

    public RideOfferedEventHandler(StudentCommandService studentCommandService) {
        this.studentCommandService = studentCommandService;
    }


}
