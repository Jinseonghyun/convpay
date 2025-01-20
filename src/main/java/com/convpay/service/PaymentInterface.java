package com.convpay.service;

import com.convpay.type.CancelPaymentResult;
import com.convpay.type.PaymentResult;

public interface PaymentInterface {

    PaymentResult payment(Integer payAmount);
    CancelPaymentResult cancelPayment(Integer cancelAmount);
}
