package com.convpay.service;

import com.convpay.dto.PayRequest;
import com.convpay.type.ConvenienceType;
import com.convpay.type.PayMethodType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountByConvenienceTest {

    DiscountByConvenience discountByConvenience = new DiscountByConvenience();

    @Test
    void discountTest() {
        //given
        PayRequest payRequestG25 = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 1000);
        PayRequest payRequestCU = new PayRequest(PayMethodType.MONEY, ConvenienceType.CU, 1000);
        PayRequest payRequestSeven = new PayRequest(PayMethodType.MONEY, ConvenienceType.SEVEN, 1000);

        //when
        Integer discountedAmountG25 = discountByConvenience.getDiscountedAmount(payRequestG25);
        Integer discountedAmountCU = discountByConvenience.getDiscountedAmount(payRequestCU);
        Integer discountedAmountSeven = discountByConvenience.getDiscountedAmount(payRequestSeven);

        //then
        assertEquals(800, discountedAmountG25);
        assertEquals(900, discountedAmountCU);
        assertEquals(1000, discountedAmountSeven);

    }

}