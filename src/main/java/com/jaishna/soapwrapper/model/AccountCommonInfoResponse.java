package com.jaishna.soapwrapper.model;

public class AccountCommonInfoResponse {

    private String acctNum;
    private String address;
    private String billDay;
    private String billFormat;
    private String billFormatKey;
    private String billMedium;
    private String creditStatus;
    private String currOS;
    private String currPymtDueDate;
    private String dunningGroup;
    private String emailAddress;
    private String futureBillDate;
    private String nextBillDate;
    private String prevBal;
    private String prevPymtDueDate;
    private Result result = new Result();
    private String smsNum;
    private String totalOS;
    private String unbillCreditAdj;
    private String unbillDebitAdj;
    private String unbillPymt;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public String getBillFormat() {
        return billFormat;
    }

    public void setBillFormat(String billFormat) {
        this.billFormat = billFormat;
    }

    public String getBillFormatKey() {
        return billFormatKey;
    }

    public void setBillFormatKey(String billFormatKey) {
        this.billFormatKey = billFormatKey;
    }

    public String getBillMedium() {
        return billMedium;
    }

    public void setBillMedium(String billMedium) {
        this.billMedium = billMedium;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getCurrOS() {
        return currOS;
    }

    public void setCurrOS(String currOS) {
        this.currOS = currOS;
    }

    public String getCurrPymtDueDate() {
        return currPymtDueDate;
    }

    public void setCurrPymtDueDate(String currPymtDueDate) {
        this.currPymtDueDate = currPymtDueDate;
    }

    public String getDunningGroup() {
        return dunningGroup;
    }

    public void setDunningGroup(String dunningGroup) {
        this.dunningGroup = dunningGroup;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFutureBillDate() {
        return futureBillDate;
    }

    public void setFutureBillDate(String futureBillDate) {
        this.futureBillDate = futureBillDate;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public String getPrevBal() {
        return prevBal;
    }

    public void setPrevBal(String prevBal) {
        this.prevBal = prevBal;
    }

    public String getPrevPymtDueDate() {
        return prevPymtDueDate;
    }

    public void setPrevPymtDueDate(String prevPymtDueDate) {
        this.prevPymtDueDate = prevPymtDueDate;
    }

    public String getSmsNum() {
        return smsNum;
    }

    public void setSmsNum(String smsNum) {
        this.smsNum = smsNum;
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

    public String getUnbillPymt() {
        return unbillPymt;
    }

    public void setUnbillPymt(String unbillPymt) {
        this.unbillPymt = unbillPymt;
    }

}
