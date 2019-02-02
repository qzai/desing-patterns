package com.mmosiej.desingpatterns.adapter;

import com.mmosiej.desingpatterns.adapter.external.ExternalPayment;
import com.mmosiej.desingpatterns.adapter.internal.Payment;

import java.math.BigDecimal;

public class PaymentAdapter implements Payment {

    private ExternalPayment externalPayment;

    public PaymentAdapter(ExternalPayment externalPayment) {
        this.externalPayment = externalPayment;
    }

    @Override
    public void pay(BigDecimal amount) {
        externalPayment.makePayment(amount.doubleValue(), null);
    }
}
