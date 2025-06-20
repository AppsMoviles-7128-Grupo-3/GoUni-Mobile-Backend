package com.studentconnect.backendgouni.payment.domain.services;


import com.studentconnect.backendgouni.payment.domain.Payment;
import com.studentconnect.backendgouni.payment.domain.comands.CreatePaymentCommand;

public interface PaymentCommandService {
    Payment handle(CreatePaymentCommand command);
}
