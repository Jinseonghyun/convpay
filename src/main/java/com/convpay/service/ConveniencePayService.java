package com.convpay.service;

import com.convpay.dto.*;
import com.convpay.type.MoneyUseCancelResult;
import com.convpay.type.MoneyUseResult;
import com.convpay.type.PayCancelResult;
import com.convpay.type.PayResult;

public class ConveniencePayService {

    private final MoneyAdapter moneyAdapter = new MoneyAdapter();

    public PayResponse pay(PayRequest payRequest) {
        MoneyUseResult moneyUseResult =
                moneyAdapter.use(payRequest.getPayAmount());

        // fail fast  (if else 보다 많이 사용된다.)

        // Method()

        // Exception case1
        // Exception case2
        // Exception case3
        // Exception case4
        // Exception case5

        // Success Case(Only one

        if (moneyUseResult == MoneyUseResult.USE_FAIL) {
            return new PayResponse(PayResult.FAIL, 0);
        }

        // Success Case
        return new PayResponse(PayResult.SUCCESS, payRequest.getPayAmount());
    }

    public PayCancelResponse payCancel(PayCancelRequest payCancelRequest) {
        MoneyUseCancelResult moneyUseCancelResult = moneyAdapter.useCancel(payCancelRequest.getPayCancelAmount());

        if (moneyUseCancelResult == MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL) {
            return new PayCancelResponse(PayCancelResult.PAY_CANCEL_FAIL, 0);
        }

        // Success Case
        return new PayCancelResponse(PayCancelResult.PAY_CANCEL_SUCCESS, payCancelRequest.getPayCancelAmount());
    }
}
