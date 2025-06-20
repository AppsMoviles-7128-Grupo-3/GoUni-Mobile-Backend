package com.studentconnect.backendgouni.profiles.domain.services;


import com.studentconnect.backendgouni.profiles.domain.model.aggregates.Profile;
import com.studentconnect.backendgouni.profiles.domain.model.commands.CreateProfileCommand;

import java.util.Optional;

public interface ProfileCommandService {
    Optional<Profile> handle(CreateProfileCommand command);
}