package com.jaishna.soapwrapper.model.billing;

public class UnbilledNEDayPassUsageInput {

    private String iccid;
    private String msisdn;
    private String neServiceID;
    private String offerGroup;
    private String subId;
    private String channel;
    private String deptID;
    private String lanID;
    private String operID;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getNeServiceID() {
        return neServiceID;
    }

    public void setNeServiceID(String neServiceID) {
        this.neServiceID = neServiceID;
    }

    public String getOfferGroup() {
        return offerGroup;
    }

    public void setOfferGroup(String offerGroup) {
        this.offerGroup = offerGroup;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
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
