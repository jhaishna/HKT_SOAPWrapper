package com.jaishna.soapwrapper.controller;

import com.jaishna.soapwrapper.model.*;
import com.jaishna.soapwrapper.service.AccountInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/account")
public class AccountInfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountInfoController.class);

    @Autowired
    private AccountInfoService accountInfoService;


    @RequestMapping(value = "/getAccountCommonInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getAccountCommonInfo(@RequestBody AccountCommonInfo accountCommonInfo, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getAccountCommonInfo..");
        AccountCommonInfoResponse accountCommonInfoResponse = null;
        accountCommonInfoResponse = accountInfoService.getAccountCommonInfo(accountCommonInfo);
        if(accountCommonInfoResponse == null) {
            /*if(accountCommonInfoResponse.getErrorCode()!=null && "400".equals(accountCommonInfoResponse.getErrorCode())) {
                return new ResponseEntity<>(accountCommonInfoResponse, HttpStatus.BAD_REQUEST);
            }*/
            return new ResponseEntity<>(accountCommonInfoResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(accountCommonInfoResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/accountInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> accountInfo(@RequestBody AcctInfo acctInfo, @RequestHeader HttpHeaders headers) {
        LOGGER.info("accountInfo..");
        AcctInfoResponse accountInfoResponse = null;
        accountInfoResponse = accountInfoService.acctInfo(acctInfo);
        if(accountInfoResponse == null) {
            /*if(accountCommonInfoResponse.getErrorCode()!=null && "400".equals(accountCommonInfoResponse.getErrorCode())) {
                return new ResponseEntity<>(accountCommonInfoResponse, HttpStatus.BAD_REQUEST);
            }*/
            return new ResponseEntity<>(accountInfoResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(accountInfoResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/acctCreditSts", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> acctCreditSts(@RequestBody AcctCreditSts acctCreditStatus, @RequestHeader HttpHeaders headers) {
        LOGGER.info("acctCreditStatusRequest..");
        AcctCreditStsModelResponse acctCreditStsModelResponse = null;
        acctCreditStsModelResponse = accountInfoService.acctCreditSts(acctCreditStatus);
        if(acctCreditStsModelResponse == null) {
            return new ResponseEntity<>(acctCreditStsModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(acctCreditStsModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/acctCreditStatus", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> acctCreditStatus(@RequestBody AcctCreditStatus acctCreditStatus, @RequestHeader HttpHeaders headers) {
        LOGGER.info("acctCreditStatusRequest..");
        AcctCreditStatusModelResponse acctCreditStatusModelResponse = null;
        acctCreditStatusModelResponse = accountInfoService.acctCreditStatus(acctCreditStatus);
        if(acctCreditStatusModelResponse == null) {
            return new ResponseEntity<>(acctCreditStatusModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(acctCreditStatusModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/acctTotalOSBal", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> acctTotalOSBal(@RequestBody AcctTotalOSBal acctTotalOSBal, @RequestHeader HttpHeaders headers) {
        LOGGER.info("acctTotalOSBal..");
        AcctTotalOSBalModelResponse acctTotalOSBalModelResponse = null;
        acctTotalOSBalModelResponse = accountInfoService.acctTotalOSBal(acctTotalOSBal);
        if(acctTotalOSBalModelResponse == null) {
            return new ResponseEntity<>(acctTotalOSBalModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(acctTotalOSBalModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/acctOSPenalty", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> acctOSPenalty(@RequestBody AcctOSPenalty acctOSPenalty, @RequestHeader HttpHeaders headers) {
        LOGGER.info("acctOSPenalty..");
        AcctOSPenaltyModelResponse acctOSPenaltyModelResponse = null;
        acctOSPenaltyModelResponse = accountInfoService.acctOSPenalty(acctOSPenalty);
        if(acctOSPenaltyModelResponse == null) {
            return new ResponseEntity<>(acctOSPenaltyModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(acctOSPenaltyModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/acctSingleCreditInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> acctSingleCreditInfo(@RequestBody AcctSingleCreditInfo acctSingleCreditInfo, @RequestHeader HttpHeaders headers) {
        LOGGER.info("acctSingleCreditInfo..");
        AcctSingleCreditInfoModelResponse acctSingleCreditInfoModelResponse = null;
        acctSingleCreditInfoModelResponse = accountInfoService.acctSingleCreditInfo(acctSingleCreditInfo);
        if(acctSingleCreditInfoModelResponse == null) {
            return new ResponseEntity<>(acctSingleCreditInfoModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(acctSingleCreditInfoModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/validateAcctForHoldDunning", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> validateAcctForHoldDunning(@RequestBody ValidateAcctForHoldDunningInput validateAcctForHoldDunning, @RequestHeader HttpHeaders headers) {
        LOGGER.info("validateAcctForHoldDunning..");
        ValidateAcctForHoldDunningModelResponse validateAcctForHoldDunningModelResponse = null;
        validateAcctForHoldDunningModelResponse = accountInfoService.validateAcctForHoldDunning(validateAcctForHoldDunning);
        if(validateAcctForHoldDunningModelResponse == null) {
            return new ResponseEntity<>(validateAcctForHoldDunningModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(validateAcctForHoldDunningModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/submitAcctHoldDunning", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> submitAcctHoldDunning(@RequestBody SubmitAcctHoldDunningInput submitAcctHoldDunningInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("validateAcctForHoldDunning..");
        SubmitAcctHoldDunningModelResponse SubmitAcctHoldDunningModelResponse = null;
        SubmitAcctHoldDunningModelResponse = accountInfoService.getSubmitAcctHoldDunning(submitAcctHoldDunningInput);
        if(SubmitAcctHoldDunningModelResponse == null) {
            return new ResponseEntity<>(SubmitAcctHoldDunningModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(SubmitAcctHoldDunningModelResponse, HttpStatus.OK);
    }

}
