package com.jaishna.soapwrapper.utils;

import com.jaishna.soapwrapper.model.general.CurrOSInfoModelInput;
import com.jaishna.soapwrapper.model.general.DunningHistoryModelInput;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GenericValidator {

    public boolean validateCurrOSInfoRequest(CurrOSInfoModelInput currOSInfoModelInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(currOSInfoModelInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(currOSInfoModelInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(currOSInfoModelInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(currOSInfoModelInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(currOSInfoModelInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateDunningHistoryRequest(DunningHistoryModelInput dunningHistoryModelInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(dunningHistoryModelInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(dunningHistoryModelInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(dunningHistoryModelInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(dunningHistoryModelInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(dunningHistoryModelInput.getOperID())) {
            valid = false;
        }
        return valid;
    }


}
