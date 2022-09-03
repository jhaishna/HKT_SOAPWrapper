package com.jaishna.soapwrapper.model.billing;

public class UbFreeEntDTO {
    private String callType;
    private String serviceType;
    private String unit;
    private String usedUsage;
    private String value;

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
