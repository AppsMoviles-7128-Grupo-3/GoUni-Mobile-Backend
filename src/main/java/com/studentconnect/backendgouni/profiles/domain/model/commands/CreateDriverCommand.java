package com.studentconnect.backendgouni.profiles.domain.model.commands;

public record CreateDriverCommand(String name,String email,Long license,Long phone,String imageProfile,String description) {
}
