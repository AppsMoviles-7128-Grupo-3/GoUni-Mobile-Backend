package com.studentconnect.backendgouni.payment.interfaces.rest.transform;


import com.studentconnect.backendgouni.payment.domain.comands.CreatePaymentCommand;
import com.studentconnect.backendgouni.payment.interfaces.rest.resources.CreatePaymentResource;

public class CreatePaymentCommandFromResourceAssembler {
    public static CreatePaymentCommand toCommandFromResource(CreatePaymentResource resource) {
        return new CreatePaymentCommand(
                resource.getCardNumber(),
                resource.getCardHolderName(),
                resource.getExpiryDate(),
                resource.getCvv(),
                resource.getAmount()
        );
    }
}
