package com.convpay.service;

import com.convpay.dto.ConvenienceType;
import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.dto.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success() {
        //given
        PayRequest payRequest = new PayRequest(ConvenienceType.G25, 100);

        //when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(100, payResponse.getPaidAmount());

    }

}