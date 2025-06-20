package com.studentconnect.backendgouni.profiles.interfaces.rest.resources;

public record CreatePassengerResource(String name,
                                      String email,
                                      Long dni,
                                      Long phone,
                                      String photo) {
}
