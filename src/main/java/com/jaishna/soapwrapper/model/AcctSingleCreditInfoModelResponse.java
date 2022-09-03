package com.jaishna.soapwrapper.model;

public class AcctSingleCreditInfoModelResponse {

        private String acctNum;
        private String acctStatus;
    private String billDay;
    private String bucketAmt0;
    private String bucketAmt1;
    private String bucketAmt2;
    private String bucketAmt3;
    private String creditStatus;
    private String dunningGroup;
    private Result result = new Result();
    private String totalOS;
    private String unbillCreditAdj;
    private String unbillDebitAdj;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public String getBucketAmt0() {
        return bucketAmt0;
    }

    public void setBucketAmt0(String bucketAmt0) {
        this.bucketAmt0 = bucketAmt0;
    }

    public String getBucketAmt1() {
        return bucketAmt1;
    }

    public void setBucketAmt1(String bucketAmt1) {
        this.bucketAmt1 = bucketAmt1;
    }

    public String getBucketAmt2() {
        return bucketAmt2;
    }

    public void setBucketAmt2(String bucketAmt2) {
        this.bucketAmt2 = bucketAmt2;
    }

    public String getBucketAmt3() {
        return bucketAmt3;
    }

    public void setBucketAmt3(String bucketAmt3) {
        this.bucketAmt3 = bucketAmt3;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getDunningGroup() {
        return dunningGroup;
    }

    public void setDunningGroup(String dunningGroup) {
        this.dunningGroup = dunningGroup;
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

    public String getUnbillCreditAdj() {
        return unbillCreditAdj;
    }

    public void setUnbillCreditAdj(String unbillCreditAdj) {
        this.unbillCreditAdj = unbillCreditAdj;
    }

    public String getUnbillDebitAdj() {
        return unbillDebitAdj;
    }

    public void setUnbillDebitAdj(String unbillDebitAdj) {
        this.unbillDebitAdj = unbillDebitAdj;
    }
}
