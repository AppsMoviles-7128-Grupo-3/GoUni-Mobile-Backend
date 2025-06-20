package com.studentconnect.backendgouni.iam.infrastructure.hashing.bcrypt;

import com.studentconnect.backendgouni.iam.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;


public interface BCryptHashingService extends HashingService, PasswordEncoder {
}

