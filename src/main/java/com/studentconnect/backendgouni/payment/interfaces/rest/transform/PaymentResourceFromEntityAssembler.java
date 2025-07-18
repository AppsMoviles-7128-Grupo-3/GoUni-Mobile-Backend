package com.studentconnect.backendgouni.payment.interfaces.rest.transform;

import com.studentconnect.backendgouni.payment.domain.Payment;
import com.studentconnect.backendgouni.payment.interfaces.rest.resources.PaymentResource;

public class PaymentResourceFromEntityAssembler {
    public static PaymentResource toResourceFromEntity(Payment payment) {
        PaymentResource resource = new PaymentResource();
        resource.setId(payment.getId());
        resource.setCardNumber(payment.getCardNumber());
        resource.setCardHolderName(payment.getCardHolderName());
        resource.setExpiryDate(payment.getExpiryDate());
        resource.setCvv(payment.getCvv());
        resource.setAmount(payment.getAmount());
        return resource;
    }
}
