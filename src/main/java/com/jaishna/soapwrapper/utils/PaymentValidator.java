package com.jaishna.soapwrapper.utils;

import com.jaishna.soapwrapper.model.payment.PaymentHistoryModelInput;
import com.jaishna.soapwrapper.model.payment.PaymentRejHistoryModelInput;
import com.jaishna.soapwrapper.model.payment.PaymentRejectStatusModelInput;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PaymentValidator {

    public boolean validatePaymentHistory(PaymentHistoryModelInput paymentHistoryModelInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(paymentHistoryModelInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentHistoryModelInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentHistoryModelInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentHistoryModelInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentHistoryModelInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validatePaymentRejHistory(PaymentRejHistoryModelInput paymentRejHistoryModelInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(paymentRejHistoryModelInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejHistoryModelInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejHistoryModelInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejHistoryModelInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejHistoryModelInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validatePaymentRejectStatus(PaymentRejectStatusModelInput paymentRejStatusModelInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(paymentRejStatusModelInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejStatusModelInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejStatusModelInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejStatusModelInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(paymentRejStatusModelInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

}
