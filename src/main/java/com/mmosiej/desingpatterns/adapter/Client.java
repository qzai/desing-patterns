package com.mmosiej.desingpatterns.adapter;

import com.mmosiej.desingpatterns.adapter.external.PayUPayment;
import com.mmosiej.desingpatterns.adapter.internal.EcardPayment;
import com.mmosiej.desingpatterns.adapter.internal.Payment;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

        // internal payment
        Payment ecardPayment = new EcardPayment();
        ecardPayment.pay(new BigDecimal(200));

        // external payment
        Payment payUPayment = new PayUPaymentAdapter(new PayUPayment());
        payUPayment.pay(new BigDecimal(100));
    }
}
