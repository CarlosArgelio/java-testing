package com.testing.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcesorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcesor paymentProcesor;

    @Before
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcesor = new PaymentProcesor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {


        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));


        boolean result = paymentProcesor.makePayment(1000);

        assertTrue(result);
    }

    @Test
    public void payment_is_wrong() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcesor.makePayment(1000);

        assertFalse(result);
    }
}