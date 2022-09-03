package com.jaishna.soapwrapper.model.payment;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class PaymentRejHistoryModelResponse {

    private String accountNumber;
    private String ccRejCount;
    private String autopayRejCnt;
    List<PaymentRejHistoryDTO> listPaymentRejHistory = new ArrayList<>();
    private Result result = new Result();

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCcRejCount() {
        return ccRejCount;
    }

    public void setCcRejCount(String ccRejCount) {
        this.ccRejCount = ccRejCount;
    }

    public String getAutopayRejCnt() {
        return autopayRejCnt;
    }

    public void setAutopayRejCnt(String autopayRejCnt) {
        this.autopayRejCnt = autopayRejCnt;
    }

    public List<PaymentRejHistoryDTO> getListPaymentRejHistory() {
        return listPaymentRejHistory;
    }

    public void setListPaymentRejHistory(List<PaymentRejHistoryDTO> listPaymentRejHistory) {
        this.listPaymentRejHistory = listPaymentRejHistory;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
