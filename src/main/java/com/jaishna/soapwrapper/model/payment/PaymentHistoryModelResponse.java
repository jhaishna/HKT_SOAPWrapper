package com.jaishna.soapwrapper.model.payment;

import com.jaishna.soapwrapper.model.Result;

import java.util.List;

public class PaymentHistoryModelResponse {

    private String acctNum;
    List<PaymentHistoryDTO> listPaymentHistory;
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public List<PaymentHistoryDTO> getListPaymentHistory() {
        return listPaymentHistory;
    }

    public void setListPaymentHistory(List<PaymentHistoryDTO> listPaymentHistory) {
        this.listPaymentHistory = listPaymentHistory;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
