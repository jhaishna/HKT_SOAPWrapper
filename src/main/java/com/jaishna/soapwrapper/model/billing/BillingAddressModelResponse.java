package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

public class BillingAddressModelResponse {

    private String acctNum;
    private String addrDesc1;
    private String addrDesc2;
    private String addrDesc3;
    private String addrDesc4;
    private String addrDesc5;
    private String addrDesc6;
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getAddrDesc1() {
        return addrDesc1;
    }

    public void setAddrDesc1(String addrDesc1) {
        this.addrDesc1 = addrDesc1;
    }

    public String getAddrDesc2() {
        return addrDesc2;
    }

    public void setAddrDesc2(String addrDesc2) {
        this.addrDesc2 = addrDesc2;
    }

    public String getAddrDesc3() {
        return addrDesc3;
    }

    public void setAddrDesc3(String addrDesc3) {
        this.addrDesc3 = addrDesc3;
    }

    public String getAddrDesc4() {
        return addrDesc4;
    }

    public void setAddrDesc4(String addrDesc4) {
        this.addrDesc4 = addrDesc4;
    }

    public String getAddrDesc5() {
        return addrDesc5;
    }

    public void setAddrDesc5(String addrDesc5) {
        this.addrDesc5 = addrDesc5;
    }

    public String getAddrDesc6() {
        return addrDesc6;
    }

    public void setAddrDesc6(String addrDesc6) {
        this.addrDesc6 = addrDesc6;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
