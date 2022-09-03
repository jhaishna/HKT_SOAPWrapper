package com.jaishna.soapwrapper.model.payment;

import com.jaishna.soapwrapper.model.Result;

public class PaymentRejectStatusModelResponse {

    private String paymentRejectStatus;
    private String accountNumber;
    private Result result = new Result();

    public String getPaymentRejectStatus() {
        return paymentRejectStatus;
    }

    public void setPaymentRejectStatus(String paymentRejectStatus) {
        this.paymentRejectStatus = paymentRejectStatus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
