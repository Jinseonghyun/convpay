package com.convpay.service;

import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.dto.PayResult;

public class ConveniencePayService {
    public PayResponse pay(PayRequest payRequest) {
        return new PayResponse(PayResult.SUCCESS, 100);
    }

    public void payCancel() {

    }
}
