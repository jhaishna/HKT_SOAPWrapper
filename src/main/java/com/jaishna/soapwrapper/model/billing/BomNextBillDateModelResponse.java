package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

public class BomNextBillDateModelResponse {

    private String acctNum;
    private String bomNextBillDate;
    private String bomStartBillDate;
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getBomNextBillDate() {
        return bomNextBillDate;
    }

    public void setBomNextBillDate(String bomNextBillDate) {
        this.bomNextBillDate = bomNextBillDate;
    }

    public String getBomStartBillDate() {
        return bomStartBillDate;
    }

    public void setBomStartBillDate(String bomStartBillDate) {
        this.bomStartBillDate = bomStartBillDate;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
