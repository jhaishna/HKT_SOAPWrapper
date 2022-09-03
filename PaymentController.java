package com.jaishna.soapwrapper.controller;

import com.jaishna.soapwrapper.model.payment.*;
import com.jaishna.soapwrapper.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/paymentHistory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getPaymentHistory(@RequestBody PaymentHistoryModelInput paymentHistoryModelInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getPaymentHistory..");
        PaymentHistoryModelResponse paymentHistoryModelResponse = null;
        paymentHistoryModelResponse = paymentService.getPaymentHistory(paymentHistoryModelInput);
        if(paymentHistoryModelResponse == null) {
            return new ResponseEntity<>(paymentHistoryModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(paymentHistoryModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/paymentRejHistory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getPaymentRejHistory(@RequestBody PaymentRejHistoryModelInput paymentRejHistoryModelInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getPaymentRejHistory..");
        PaymentRejHistoryModelResponse paymentRejHistoryModelResponse = null;
        paymentRejHistoryModelResponse = paymentService.getPaymentRejHistory(paymentRejHistoryModelInput);
        if(paymentRejHistoryModelResponse == null) {
            return new ResponseEntity<>(paymentRejHistoryModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(paymentRejHistoryModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/paymentRejectStatus", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getPaymentRejectStatus(@RequestBody PaymentRejectStatusModelInput paymentRejStatusModelInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getPaymentRejectStatus..");
        PaymentRejectStatusModelResponse paymentRejectStatusModelResponse = null;
        paymentRejectStatusModelResponse = paymentService.getPaymentRejectStatus(paymentRejStatusModelInput);
        if(paymentRejectStatusModelResponse == null) {
            return new ResponseEntity<>(paymentRejectStatusModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(paymentRejectStatusModelResponse, HttpStatus.OK);
    }

}
