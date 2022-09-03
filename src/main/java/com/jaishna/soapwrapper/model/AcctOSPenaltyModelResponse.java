package com.jaishna.soapwrapper.model;

public class AcctOSPenaltyModelResponse {

    private String acctNum;
    private String osPenaltyAmt;
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getOsPenaltyAmt() {
        return osPenaltyAmt;
    }

    public void setOsPenaltyAmt(String osPenaltyAmt) {
        this.osPenaltyAmt = osPenaltyAmt;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
