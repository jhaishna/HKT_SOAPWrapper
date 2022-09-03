package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

import java.util.List;

public class BillingHistoryModelResponse {

    private String acctNum;
    private String divertLoc;
    private String divertRmnCycle;
    private List<BillHistoryDTO> listBillHistory;
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getDivertLoc() {
        return divertLoc;
    }

    public void setDivertLoc(String divertLoc) {
        this.divertLoc = divertLoc;
    }

    public String getDivertRmnCycle() {
        return divertRmnCycle;
    }

    public void setDivertRmnCycle(String divertRmnCycle) {
        this.divertRmnCycle = divertRmnCycle;
    }

    public List<BillHistoryDTO> getListBillHistory() {
        return listBillHistory;
    }

    public void setListBillHistory(List<BillHistoryDTO> listBillHistory) {
        this.listBillHistory = listBillHistory;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
