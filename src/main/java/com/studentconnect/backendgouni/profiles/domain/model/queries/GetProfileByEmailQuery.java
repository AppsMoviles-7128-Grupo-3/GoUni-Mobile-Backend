package com.studentconnect.backendgouni.profiles.domain.model.queries;

import com.studentconnect.backendgouni.profiles.domain.model.valueobjects.EmailAddress;

public record GetProfileByEmailQuery(EmailAddress emailAddress) {
}
