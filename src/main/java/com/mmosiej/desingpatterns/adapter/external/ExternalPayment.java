package com.mmosiej.desingpatterns.adapter.external;

public interface ExternalPayment {

    void makePayment(Double amount, String additionalInfo);
}
