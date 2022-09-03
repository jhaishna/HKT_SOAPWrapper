package com.jaishna.soapwrapper.model.billing;

public class BillDateDTO {

    private String acctNum;
    private String billDate;
    private String billSendStatus;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillSendStatus() {
        return billSendStatus;
    }

    public void setBillSendStatus(String billSendStatus) {
        this.billSendStatus = billSendStatus;
    }
}
