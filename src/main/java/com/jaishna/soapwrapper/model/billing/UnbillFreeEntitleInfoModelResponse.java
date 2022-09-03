package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class UnbillFreeEntitleInfoModelResponse {

    private String msisdn;
    private String iccid;
    private String subId;
    private Result result = new Result();
    private String lastUpdDate;
    List<UbFreeEntDTO> unbilledFreeEntDTOs = new ArrayList<>();

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getLastUpdDate() {
        return lastUpdDate;
    }

    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate;
    }

    public List<UbFreeEntDTO> getUnbilledFreeEntDTOs() {
        return unbilledFreeEntDTOs;
    }

    public void setUnbilledFreeEntDTOs(List<UbFreeEntDTO> unbilledFreeEntDTOs) {
        this.unbilledFreeEntDTOs = unbilledFreeEntDTOs;
    }
}
