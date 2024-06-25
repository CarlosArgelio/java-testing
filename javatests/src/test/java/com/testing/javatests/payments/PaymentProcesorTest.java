package com.testing.javatests.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcesorTest {

    @Test
    public void payment_is_correct() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcesor paymentProcesor = new PaymentProcesor(paymentGateway);

        boolean result = paymentProcesor.makePayment(1000);
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcesor paymentProcesor = new PaymentProcesor(paymentGateway);

        boolean result = paymentProcesor.makePayment(1000);
        assertFalse(result);
    }
}