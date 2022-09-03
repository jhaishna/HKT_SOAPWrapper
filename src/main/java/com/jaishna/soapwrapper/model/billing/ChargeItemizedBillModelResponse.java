package com.jaishna.soapwrapper.model.billing;

public class ChargeItemizedBillModelResponse {

    private String errCode;
    private String errMsg;
    private String resultRefCode;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getResultRefCode() {
        return resultRefCode;
    }

    public void setResultRefCode(String resultRefCode) {
        this.resultRefCode = resultRefCode;
    }
}
