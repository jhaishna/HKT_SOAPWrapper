package com.jaishna.soapwrapper.controller;

import com.jaishna.soapwrapper.model.billing.*;
import com.jaishna.soapwrapper.service.BillingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/billing")
public class BillingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BillingController.class);

    @Autowired
    private BillingService billingService;


    @RequestMapping(value = "/billingHistory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getBillingHistory(@RequestBody BillingHistory billingHistory, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getBillingHistory..");
        BillingHistoryModelResponse billingHistoryResponse = null;
        billingHistoryResponse = billingService.getBillingHistory(billingHistory);
        if(billingHistoryResponse == null) {
            return new ResponseEntity<>(billingHistoryResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(billingHistoryResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/billingAddress", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getBillingAddress(@RequestBody BillingAddress billingAddress, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getBillingAddress..");
        BillingAddressModelResponse billingAddressModelResponse = null;
        billingAddressModelResponse = billingService.getBillingAddress(billingAddress);
        if(billingAddressModelResponse == null) {
            return new ResponseEntity<>(billingAddressModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(billingAddressModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/bomNextBillDate", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getBomNextBillDate(@RequestBody BomNextBillDate bomNextBillDate, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getBillingAddress..");
        BomNextBillDateModelResponse bomNextBillDateModelResponse = null;
        bomNextBillDateModelResponse = billingService.getBomNextBillDate(bomNextBillDate);
        if(bomNextBillDateModelResponse == null) {
            return new ResponseEntity<>(bomNextBillDateModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(bomNextBillDateModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/chargeItemizedBill", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getChargeItemizedBill(@RequestBody ChargeItemizedBillInput chargeItemizedBill, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getChargeItemizedBill..");
        ChargeItemizedBillModelResponse chargeItemizedBillModelResponse = null;
        chargeItemizedBillModelResponse = billingService.getChargeItemizedBill(chargeItemizedBill);
        if(chargeItemizedBillModelResponse == null) {
            return new ResponseEntity<>(chargeItemizedBillModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(chargeItemizedBillModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/listBillDate", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getListBillDate(@RequestBody ListBillDateInput listBillDateInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getListBillDate..");
        ListBillDateModelResponse listBillDateModelResponse = null;
        listBillDateModelResponse = billingService.getListBillDate(listBillDateInput);
        if(listBillDateModelResponse == null) {
            return new ResponseEntity<>(listBillDateModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(listBillDateModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/unbilledDailyRoamWifi", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getUnbilledDailyRoamWifi(@RequestBody UnbilledDailyRoamWifiInput unbilledDailyRoamWifiInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getUnbilledDailyRoamWifiRequest..");
        UnbilledDailyRoamWifiModelResponse unbilledDailyRoamWifiModelResponse = null;
        unbilledDailyRoamWifiModelResponse = billingService.getUnbilledDailyRoamWifi(unbilledDailyRoamWifiInput);
        if(unbilledDailyRoamWifiModelResponse == null) {
            return new ResponseEntity<>(unbilledDailyRoamWifiModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(unbilledDailyRoamWifiModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/unbillFreeEntitleInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getUnbillFreeEntitleInfo(@RequestBody UnbillFreeEntitleInfoInput unbillFreeEntitleInfoInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getUnbillFreeEntitleInfo..");
        UnbillFreeEntitleInfoModelResponse unbillFreeEntitleInfoModelResponse = null;
        unbillFreeEntitleInfoModelResponse = billingService.getUnbillFreeEntitleInfo(unbillFreeEntitleInfoInput);
        if(unbillFreeEntitleInfoModelResponse == null) {
            return new ResponseEntity<>(unbillFreeEntitleInfoModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(unbillFreeEntitleInfoModelResponse, HttpStatus.OK);
    }


    @RequestMapping(value = "/unbilledNEDayPassUsage", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getUnbilledNEDayPassUsage(@RequestBody UnbilledNEDayPassUsageInput unbilledNEDayPassUsageInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getUnbilledNEDayPassUsage..");
        UnbilledNEDayPassUsageModelResponse unbilledNEDayPassUsageModelResponse = null;
        unbilledNEDayPassUsageModelResponse = billingService.getUnbilledNEDayPassUsage(unbilledNEDayPassUsageInput);
        if(unbilledNEDayPassUsageModelResponse == null) {
            return new ResponseEntity<>(unbilledNEDayPassUsageModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(unbilledNEDayPassUsageModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/submitCSAutoBillReprint", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> submitCSAutoBillReprint(@RequestBody SubmitCSAutoBillReprintInput submitCSAutoBillReprintInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("submitCSAutoBillReprint..");
        SubmitCSAutoBillReprintInputModelResponse submitCSAutoBillReprintInputModelResponse = null;
        submitCSAutoBillReprintInputModelResponse = billingService.submitCSAutoBillReprint(submitCSAutoBillReprintInput);
        if(submitCSAutoBillReprintInputModelResponse == null) {
            return new ResponseEntity<>(submitCSAutoBillReprintInputModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(submitCSAutoBillReprintInputModelResponse, HttpStatus.OK);
    }


}
