package com.platzi.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestpayment(PaymentRequest request);
}
