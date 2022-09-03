package com.jaishna.soapwrapper.model.billing;

public class ChargeItemizedBillInput {

    private String acctNum;
    private String billOfferingID;
    private String charge;
    private String description;
    private String msisdn;
    private String channel;
    private String deptID;
    private String lanID;
    private String operID;

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getBillOfferingID() {
        return billOfferingID;
    }

    public void setBillOfferingID(String billOfferingID) {
        this.billOfferingID = billOfferingID;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDeptID() {
        return deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getLanID() {
        return lanID;
    }

    public void setLanID(String lanID) {
        this.lanID = lanID;
    }

    public String getOperID() {
        return operID;
    }

    public void setOperID(String operID) {
        this.operID = operID;
    }
}
