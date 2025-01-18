package com.convpay.service;

import com.convpay.type.MoneyUseResult;
import org.junit.jupiter.api.Test;

import static com.convpay.type.MoneyUseResult.USE_FAIL;
import static com.convpay.type.MoneyUseResult.USE_SUCCESS;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MoneyAdapterTest {
    MoneyAdapter moneyAdapter = new MoneyAdapter();

    @Test
    void money_use_success() {
        //given
        Integer payAmount = 1000_000;

        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);

        //then
        assertEquals(USE_SUCCESS, moneyUseResult);
    }

    @Test
    void money_use_fail() {
        //given
        Integer payAmount = 1000_001;

        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);

        //then
        assertEquals(USE_FAIL, moneyUseResult);
    }

}