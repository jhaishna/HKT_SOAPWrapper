package com.jaishna.soapwrapper.model.general;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class DunningHistoryModelResponse {

    private String acctNum;
    private List<DunningHistoryDTO> listDunningHistory = new ArrayList<>();
    private Result result = new Result();

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public List<DunningHistoryDTO> getListDunningHistory() {
        return listDunningHistory;
    }

    public void setListDunningHistory(List<DunningHistoryDTO> listDunningHistory) {
        this.listDunningHistory = listDunningHistory;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
