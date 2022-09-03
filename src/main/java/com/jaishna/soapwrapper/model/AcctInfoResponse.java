package com.jaishna.soapwrapper.model;

public class AcctInfoResponse {

    private String acctNum;
    private String acctStatus;
    private String billFreq;
    private String billLang;
    private String pymtMethod;
    private String pymtNum;
    private Result result = new Result();
    private String splitAcctCode;
    private String unbillOnetime;

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

    public String getBillFreq() {
        return billFreq;
    }

    public void setBillFreq(String billFreq) {
        this.billFreq = billFreq;
    }

    public String getBillLang() {
        return billLang;
    }

    public void setBillLang(String billLang) {
        this.billLang = billLang;
    }

    public String getPymtMethod() {
        return pymtMethod;
    }

    public void setPymtMethod(String pymtMethod) {
        this.pymtMethod = pymtMethod;
    }

    public String getPymtNum() {
        return pymtNum;
    }

    public void setPymtNum(String pymtNum) {
        this.pymtNum = pymtNum;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getSplitAcctCode() {
        return splitAcctCode;
    }

    public void setSplitAcctCode(String splitAcctCode) {
        this.splitAcctCode = splitAcctCode;
    }

    public String getUnbillOnetime() {
        return unbillOnetime;
    }

    public void setUnbillOnetime(String unbillOnetime) {
        this.unbillOnetime = unbillOnetime;
    }

}
