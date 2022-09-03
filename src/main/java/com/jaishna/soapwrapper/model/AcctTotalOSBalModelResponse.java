package com.jaishna.soapwrapper.model;

public class AcctTotalOSBalModelResponse {

    private String acctId;
    private String billCutoffDate;
    private String currOSBal;
    private String pymtDueDate;
    private Result result = new Result();
    private String totalOSBal;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getBillCutoffDate() {
        return billCutoffDate;
    }

    public void setBillCutoffDate(String billCutoffDate) {
        this.billCutoffDate = billCutoffDate;
    }

    public String getCurrOSBal() {
        return currOSBal;
    }

    public void setCurrOSBal(String currOSBal) {
        this.currOSBal = currOSBal;
    }

    public String getPymtDueDate() {
        return pymtDueDate;
    }

    public void setPymtDueDate(String pymtDueDate) {
        this.pymtDueDate = pymtDueDate;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getTotalOSBal() {
        return totalOSBal;
    }

    public void setTotalOSBal(String totalOSBal) {
        this.totalOSBal = totalOSBal;
    }
}
