package com.jaishna.soapwrapper.model.general;

import com.jaishna.soapwrapper.model.Result;

public class CurrOSInfoModelResponse {

    private String acctNum;
    private String billDay;
    private String creditStatus;
    private String creditStsCode;
    private String currOS;
    private Result result = new Result();
    private String totalOS;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getCreditStsCode() {
        return creditStsCode;
    }

    public void setCreditStsCode(String creditStsCode) {
        this.creditStsCode = creditStsCode;
    }

    public String getCurrOS() {
        return currOS;
    }

    public void setCurrOS(String currOS) {
        this.currOS = currOS;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getTotalOS() {
        return totalOS;
    }

    public void setTotalOS(String totalOS) {
        this.totalOS = totalOS;
    }
}
