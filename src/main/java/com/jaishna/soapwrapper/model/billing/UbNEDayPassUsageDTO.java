package com.jaishna.soapwrapper.model.billing;

import java.util.ArrayList;
import java.util.List;

public class UbNEDayPassUsageDTO {

    private List<UbNEDayPassDTO> ubNEDayPassDTOList = new ArrayList<>();
    private String neDayPassChiDescription;
    private String neDayPassEngDescription;

    public List<UbNEDayPassDTO> getUbNEDayPassDTOList() {
        return ubNEDayPassDTOList;
    }

    public void setUbNEDayPassDTOList(List<UbNEDayPassDTO> ubNEDayPassDTOList) {
        this.ubNEDayPassDTOList = ubNEDayPassDTOList;
    }

    public String getNeDayPassChiDescription() {
        return neDayPassChiDescription;
    }

    public void setNeDayPassChiDescription(String neDayPassChiDescription) {
        this.neDayPassChiDescription = neDayPassChiDescription;
    }

    public String getNeDayPassEngDescription() {
        return neDayPassEngDescription;
    }

    public void setNeDayPassEngDescription(String neDayPassEngDescription) {
        this.neDayPassEngDescription = neDayPassEngDescription;
    }
}
