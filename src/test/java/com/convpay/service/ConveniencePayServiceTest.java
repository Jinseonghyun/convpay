package com.convpay.service;

import com.convpay.type.ConvenienceType;
import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.type.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success() {
        //given
        PayRequest payRequest = new PayRequest(ConvenienceType.G25, 50);

        //when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.SUCCESS, payResponse.getPayResult());
        assertEquals(50, payResponse.getPaidAmount());

    }

    @Test
    void pay_fail() {
        //given
        PayRequest payRequest = new PayRequest(ConvenienceType.G25, 1000_001);

        //when
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.FAIL, payResponse.getPayResult());
        assertEquals(0, payResponse.getPaidAmount());

    }

}