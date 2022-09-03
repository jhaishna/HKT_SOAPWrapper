package com.jaishna.soapwrapper.model;

public class ValidateAcctForHoldDunningModelResponse {

    private String canDoHoldDunning;
    private Result result = new Result();

    public String getCanDoHoldDunning() {
        return canDoHoldDunning;
    }

    public void setCanDoHoldDunning(String canDoHoldDunning) {
        this.canDoHoldDunning = canDoHoldDunning;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
