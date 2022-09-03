package com.jaishna.soapwrapper.model.billing;

import com.jaishna.soapwrapper.model.Result;

import java.util.ArrayList;
import java.util.List;

public class UnbilledNEDayPassUsageModelResponse {

    private String msisdn;
    private String iccid;
    private String subId;
    private Result result = new Result();
    private String lastUpdDate;
    List<UbNEDayPassUsageDTO> ubNEDayPassUsageDTO = new ArrayList<>();

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

    public List<UbNEDayPassUsageDTO> getUbNEDayPassUsageDTO() {
        return ubNEDayPassUsageDTO;
    }

    public void setUbNEDayPassUsageDTO(List<UbNEDayPassUsageDTO> ubNEDayPassUsageDTO) {
        this.ubNEDayPassUsageDTO = ubNEDayPassUsageDTO;
    }
}
