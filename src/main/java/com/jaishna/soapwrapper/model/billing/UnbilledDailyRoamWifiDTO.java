package com.jaishna.soapwrapper.model.billing;

public class UnbilledDailyRoamWifiDTO {

    private String callType;
    private String freeEntitle;
    private String inScopeUsedUsage;
    private String lastUpdDate;
    private String serviceType;
    private String startDate;
    private String unit;
    private String usedUsage;

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getFreeEntitle() {
        return freeEntitle;
    }

    public void setFreeEntitle(String freeEntitle) {
        this.freeEntitle = freeEntitle;
    }

    public String getInScopeUsedUsage() {
        return inScopeUsedUsage;
    }

    public void setInScopeUsedUsage(String inScopeUsedUsage) {
        this.inScopeUsedUsage = inScopeUsedUsage;
    }

    public String getLastUpdDate() {
        return lastUpdDate;
    }

    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUsedUsage() {
        return usedUsage;
    }

    public void setUsedUsage(String usedUsage) {
        this.usedUsage = usedUsage;
    }
}
