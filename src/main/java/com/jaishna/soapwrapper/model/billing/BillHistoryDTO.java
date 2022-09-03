package com.jaishna.soapwrapper.model.billing;

public class BillHistoryDTO {

    private String billAmt;
    private String billCycle;
    private String billDate;
    private String billSendOutSts;
    private String billSts;
    private String billType;
    private String releaseDate;
    private String sendOutDate;

    public String getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(String billAmt) {
        this.billAmt = billAmt;
    }

    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillSendOutSts() {
        return billSendOutSts;
    }

    public void setBillSendOutSts(String billSendOutSts) {
        this.billSendOutSts = billSendOutSts;
    }

    public String getBillSts() {
        return billSts;
    }

    public void setBillSts(String billSts) {
        this.billSts = billSts;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSendOutDate() {
        return sendOutDate;
    }

    public void setSendOutDate(String sendOutDate) {
        this.sendOutDate = sendOutDate;
    }
}
