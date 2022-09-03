package com.jaishna.soapwrapper.service;

import com.jaishna.soapwrapper.gen.*;
import com.jaishna.soapwrapper.gen.AcctInfoResponse;
import com.jaishna.soapwrapper.model.*;
import com.jaishna.soapwrapper.model.ValidateAcctForHoldDunningInput;
import com.jaishna.soapwrapper.utils.InputValidator;
import com.jaishna.soapwrapper.utils.RequestCreator;
import com.jaishna.soapwrapper.utils.WSSecurityHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;

@Service
public class AccountInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountInfoService.class);

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private InputValidator inputValidator;

    @Autowired
    private RequestCreator requestCreator;

    @Autowired
    WSSecurityHeader wsSecurityHeader;

    @Value("${webservice.endpoint}")
    private String endpoint;

    private WebServiceTemplate webServiceTemplate;

    public GetAcctCommonInfoResponse getAccountCommonInfoWS(GetAcctCommonInfo request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetAcctCommonInfoResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public GetAcctInfoResponse accountInfoWS(GetAcctInfo request){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetAcctInfoResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public GetAcctCreditStsResponse acctCreditStsWS(GetAcctCreditSts request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetAcctCreditStsResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public GetAcctCreditStatusResponse acctCreditStatusWS(GetAcctCreditStatus request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetAcctCreditStatusResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public AcctTotalOSBalResponse acctTotalOSBalWS(AcctTotalOSBalRequest request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (AcctTotalOSBalResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public AcctOSPenaltyResponse acctOSPenaltyWS(AcctOSPenaltyRequest request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (AcctOSPenaltyResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public GetAcctSingleCreditInfoResponse acctSingleCreditInfoWS(GetAcctSingleCreditInfo request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetAcctSingleCreditInfoResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public ValidateAcctForHoldDunningResponse validateAcctForHoldDunningWS(ValidateAcctForHoldDunning request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (ValidateAcctForHoldDunningResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public SubmitAcctHoldDunningReqResponse submitAcctHoldDunningWS(SubmitAcctHoldDunningReq request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (SubmitAcctHoldDunningReqResponse) webServiceTemplate.marshalSendAndReceive(endpoint,request,wsSecurityHeader);
    }

    public AccountCommonInfoResponse getAccountCommonInfo(AccountCommonInfo accountCommonInfo) {
        AccountCommonInfoResponse accountCommonInfoResponse = null;
        if(inputValidator.validateInputRequest(accountCommonInfo)) {
            GetAcctCommonInfo request = requestCreator.createAcctCommonInfoRequest(accountCommonInfo);
            try {
                GetAcctCommonInfoResponse response = getAccountCommonInfoWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                accountCommonInfoResponse = parseResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return accountCommonInfoResponse;
    }

    AccountCommonInfoResponse parseResponse(GetAcctCommonInfoResponse response) {
        AccountCommonInfoResponse accountCommonInfoResponse = new AccountCommonInfoResponse();
        JAXBElement<AcctCommonInfoResponse> acctCommonInfoResponseElement = response.getReturn();
        AcctCommonInfoResponse acctCommonInfoResponse = acctCommonInfoResponseElement.getValue();
        JAXBElement<MrbEsbAcctCommonInfoResultDTO> resultDTO = acctCommonInfoResponse.getAcctCommonInfoResultDTO();
        MrbEsbAcctCommonInfoResultDTO mrbEsbAcctCommonInfoResultDTO = resultDTO.getValue();
        accountCommonInfoResponse.setAcctNum(mrbEsbAcctCommonInfoResultDTO.getAcctNum()!= null ? mrbEsbAcctCommonInfoResultDTO.getAcctNum().getValue() : "");
        if(mrbEsbAcctCommonInfoResultDTO.getAddress()!= null && StringUtils.hasLength(mrbEsbAcctCommonInfoResultDTO.getAddress().getValue())) {
            accountCommonInfoResponse.setAddress(mrbEsbAcctCommonInfoResultDTO.getAddress().getValue().trim());
        } else {
            accountCommonInfoResponse.setAddress("");
        }
        if(mrbEsbAcctCommonInfoResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbAcctCommonInfoResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                accountCommonInfoResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                accountCommonInfoResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    accountCommonInfoResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    accountCommonInfoResponse.getResult().setResultRefCode("");
                }
            }
        }
        accountCommonInfoResponse.setBillDay(mrbEsbAcctCommonInfoResultDTO.getBillDay()!= null ? mrbEsbAcctCommonInfoResultDTO.getBillDay().getValue() : "");
        accountCommonInfoResponse.setBillFormat(mrbEsbAcctCommonInfoResultDTO.getBillFormat()!= null ? mrbEsbAcctCommonInfoResultDTO.getBillFormat().getValue() : "");
        accountCommonInfoResponse.setBillFormatKey(mrbEsbAcctCommonInfoResultDTO.getBillFormatKey()!= null ? mrbEsbAcctCommonInfoResultDTO.getBillFormatKey().getValue() : "");
        accountCommonInfoResponse.setBillMedium(mrbEsbAcctCommonInfoResultDTO.getBillMedium()!= null ? mrbEsbAcctCommonInfoResultDTO.getBillMedium().getValue() : "");
        accountCommonInfoResponse.setCreditStatus(mrbEsbAcctCommonInfoResultDTO.getCreditStatus()!= null ? mrbEsbAcctCommonInfoResultDTO.getCreditStatus().getValue() : "");
        accountCommonInfoResponse.setCurrOS(mrbEsbAcctCommonInfoResultDTO.getCurrOS()!= null ? mrbEsbAcctCommonInfoResultDTO.getCurrOS().getValue() : "");
        accountCommonInfoResponse.setCurrPymtDueDate(mrbEsbAcctCommonInfoResultDTO.getCurrPymtDueDate()!= null ? mrbEsbAcctCommonInfoResultDTO.getCurrPymtDueDate().getValue() : "");
        accountCommonInfoResponse.setDunningGroup(mrbEsbAcctCommonInfoResultDTO.getDunningGroup()!= null ? mrbEsbAcctCommonInfoResultDTO.getDunningGroup().getValue() : "");
        accountCommonInfoResponse.setEmailAddress(mrbEsbAcctCommonInfoResultDTO.getEmailAddress()!= null ? mrbEsbAcctCommonInfoResultDTO.getEmailAddress().getValue() : "");
        accountCommonInfoResponse.setFutureBillDate(mrbEsbAcctCommonInfoResultDTO.getFutureBillDate()!= null ? mrbEsbAcctCommonInfoResultDTO.getFutureBillDate().getValue() : "");
        accountCommonInfoResponse.setNextBillDate(mrbEsbAcctCommonInfoResultDTO.getNextBillDate()!= null ? mrbEsbAcctCommonInfoResultDTO.getNextBillDate().getValue() : "");
        accountCommonInfoResponse.setPrevBal(mrbEsbAcctCommonInfoResultDTO.getPrevBal()!= null ? mrbEsbAcctCommonInfoResultDTO.getPrevBal().getValue() : "");
        accountCommonInfoResponse.setPrevPymtDueDate(mrbEsbAcctCommonInfoResultDTO.getPrevPymtDueDate()!= null ? mrbEsbAcctCommonInfoResultDTO.getPrevPymtDueDate().getValue() : "");
        accountCommonInfoResponse.setSmsNum(mrbEsbAcctCommonInfoResultDTO.getSmsNum()!= null ? mrbEsbAcctCommonInfoResultDTO.getSmsNum().getValue() : "");
        accountCommonInfoResponse.setTotalOS(mrbEsbAcctCommonInfoResultDTO.getTotalOS()!= null ? mrbEsbAcctCommonInfoResultDTO.getTotalOS().getValue() : "");
        accountCommonInfoResponse.setUnbillCreditAdj(mrbEsbAcctCommonInfoResultDTO.getUnbillCreditAdj()!= null ? mrbEsbAcctCommonInfoResultDTO.getUnbillCreditAdj().getValue() : "");
        accountCommonInfoResponse.setUnbillDebitAdj(mrbEsbAcctCommonInfoResultDTO.getUnbillDebitAdj()!= null ? mrbEsbAcctCommonInfoResultDTO.getUnbillDebitAdj().getValue() : "");
        accountCommonInfoResponse.setUnbillPymt(mrbEsbAcctCommonInfoResultDTO.getUnbillPymt()!= null ? mrbEsbAcctCommonInfoResultDTO.getUnbillPymt().getValue(): "");
        return accountCommonInfoResponse;
    }

    public com.jaishna.soapwrapper.model.AcctInfoResponse acctInfo(AcctInfo acctInfo) {
        LOGGER.info("acctInfo.. in service...");
        com.jaishna.soapwrapper.model.AcctInfoResponse finalResponse = null;
        if(inputValidator.validateAcctInfoRequest(acctInfo)) {
            GetAcctInfo request = requestCreator.createAcctInfoRequest(acctInfo);
            try {
                GetAcctInfoResponse response = accountInfoWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                finalResponse = parseAcctInfoResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return finalResponse;
    }

    com.jaishna.soapwrapper.model.AcctInfoResponse parseAcctInfoResponse(GetAcctInfoResponse response) {
        com.jaishna.soapwrapper.model.AcctInfoResponse finalResponse = new com.jaishna.soapwrapper.model.AcctInfoResponse();
        JAXBElement<AcctInfoResponse> acctInfoResponseElement = response.getReturn();
        AcctInfoResponse acctInfoResponse = acctInfoResponseElement.getValue();
        JAXBElement<MrbEsbAcctInfoResultDTO> mrbEsbAcctInfoResultDTOElement = acctInfoResponse.getAcctInfoResultDTO();
        MrbEsbAcctInfoResultDTO mrbEsbAcctInfoResultDTO = mrbEsbAcctInfoResultDTOElement.getValue();
        finalResponse.setAcctNum(mrbEsbAcctInfoResultDTO.getAcctNum()!=null ? mrbEsbAcctInfoResultDTO.getAcctNum().getValue() : "");
        finalResponse.setAcctStatus(mrbEsbAcctInfoResultDTO.getAcctStatus()!=null ? mrbEsbAcctInfoResultDTO.getAcctStatus().getValue() : "");
        finalResponse.setBillFreq(mrbEsbAcctInfoResultDTO.getBillFreq()!=null ? mrbEsbAcctInfoResultDTO.getBillFreq().getValue() : "");
        finalResponse.setBillLang(mrbEsbAcctInfoResultDTO.getBillLang()!=null ? mrbEsbAcctInfoResultDTO.getBillLang().getValue() : "");
        finalResponse.setPymtMethod(mrbEsbAcctInfoResultDTO.getPymtMethod()!=null ? mrbEsbAcctInfoResultDTO.getPymtMethod().getValue() : "");
        finalResponse.setPymtNum(mrbEsbAcctInfoResultDTO.getPymtNum()!=null ? mrbEsbAcctInfoResultDTO.getPymtNum().getValue() : "");
        if(mrbEsbAcctInfoResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbAcctInfoResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                finalResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                finalResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    finalResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    finalResponse.getResult().setResultRefCode("");
                }
            }
        }
        finalResponse.setSplitAcctCode(mrbEsbAcctInfoResultDTO.getSplitAcctCode()!=null ? mrbEsbAcctInfoResultDTO.getSplitAcctCode().getValue() : "");
        finalResponse.setUnbillOnetime(mrbEsbAcctInfoResultDTO.getUnbillOnetime()!=null ? mrbEsbAcctInfoResultDTO.getUnbillOnetime().getValue() : "");
        return finalResponse;
    }

    public AcctCreditStatusModelResponse acctCreditStatus(AcctCreditStatus acctCreditStatus) {
        AcctCreditStatusModelResponse acctCreditStatusModelResponse = null;
        if(inputValidator.validateAcctCreditStatusRequest(acctCreditStatus)) {
            GetAcctCreditStatus request = requestCreator.createAcctCreditStatusRequest(acctCreditStatus);
            try {
                GetAcctCreditStatusResponse response = acctCreditStatusWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                acctCreditStatusModelResponse = parseAcctCreditStatusResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return acctCreditStatusModelResponse;
    }

    public AcctCreditStsModelResponse acctCreditSts(AcctCreditSts acctCreditStatus) {
        AcctCreditStsModelResponse acctCreditStatusResponse = null;
        if(inputValidator.validateAcctCreditStsRequest(acctCreditStatus)) {
            GetAcctCreditSts request = requestCreator.createAcctCreditStsRequest(acctCreditStatus);
            try {
                GetAcctCreditStsResponse response = acctCreditStsWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                acctCreditStatusResponse = parseAcctCreditStsResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return acctCreditStatusResponse;
    }

    AcctCreditStsModelResponse parseAcctCreditStsResponse(GetAcctCreditStsResponse response) {
        AcctCreditStsModelResponse statusResponse = new AcctCreditStsModelResponse();
        JAXBElement<GetAcctCreditStsResponse2> response2Element = response.getReturn();
        GetAcctCreditStsResponse2 response2 = response2Element.getValue();
        JAXBElement<MrbEsbAcctCreditStsResultDTO> resultDTOJAXBElement = response2.getAcctCreditStsResultDTO();
        MrbEsbAcctCreditStsResultDTO resultDTO = resultDTOJAXBElement.getValue();
        statusResponse.setAcctNum(resultDTO.getAcctNum()!=null ? resultDTO.getAcctNum().getValue() : "");
        statusResponse.setCreditStatus(resultDTO.getCreditStatus()!=null ? resultDTO.getCreditStatus().getValue() : "");
        statusResponse.setStatusCode(resultDTO.getStatusCode()!=null ? resultDTO.getStatusCode().getValue() : "");
        statusResponse.setTotalOS(resultDTO.getTotalOS()!=null ? resultDTO.getTotalOS().getValue() : "");
        if(resultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = resultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                statusResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                statusResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    statusResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    statusResponse.getResult().setResultRefCode("");
                }
            }
        }
        return statusResponse;
    }

    private AcctCreditStatusModelResponse parseAcctCreditStatusResponse(GetAcctCreditStatusResponse response) {
        AcctCreditStatusModelResponse acctCreditStatusModelResponse = new AcctCreditStatusModelResponse();
        JAXBElement<AcctCreditStatusResponse> acctCreditStatusResponseJAXBElement = response.getReturn();
        AcctCreditStatusResponse acctCreditStatusResponse = acctCreditStatusResponseJAXBElement.getValue();
        JAXBElement<MrbEsbAcctCreditStatusDTO> mrbEsbAcctCreditStatusDTOJAXBElement = acctCreditStatusResponse.getAcctCreditStatusDTO();
        MrbEsbAcctCreditStatusDTO mrbEsbAcctCreditStatusDTO = mrbEsbAcctCreditStatusDTOJAXBElement.getValue();
        acctCreditStatusModelResponse.setCreditStatus(mrbEsbAcctCreditStatusDTO.getCreditStatus()!=null ? mrbEsbAcctCreditStatusDTO.getCreditStatus().getValue() : "");
        acctCreditStatusModelResponse.setActionDate(mrbEsbAcctCreditStatusDTO.getActionDate()!=null ? mrbEsbAcctCreditStatusDTO.getActionDate().getValue() : "");
        acctCreditStatusModelResponse.setHasPendingReq(mrbEsbAcctCreditStatusDTO.getHasPendingReq()!=null ? mrbEsbAcctCreditStatusDTO.getHasPendingReq().getValue() : "");
        if(mrbEsbAcctCreditStatusDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbAcctCreditStatusDTO.getResult();
            if(result != null && result.getValue()!=null) {
                acctCreditStatusModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                acctCreditStatusModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    acctCreditStatusModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    acctCreditStatusModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return acctCreditStatusModelResponse;
    }

    public AcctTotalOSBalModelResponse acctTotalOSBal(AcctTotalOSBal acctTotalOSBal) {
        AcctTotalOSBalModelResponse response = new AcctTotalOSBalModelResponse();
        if(inputValidator.validateAcctTotalOSBalRequest(acctTotalOSBal)) {
            AcctTotalOSBalRequest request = requestCreator.createAcctTotalOSBalRequest(acctTotalOSBal);
            try {
                AcctTotalOSBalResponse wsResponse = acctTotalOSBalWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                response = parseAcctTotalOSBalResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return response;
    }

    AcctTotalOSBalModelResponse parseAcctTotalOSBalResponse(AcctTotalOSBalResponse wsResponse) {
        AcctTotalOSBalModelResponse response = new AcctTotalOSBalModelResponse();
        JAXBElement<MrbEsbAcctTotalOSBalDTO> mrbEsbAcctTotalOSBalDTOElement = wsResponse.getAcctTotalOSBalDTO();
        MrbEsbAcctTotalOSBalDTO mrbEsbAcctTotalOSBalDTO = mrbEsbAcctTotalOSBalDTOElement.getValue();
        response.setAcctId(mrbEsbAcctTotalOSBalDTO.getAcctId() !=null ? mrbEsbAcctTotalOSBalDTO.getAcctId().getValue() : "");
        response.setTotalOSBal(mrbEsbAcctTotalOSBalDTO.getTotalOSBal()!=null ? mrbEsbAcctTotalOSBalDTO.getTotalOSBal().toString() : "");
        response.setCurrOSBal(mrbEsbAcctTotalOSBalDTO.getCurrOSBal()!=null ? mrbEsbAcctTotalOSBalDTO.getCurrOSBal().toString() : "");
        response.setBillCutoffDate(mrbEsbAcctTotalOSBalDTO.getBillCutoffDate()!=null ? mrbEsbAcctTotalOSBalDTO.getBillCutoffDate().toString() : "");
        response.setPymtDueDate(mrbEsbAcctTotalOSBalDTO.getPymtDueDate()!=null ? mrbEsbAcctTotalOSBalDTO.getPymtDueDate().getValue() : "");
        if(mrbEsbAcctTotalOSBalDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbAcctTotalOSBalDTO.getResult();
            if(result != null && result.getValue()!=null) {
                response.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                response.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    response.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    response.getResult().setResultRefCode("");
                }
            }
        }
        return response;
    }

    public AcctOSPenaltyModelResponse acctOSPenalty(AcctOSPenalty acctOSPenalty) {
        AcctOSPenaltyModelResponse acctOSPenaltyModelResponse = new AcctOSPenaltyModelResponse();
        if(inputValidator.validateAcctOSPenaltyRequest(acctOSPenalty)) {
            AcctOSPenaltyRequest request = requestCreator.createAcctOSPenaltyRequest(acctOSPenalty);
            try {
                AcctOSPenaltyResponse wsResponse = acctOSPenaltyWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                acctOSPenaltyModelResponse = parseAcctOSPenaltyResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return acctOSPenaltyModelResponse;
    }

    AcctOSPenaltyModelResponse parseAcctOSPenaltyResponse(AcctOSPenaltyResponse wsResponse) {
        AcctOSPenaltyModelResponse acctOSPenaltyModelResponse = new AcctOSPenaltyModelResponse();
        JAXBElement<MrbEsbOSPenaltyResDTO> mrbEsbOSPenaltyResDTOJAXBElement = wsResponse.getOsPenaltyResDTO();
        MrbEsbOSPenaltyResDTO mrbEsbOSPenaltyResDTO = mrbEsbOSPenaltyResDTOJAXBElement.getValue();
        acctOSPenaltyModelResponse.setAcctNum(mrbEsbOSPenaltyResDTO.getAcctNum()!=null ? mrbEsbOSPenaltyResDTO.getAcctNum().getValue() : "");
        acctOSPenaltyModelResponse.setOsPenaltyAmt(mrbEsbOSPenaltyResDTO.getOsPenaltyAmt()!=null ? mrbEsbOSPenaltyResDTO.getOsPenaltyAmt().getValue() : "");
        if(mrbEsbOSPenaltyResDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbOSPenaltyResDTO.getResult();
            if(result != null && result.getValue()!=null) {
                acctOSPenaltyModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                acctOSPenaltyModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    acctOSPenaltyModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    acctOSPenaltyModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return acctOSPenaltyModelResponse;
    }

    public AcctSingleCreditInfoModelResponse acctSingleCreditInfo(AcctSingleCreditInfo acctSingleCreditInfo) {
        AcctSingleCreditInfoModelResponse acctSingleCreditInfoModelResponse = new AcctSingleCreditInfoModelResponse();
        if(inputValidator.validateAcctSingleCreditInfo(acctSingleCreditInfo)) {
            GetAcctSingleCreditInfo request = requestCreator.createAcctSingleCreditInfoRequest(acctSingleCreditInfo);
            try {
                GetAcctSingleCreditInfoResponse wsResponse = acctSingleCreditInfoWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                acctSingleCreditInfoModelResponse = parseAcctSingleCreditInfoResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return acctSingleCreditInfoModelResponse;
    }

    AcctSingleCreditInfoModelResponse parseAcctSingleCreditInfoResponse(GetAcctSingleCreditInfoResponse wsResponse) {
        AcctSingleCreditInfoModelResponse acctSingleCreditInfoModelResponse = new AcctSingleCreditInfoModelResponse();
        JAXBElement<AcctSingleCreditInfoResponse> acctSingleCreditInfoResponseJAXBElement = wsResponse.getReturn();
        AcctSingleCreditInfoResponse acctSingleCreditInfoResponse = acctSingleCreditInfoResponseJAXBElement.getValue();
        JAXBElement<MrbEsbSingleCreditInfoResDTO> mrbEsbSingleCreditInfoResDTOElement = acctSingleCreditInfoResponse.getSingleCreditInfoResDTO();
        MrbEsbSingleCreditInfoResDTO mrbEsbSingleCreditInfoResDTO = mrbEsbSingleCreditInfoResDTOElement.getValue();
        acctSingleCreditInfoModelResponse.setAcctNum(mrbEsbSingleCreditInfoResDTO.getAcctNum()!=null ? mrbEsbSingleCreditInfoResDTO.getAcctNum().getValue() : "");
        acctSingleCreditInfoModelResponse.setAcctStatus(mrbEsbSingleCreditInfoResDTO.getAcctStatus()!=null ? mrbEsbSingleCreditInfoResDTO.getAcctStatus().getValue() : "");
        acctSingleCreditInfoModelResponse.setCreditStatus(mrbEsbSingleCreditInfoResDTO.getCreditStatus()!=null ? mrbEsbSingleCreditInfoResDTO.getCreditStatus().getValue() : "");
        acctSingleCreditInfoModelResponse.setBillDay(mrbEsbSingleCreditInfoResDTO.getBillDay()!=null? mrbEsbSingleCreditInfoResDTO.getBillDay().getValue() : "");
        acctSingleCreditInfoModelResponse.setBucketAmt0(mrbEsbSingleCreditInfoResDTO.getBucketAmt0()!=null?mrbEsbSingleCreditInfoResDTO.getBucketAmt0().getValue() : "");
        acctSingleCreditInfoModelResponse.setBucketAmt1(mrbEsbSingleCreditInfoResDTO.getBucketAmt1()!=null ? mrbEsbSingleCreditInfoResDTO.getBucketAmt1().getValue() : "");
        acctSingleCreditInfoModelResponse.setBucketAmt2(mrbEsbSingleCreditInfoResDTO.getBucketAmt2()!=null ? mrbEsbSingleCreditInfoResDTO.getBucketAmt2().getValue() : "");
        acctSingleCreditInfoModelResponse.setBucketAmt3(mrbEsbSingleCreditInfoResDTO.getBucketAmt3()!=null ? mrbEsbSingleCreditInfoResDTO.getBucketAmt3().getValue() :"");
        acctSingleCreditInfoModelResponse.setDunningGroup(mrbEsbSingleCreditInfoResDTO.getDunningGroup()!=null ? mrbEsbSingleCreditInfoResDTO.getDunningGroup().getValue():"");
        acctSingleCreditInfoModelResponse.setTotalOS(mrbEsbSingleCreditInfoResDTO.getTotalOS()!=null ? mrbEsbSingleCreditInfoResDTO.getTotalOS().getValue() : "");
        acctSingleCreditInfoModelResponse.setUnbillCreditAdj(mrbEsbSingleCreditInfoResDTO.getUnbillCreditAdj()!=null ? mrbEsbSingleCreditInfoResDTO.getUnbillCreditAdj().getValue() : "");
        acctSingleCreditInfoModelResponse.setUnbillDebitAdj(mrbEsbSingleCreditInfoResDTO.getUnbillDebitAdj()!=null ? mrbEsbSingleCreditInfoResDTO.getUnbillDebitAdj().getValue() : "");
        if(mrbEsbSingleCreditInfoResDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbSingleCreditInfoResDTO.getResult();
            if(result != null && result.getValue()!=null) {
                acctSingleCreditInfoModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                acctSingleCreditInfoModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    acctSingleCreditInfoModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    acctSingleCreditInfoModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return acctSingleCreditInfoModelResponse;
    }

    public ValidateAcctForHoldDunningModelResponse validateAcctForHoldDunning(ValidateAcctForHoldDunningInput validateAcctForHoldDunningInput) {
        ValidateAcctForHoldDunningModelResponse validateAcctForHoldDunningModelResponse = null;
        if(inputValidator.validateAcctForHoldDunningInput(validateAcctForHoldDunningInput)) {
            ValidateAcctForHoldDunning request = requestCreator.createValidateAcctForHoldDunningRequest(validateAcctForHoldDunningInput);
            try {
                ValidateAcctForHoldDunningResponse wsResponse = validateAcctForHoldDunningWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                validateAcctForHoldDunningModelResponse = parseValidateAcctForHoldDunningResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return validateAcctForHoldDunningModelResponse;
    }

    private ValidateAcctForHoldDunningModelResponse parseValidateAcctForHoldDunningResponse(ValidateAcctForHoldDunningResponse wsResponse) {
        ValidateAcctForHoldDunningModelResponse validateAcctForHoldDunningModelResponse = new ValidateAcctForHoldDunningModelResponse();
        JAXBElement<ValidateAcctForHoldDunResponse> validateAcctForHoldDunResponseJAXBElement = wsResponse.getReturn();
        ValidateAcctForHoldDunResponse validateAcctForHoldDunResponse = validateAcctForHoldDunResponseJAXBElement.getValue();
        JAXBElement<MrbEsbValidationHoldDunDTO> mrbEsbValidationHoldDunDTOJAXBElement = validateAcctForHoldDunResponse.getValidationHoldDunDTO();
        MrbEsbValidationHoldDunDTO mrbEsbValidationHoldDunDTO = mrbEsbValidationHoldDunDTOJAXBElement.getValue();
        validateAcctForHoldDunningModelResponse.setCanDoHoldDunning(mrbEsbValidationHoldDunDTO.getCanDoHoldDunning()!=null ? mrbEsbValidationHoldDunDTO.getCanDoHoldDunning().getValue() : "");
        if(mrbEsbValidationHoldDunDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbValidationHoldDunDTO.getResult();
            if(result != null && result.getValue()!=null) {
                validateAcctForHoldDunningModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                validateAcctForHoldDunningModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    validateAcctForHoldDunningModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    validateAcctForHoldDunningModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return validateAcctForHoldDunningModelResponse;
    }

    public SubmitAcctHoldDunningModelResponse getSubmitAcctHoldDunning(SubmitAcctHoldDunningInput submitAcctHoldDunningInput) {
        SubmitAcctHoldDunningModelResponse submitAcctHoldDunningModelResponse = null;
        if(inputValidator.validateSubmitAcctHoldDunning(submitAcctHoldDunningInput)) {
            SubmitAcctHoldDunningReq request = requestCreator.createSubmitAcctHoldDunningRequest(submitAcctHoldDunningInput);
            try {
                SubmitAcctHoldDunningReqResponse wsResponse = submitAcctHoldDunningWS(request);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                submitAcctHoldDunningModelResponse = parseSubmitAcctHoldDunningResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return submitAcctHoldDunningModelResponse;
    }

    SubmitAcctHoldDunningModelResponse parseSubmitAcctHoldDunningResponse(SubmitAcctHoldDunningReqResponse wsResponse) {
        SubmitAcctHoldDunningModelResponse submitAcctHoldDunningModelResponse = new SubmitAcctHoldDunningModelResponse();
        JAXBElement<SubmitAcctHoldDunResponse> submitAcctHoldDunResponseJAXBElement = wsResponse.getReturn();
        SubmitAcctHoldDunResponse submitAcctHoldDunResponse = submitAcctHoldDunResponseJAXBElement.getValue();
        JAXBElement<MrbEsbResultDTO> mrbEsbResultDTOJAXBElement = submitAcctHoldDunResponse.getResultDTO();
        if(mrbEsbResultDTOJAXBElement!=null) {
            if(mrbEsbResultDTOJAXBElement != null && mrbEsbResultDTOJAXBElement.getValue()!=null) {
                submitAcctHoldDunningModelResponse.getResult().setErrCode(mrbEsbResultDTOJAXBElement.getValue().getErrCode() != null ? mrbEsbResultDTOJAXBElement.getValue().getErrCode().getValue() : "");
                submitAcctHoldDunningModelResponse.getResult().setErrMsg(mrbEsbResultDTOJAXBElement.getValue().getErrMsg() != null ? mrbEsbResultDTOJAXBElement.getValue().getErrMsg().getValue() : "");
                if(mrbEsbResultDTOJAXBElement.getValue().getResultRefCode() != null && mrbEsbResultDTOJAXBElement.getValue().getResultRefCode().getValue() !=null) {
                    submitAcctHoldDunningModelResponse.getResult().setResultRefCode(mrbEsbResultDTOJAXBElement.getValue().getResultRefCode().getValue());
                } else {
                    submitAcctHoldDunningModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return submitAcctHoldDunningModelResponse;
    }

}
