package com.testing.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
