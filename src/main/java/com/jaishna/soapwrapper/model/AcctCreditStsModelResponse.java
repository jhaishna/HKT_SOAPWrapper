package com.jaishna.soapwrapper.model;

public class AcctCreditStsModelResponse {

    public String acctNum;
    public String creditStatus;
    private Result result = new Result();
    public String statusCode;
    public String totalOS;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTotalOS() {
        return totalOS;
    }

    public void setTotalOS(String totalOS) {
        this.totalOS = totalOS;
    }
}
