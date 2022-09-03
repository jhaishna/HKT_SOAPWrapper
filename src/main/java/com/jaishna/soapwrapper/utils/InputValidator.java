package com.jaishna.soapwrapper.utils;

import com.jaishna.soapwrapper.gen.SubmitAcctHoldDunningReq;
import com.jaishna.soapwrapper.model.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class InputValidator {

    public boolean validateInputRequest(AccountCommonInfo accountCommonInfo) {
        boolean valid = true;
        if(!StringUtils.hasLength(accountCommonInfo.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(accountCommonInfo.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(accountCommonInfo.getOperationId())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctInfoRequest(AcctInfo acctInfo) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctInfo.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctInfo.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctInfo.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctInfo.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctInfo.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctSingleCreditInfo(AcctSingleCreditInfo acctSingleCreditInfo) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctSingleCreditInfo.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctSingleCreditInfo.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctSingleCreditInfo.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctSingleCreditInfo.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctSingleCreditInfo.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctOSPenaltyRequest(AcctOSPenalty acctOSPenalty) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctOSPenalty.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctOSPenalty.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctOSPenalty.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctOSPenalty.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctOSPenalty.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctCreditStsRequest(AcctCreditSts acctCreditSts) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctCreditSts.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditSts.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditSts.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditSts.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditSts.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctCreditStatusRequest(AcctCreditStatus acctCreditStatus) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctCreditStatus.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditStatus.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditStatus.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditStatus.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctCreditStatus.getOperID())) {
            valid = false;
        }
        return valid;
    }



    public boolean validateAcctTotalOSBalRequest(AcctTotalOSBal acctTotalOSBal) {
        boolean valid = true;
        if(!StringUtils.hasLength(acctTotalOSBal.getAcctCode())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(acctTotalOSBal.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateAcctForHoldDunningInput(ValidateAcctForHoldDunningInput validateAcctForHoldDunning) {
        boolean valid = true;
        if(!StringUtils.hasLength(validateAcctForHoldDunning.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(validateAcctForHoldDunning.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(validateAcctForHoldDunning.getOperID())) {
            valid = false;
        } else if(!StringUtils.hasLength(validateAcctForHoldDunning.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(validateAcctForHoldDunning.getLanID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateSubmitAcctHoldDunning(SubmitAcctHoldDunningInput submitAcctHoldDunningInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(submitAcctHoldDunningInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitAcctHoldDunningInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitAcctHoldDunningInput.getOperID())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitAcctHoldDunningInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitAcctHoldDunningInput.getLanID())) {
            valid = false;
        }
        return valid;
    }

}
