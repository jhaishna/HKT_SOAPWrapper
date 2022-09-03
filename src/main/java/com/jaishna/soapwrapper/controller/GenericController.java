package com.jaishna.soapwrapper.controller;

import com.jaishna.soapwrapper.model.general.CurrOSInfoModelInput;
import com.jaishna.soapwrapper.model.general.CurrOSInfoModelResponse;
import com.jaishna.soapwrapper.model.general.DunningHistoryModelInput;
import com.jaishna.soapwrapper.model.general.DunningHistoryModelResponse;
import com.jaishna.soapwrapper.service.GenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenericController.class);

    @Autowired
    private GenericService genericService;

    @RequestMapping(value = "/currOSInfo", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getCurrOSInfo(@RequestBody CurrOSInfoModelInput currOSInfoModelInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getCurrOSInfo..");
        CurrOSInfoModelResponse currOSInfoModelResponse = null;
        currOSInfoModelResponse = genericService.getCurrOSInfo(currOSInfoModelInput);
        if(currOSInfoModelResponse == null) {
            return new ResponseEntity<>(currOSInfoModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(currOSInfoModelResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/dunningHistory", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getDunningHistory(@RequestBody DunningHistoryModelInput dunningHistoryModelInput, @RequestHeader HttpHeaders headers) {
        LOGGER.info("getDunningHistory..");
        DunningHistoryModelResponse dunningHistoryModelResponse = null;
        dunningHistoryModelResponse = genericService.getDunningHistory(dunningHistoryModelInput);
        if(dunningHistoryModelResponse == null) {
            return new ResponseEntity<>(dunningHistoryModelResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(dunningHistoryModelResponse, HttpStatus.OK);
    }

}
