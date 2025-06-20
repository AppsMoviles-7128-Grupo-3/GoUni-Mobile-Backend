package com.studentconnect.backendgouni.payment.application.internal.command.services;


import com.studentconnect.backendgouni.payment.domain.Payment;
import com.studentconnect.backendgouni.payment.domain.comands.CreatePaymentCommand;
import com.studentconnect.backendgouni.payment.domain.services.PaymentCommandService;
import com.studentconnect.backendgouni.payment.infraestructure.persistence.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentCommandServiceImpl implements PaymentCommandService {

    private final PaymentRepository paymentRepository;

    public PaymentCommandServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment handle(CreatePaymentCommand command) {
        // Convert the command to a Payment entity, save it, and return
        Payment payment = new Payment(command.getCardNumber(), command.getCardHolderName(), command.getExpiryDate(), command.getCvv(), command.getAmount());
        return paymentRepository.save(payment);
    }
}
