package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class UnbilledDailyRoamWifiModelResponse {

    private String msisdn;
    private String iccid;
    private String subId;
    private Result result = new Result();
    List<UnbilledDailyRoamWifiDTO> unbilledDailyRoamWifiDTOS = new ArrayList<>();

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

    public List<UnbilledDailyRoamWifiDTO> getUnbilledDailyRoamWifiDTOS() {
        return unbilledDailyRoamWifiDTOS;
    }

    public void setUnbilledDailyRoamWifiDTOS(List<UnbilledDailyRoamWifiDTO> unbilledDailyRoamWifiDTOS) {
        this.unbilledDailyRoamWifiDTOS = unbilledDailyRoamWifiDTOS;
    }
}
