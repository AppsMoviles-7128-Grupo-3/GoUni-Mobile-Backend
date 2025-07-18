package com.studentconnect.backendgouni.profiles.domain.model.commands;

public record CreatePassengerCommand(String name,
                                     String email,
                                     Long dni,
                                     Long phone,
                                     String photo) {}
