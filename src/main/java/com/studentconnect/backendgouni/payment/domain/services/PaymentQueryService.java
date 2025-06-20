package com.studentconnect.backendgouni.payment.domain.services;

import com.studentconnect.backendgouni.payment.domain.Payment;

import java.util.List;

public interface PaymentQueryService {
    List<Payment> getAllPayments();
}
