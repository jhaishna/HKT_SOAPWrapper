package com.jaishna.soapwrapper.utils;

import com.jaishna.soapwrapper.model.billing.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class BillingValidator {

    public boolean validateBillingHistoryRequest(BillingHistory billHistory) {
        boolean valid = true;
        if(!StringUtils.hasLength(billHistory.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(billHistory.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(billHistory.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(billHistory.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(billHistory.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateBillingHistory(BillingAddress billingAddress) {
        boolean valid = true;
        if(!StringUtils.hasLength(billingAddress.getAccountNumber())) {
            valid = false;
        } else if(!StringUtils.hasLength(billingAddress.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(billingAddress.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(billingAddress.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(billingAddress.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateBomNextBillDate(BomNextBillDate bomNextBillDate) {
        boolean valid = true;
        if(!StringUtils.hasLength(bomNextBillDate.getAcctCode())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(bomNextBillDate.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateChargeItemizedBill(ChargeItemizedBillInput chargeItemizedBillInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(chargeItemizedBillInput.getCharge())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(chargeItemizedBillInput.getBillOfferingID())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(chargeItemizedBillInput.getAcctNum())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(chargeItemizedBillInput.getDescription())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(chargeItemizedBillInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(chargeItemizedBillInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(chargeItemizedBillInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(chargeItemizedBillInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateListBillDateInput(ListBillDateInput listBillDateInput) {
        boolean valid = true;
         if(!StringUtils.hasLength(listBillDateInput.getAcctNum())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(listBillDateInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(listBillDateInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(listBillDateInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(listBillDateInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateUnbilledDailyRoamWifi(UnbilledDailyRoamWifiInput unbilledDailyRoamWifiInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getSubId())) {
            valid = false;
        }else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getIccid())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledDailyRoamWifiInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateUnbillFreeEntitleInfo(UnbillFreeEntitleInfoInput unbillFreeEntitleInfoInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getSubId())) {
            valid = false;
        }else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getIccid())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbillFreeEntitleInfoInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean validateUnbilledNEDayPassUsage(UnbilledNEDayPassUsageInput unbilledNEDayPassUsageInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getMsisdn())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getSubId())) {
            valid = false;
        }else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getIccid())) {
            valid = false;
        }else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getOfferGroup())) {
            valid = false;
        }else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getNeServiceID())) {
            valid = false;
        }
        else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(unbilledNEDayPassUsageInput.getOperID())) {
            valid = false;
        }
        return valid;
    }

    public boolean submitCSAutoBillReprintInput(SubmitCSAutoBillReprintInput submitCSAutoBillReprintInput) {
        boolean valid = true;
        if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getBillCycle())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getBillType())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getAcctNum())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getChannel())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getDeptID())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getLanID())) {
            valid = false;
        } else if(!StringUtils.hasLength(submitCSAutoBillReprintInput.getOperID())) {
            valid = false;
        }
        return valid;
    }


}
