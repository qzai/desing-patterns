package com.mmosiej.desingpatterns.adapter;

import com.mmosiej.desingpatterns.adapter.external.PayUPayment;
import com.mmosiej.desingpatterns.adapter.internal.Payment;

import java.math.BigDecimal;

public class PayUPaymentAdapter implements Payment {

    private PayUPayment payUPayment;

    public PayUPaymentAdapter(PayUPayment payUPayment) {
        this.payUPayment = payUPayment;
    }

    @Override
    public void pay(BigDecimal amount) {
        payUPayment.makePayment(amount.doubleValue(), null);
    }
}
