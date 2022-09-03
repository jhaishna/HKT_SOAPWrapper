package com.jaishna.soapwrapper.model;

public class AcctCreditStatus {

    private String acctNum;
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
