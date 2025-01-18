package com.convpay.service;

import com.convpay.type.MoneyUseCancelResult;
import com.convpay.type.MoneyUseResult;

public class MoneyAdapter {
    public MoneyUseResult use(Integer payAmount) {
        System.out.println("MonetAdapter.use : " + payAmount);

        if (payAmount > 1000_000) {
            return MoneyUseResult.USE_FAIL;
        }
        return MoneyUseResult.USE_SUCCESS;
    }

    public MoneyUseCancelResult useCancel(Integer payCancelAmount) {
        System.out.println("MonetAdapter.useCancel : " + payCancelAmount);

        if (payCancelAmount < 100) {
            return MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL;
        }
        return MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS;
    }
}
