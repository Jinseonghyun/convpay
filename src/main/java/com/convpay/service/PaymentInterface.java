package com.convpay.service;

import com.convpay.type.CancelPaymentResult;
import com.convpay.type.PayMethodType;
import com.convpay.type.PaymentResult;

public interface PaymentInterface {

    PayMethodType getPayMethodType();
    PaymentResult payment(Integer payAmount);
    CancelPaymentResult cancelPayment(Integer cancelAmount);
}
