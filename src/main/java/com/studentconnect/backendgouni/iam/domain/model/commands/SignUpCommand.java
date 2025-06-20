package com.studentconnect.backendgouni.iam.domain.model.commands;

import com.studentconnect.backendgouni.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}

