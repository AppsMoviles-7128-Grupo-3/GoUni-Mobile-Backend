package com.studentconnect.backendgouni.payment.application.internal.query.services;

import com.studentconnect.backendgouni.payment.domain.Payment;
import com.studentconnect.backendgouni.payment.domain.services.PaymentQueryService;
import com.studentconnect.backendgouni.payment.infraestructure.persistence.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentQueryServiceImpl implements PaymentQueryService {
    private final PaymentRepository paymentRepository;

    public PaymentQueryServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
