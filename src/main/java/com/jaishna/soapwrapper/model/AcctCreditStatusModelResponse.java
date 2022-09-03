package com.jaishna.soapwrapper.model;

public class AcctCreditStatusModelResponse {

    private String actionDate;
    private String creditStatus;
    private String hasPendingReq;
    private Result result = new Result();

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getHasPendingReq() {
        return hasPendingReq;
    }

    public void setHasPendingReq(String hasPendingReq) {
        this.hasPendingReq = hasPendingReq;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
