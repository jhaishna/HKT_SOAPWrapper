package com.jaishna.soapwrapper.service;

import com.jaishna.soapwrapper.gen.*;
import com.jaishna.soapwrapper.model.payment.*;
import com.jaishna.soapwrapper.utils.PaymentValidator;
import com.jaishna.soapwrapper.utils.WSSecurityHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;

@Service
public class PaymentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private PaymentValidator paymentValidator;

    @Autowired
    WSSecurityHeader wsSecurityHeader;

    @Value("${webservice.endpoint}")
    private String endpoint;

    private WebServiceTemplate webServiceTemplate;

    public GetPaymentHistoryResponse getPaymentHistoryWS(GetPaymentHistory getPaymentHistory) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetPaymentHistoryResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getPaymentHistory,wsSecurityHeader);
    }

    public GetPaymentRejHistoryResponse getPaymentRejHistoryWS(GetPaymentRejHistory getPaymentRejHistory) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetPaymentRejHistoryResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getPaymentRejHistory,wsSecurityHeader);
    }

    public ChkPaymentRejectStsResponse getPaymentRejectStatusWS(ChkPaymentRejectSts chkPaymentRejectSts) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (ChkPaymentRejectStsResponse) webServiceTemplate.marshalSendAndReceive(endpoint,chkPaymentRejectSts,wsSecurityHeader);
    }

    public PaymentHistoryModelResponse getPaymentHistory(PaymentHistoryModelInput paymentHistoryModelInput) {
        PaymentHistoryModelResponse paymentHistoryModelResponse = new PaymentHistoryModelResponse();
        if(paymentValidator.validatePaymentHistory(paymentHistoryModelInput)) {
            GetPaymentHistory getPaymentHistory = createPaymentHistoryRequest(paymentHistoryModelInput);
            try {
                GetPaymentHistoryResponse wsResponse = getPaymentHistoryWS(getPaymentHistory);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                paymentHistoryModelResponse = parsePaymentHistoryResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return paymentHistoryModelResponse;
    }

    GetPaymentHistory createPaymentHistoryRequest(PaymentHistoryModelInput paymentHistoryModelInput) {
        ObjectFactory obj = new ObjectFactory();
        GetPaymentHistory getPaymentHistory = obj.createGetPaymentHistory();
        PaymentHistoryRequest paymentHistoryRequest = obj.createPaymentHistoryRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(paymentHistoryModelInput.getAcctNum()));
        paymentHistoryRequest.setAcctDTO(obj.createPaymentHistoryRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(paymentHistoryModelInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(paymentHistoryModelInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(paymentHistoryModelInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(paymentHistoryModelInput.getLanID()));
        paymentHistoryRequest.setOperInfo(obj.createPaymentHistoryRequestOperInfo(mrbEsbOperInfoDTO));
        getPaymentHistory.setPaymentHistoryRequest(obj.createGetPaymentHistoryPaymentHistoryRequest(paymentHistoryRequest));
        return getPaymentHistory;
    }

    private PaymentHistoryModelResponse parsePaymentHistoryResponse(GetPaymentHistoryResponse wsResponse) {
        PaymentHistoryModelResponse paymentHistoryModelResponse = new PaymentHistoryModelResponse();
        JAXBElement<PaymentHistoryResponse> paymentHistoryResponseJAXBElement = wsResponse.getReturn();
        PaymentHistoryResponse paymentHistoryResponse = paymentHistoryResponseJAXBElement.getValue();
        JAXBElement<MrbEsbPaymentHistoryResultDTO> mrbEsbPaymentHistoryResultDTOJAXBElement = paymentHistoryResponse.getPaymentHistoryResultDTO();
        MrbEsbPaymentHistoryResultDTO mrbEsbPaymentHistoryResultDTO = mrbEsbPaymentHistoryResultDTOJAXBElement.getValue();
        for(MrbEsbPaymentHistoryDTO mrbEsbPaymentHistoryDTO : mrbEsbPaymentHistoryResultDTO.getListPaymentHistory()) {
            PaymentHistoryDTO paymentHistoryDTO = new PaymentHistoryDTO();
            paymentHistoryDTO.setPaymentAmount(mrbEsbPaymentHistoryDTO.getPymtAmt()!=null ? mrbEsbPaymentHistoryDTO.getPymtAmt().getValue() : "");
            paymentHistoryDTO.setPaymentDate(mrbEsbPaymentHistoryDTO.getPymtDate()!=null ? mrbEsbPaymentHistoryDTO.getPymtDate().getValue() : "");
            paymentHistoryDTO.setPaymentChannel(mrbEsbPaymentHistoryDTO.getPymtChannel()!=null ? mrbEsbPaymentHistoryDTO.getPymtChannel().getValue() : "");
            paymentHistoryModelResponse.getListPaymentHistory().add(paymentHistoryDTO);
        }
        paymentHistoryModelResponse.setAcctNum(mrbEsbPaymentHistoryResultDTO.getAcctNum()!=null ? mrbEsbPaymentHistoryResultDTO.getAcctNum().getValue() : "");
        if(mrbEsbPaymentHistoryResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbPaymentHistoryResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                paymentHistoryModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                paymentHistoryModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    paymentHistoryModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    paymentHistoryModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return paymentHistoryModelResponse;
    }

    public PaymentRejHistoryModelResponse getPaymentRejHistory(PaymentRejHistoryModelInput paymentRejHistoryModelInput) {
        PaymentRejHistoryModelResponse paymentRejHistoryModelResponse = null;
        if(paymentValidator.validatePaymentRejHistory(paymentRejHistoryModelInput)) {
            GetPaymentRejHistory getPaymentRejHistory = createPaymentRejHistoryRequest(paymentRejHistoryModelInput);
            try {
                GetPaymentRejHistoryResponse wsResponse = getPaymentRejHistoryWS(getPaymentRejHistory);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                paymentRejHistoryModelResponse = parsePaymentRejHistoryResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return paymentRejHistoryModelResponse;
    }

    private GetPaymentRejHistory createPaymentRejHistoryRequest(PaymentRejHistoryModelInput paymentRejHistoryModelInput) {
        ObjectFactory obj = new ObjectFactory();
        GetPaymentRejHistory getPaymentRejHistory = obj.createGetPaymentRejHistory();
        PaymentRejHistoryRequest paymentRejHistoryRequest = obj.createPaymentRejHistoryRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(paymentRejHistoryModelInput.getAcctNum()));
        paymentRejHistoryRequest.setAcctDTO(obj.createPaymentRejHistoryRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(paymentRejHistoryModelInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(paymentRejHistoryModelInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(paymentRejHistoryModelInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(paymentRejHistoryModelInput.getLanID()));
        paymentRejHistoryRequest.setOperInfo(obj.createPaymentRejHistoryRequestOperInfo(mrbEsbOperInfoDTO));
        getPaymentRejHistory.setPaymentRejHistoryRequest(obj.createGetPaymentRejHistoryPaymentRejHistoryRequest(paymentRejHistoryRequest));
        return getPaymentRejHistory;
    }

    PaymentRejHistoryModelResponse parsePaymentRejHistoryResponse(GetPaymentRejHistoryResponse wsResponse) {
        PaymentRejHistoryModelResponse paymentRejHistoryModelResponse = new PaymentRejHistoryModelResponse();
        JAXBElement<PaymentRejHistoryResponse> paymentRejHistoryResponseJAXBElement = wsResponse.getReturn();
        PaymentRejHistoryResponse paymentRejHistoryResponse = paymentRejHistoryResponseJAXBElement.getValue();
        JAXBElement<MrbEsbPaymentRejHistoryResultDTO> mrbEsbPaymentRejHistoryResultDTOJAXBElement = paymentRejHistoryResponse.getPaymentRejHistoryResultDTO();
        MrbEsbPaymentRejHistoryResultDTO mrbEsbPaymentRejHistoryResultDTO = mrbEsbPaymentRejHistoryResultDTOJAXBElement.getValue();
        if(mrbEsbPaymentRejHistoryResultDTO.getListPaymentRejHistory()!=null) {
            for (MrbEsbPaymentRejHistoryDTO mrbEsbPaymentRejHistoryDTO : mrbEsbPaymentRejHistoryResultDTO.getListPaymentRejHistory()) {
                if(mrbEsbPaymentRejHistoryDTO!=null) {
                    PaymentRejHistoryDTO paymentRejHistoryDTO = new PaymentRejHistoryDTO();
                    paymentRejHistoryDTO.setPaymentAmount(mrbEsbPaymentRejHistoryDTO.getPymtAmt() != null ? mrbEsbPaymentRejHistoryDTO.getPymtAmt().getValue() : "");
                    paymentRejHistoryDTO.setPaymentDate(mrbEsbPaymentRejHistoryDTO.getPymtDate() != null ? mrbEsbPaymentRejHistoryDTO.getPymtDate().getValue() : "");
                    paymentRejHistoryDTO.setPaymentChannel(mrbEsbPaymentRejHistoryDTO.getPymtChannel() != null ? mrbEsbPaymentRejHistoryDTO.getPymtChannel().getValue() : "");
                    paymentRejHistoryDTO.setPaymentRejDate(mrbEsbPaymentRejHistoryDTO.getPymtRejDate() != null ? mrbEsbPaymentRejHistoryDTO.getPymtRejDate().getValue() : "");
                    paymentRejHistoryDTO.setPaymentRejReason(mrbEsbPaymentRejHistoryDTO.getPymtRejReason() != null ? mrbEsbPaymentRejHistoryDTO.getPymtRejReason().getValue() : "");
                    paymentRejHistoryDTO.setCcToken(mrbEsbPaymentRejHistoryDTO.getCcToken() != null ? mrbEsbPaymentRejHistoryDTO.getCcToken().getValue() : "");
                    paymentRejHistoryDTO.setPaymentStatus(mrbEsbPaymentRejHistoryDTO.getPymtSts() != null ? mrbEsbPaymentRejHistoryDTO.getPymtSts().getValue() : "");
                    paymentRejHistoryModelResponse.getListPaymentRejHistory().add(paymentRejHistoryDTO);
                }
            }
        }
        paymentRejHistoryModelResponse.setAccountNumber(mrbEsbPaymentRejHistoryResultDTO.getAcctNum() !=null ? mrbEsbPaymentRejHistoryResultDTO.getAcctNum().getValue() : "");
        paymentRejHistoryModelResponse.setCcRejCount(mrbEsbPaymentRejHistoryResultDTO.getCcRejCnt() !=null ? mrbEsbPaymentRejHistoryResultDTO.getCcRejCnt().getValue() : "");
        paymentRejHistoryModelResponse.setAutopayRejCnt(mrbEsbPaymentRejHistoryResultDTO.getAutopayRejCnt() !=null ? mrbEsbPaymentRejHistoryResultDTO.getAutopayRejCnt().getValue() : "");
        if(mrbEsbPaymentRejHistoryResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbPaymentRejHistoryResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                paymentRejHistoryModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                paymentRejHistoryModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    paymentRejHistoryModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    paymentRejHistoryModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return paymentRejHistoryModelResponse;
    }

    public PaymentRejectStatusModelResponse getPaymentRejectStatus(PaymentRejectStatusModelInput paymentRejStatusModelInput) {
        PaymentRejectStatusModelResponse paymentRejectStatusModelResponse = null;
        if(paymentValidator.validatePaymentRejectStatus(paymentRejStatusModelInput)) {
            ChkPaymentRejectSts chkPaymentRejectSts = createPaymentRejectStatusRequest(paymentRejStatusModelInput);
            try {
                ChkPaymentRejectStsResponse wsResponse = getPaymentRejectStatusWS(chkPaymentRejectSts);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                paymentRejectStatusModelResponse = parsePaymentRejectStatusResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return paymentRejectStatusModelResponse;
    }

    private ChkPaymentRejectSts createPaymentRejectStatusRequest(PaymentRejectStatusModelInput paymentRejStatusModelInput) {
        ObjectFactory obj = new ObjectFactory();
        ChkPaymentRejectSts chkPaymentRejectSts = obj.createChkPaymentRejectSts();
        PaymentRejectStsRequest paymentRejectStsRequest = obj.createPaymentRejectStsRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(paymentRejStatusModelInput.getAcctNum()));
        paymentRejectStsRequest.setAcctDTO(obj.createPaymentRejectStsRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(paymentRejStatusModelInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(paymentRejStatusModelInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(paymentRejStatusModelInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(paymentRejStatusModelInput.getLanID()));
        paymentRejectStsRequest.setOperInfo(obj.createPaymentRejectStsRequestOperInfo(mrbEsbOperInfoDTO));
        chkPaymentRejectSts.setPaymentRejectStsRequest(obj.createChkPaymentRejectStsPaymentRejectStsRequest(paymentRejectStsRequest));
        return chkPaymentRejectSts;
    }

    private PaymentRejectStatusModelResponse parsePaymentRejectStatusResponse(ChkPaymentRejectStsResponse wsResponse) {
        PaymentRejectStatusModelResponse paymentRejectStatusModelResponse = new PaymentRejectStatusModelResponse();
        JAXBElement<PaymentRejectStsResponse> paymentRejectStsResponseJAXBElement = wsResponse.getReturn();
        PaymentRejectStsResponse paymentRejectStsResponse = paymentRejectStsResponseJAXBElement.getValue();
        JAXBElement<MrbEsbPaymentRejectStsResultDTO> mrbEsbPaymentRejectStsResultDTOJAXBElement = paymentRejectStsResponse.getPaymentRejectStsResultDTO();
        MrbEsbPaymentRejectStsResultDTO mrbEsbPaymentRejectStsResultDTO = mrbEsbPaymentRejectStsResultDTOJAXBElement.getValue();
        paymentRejectStatusModelResponse.setPaymentRejectStatus(mrbEsbPaymentRejectStsResultDTO.getPaymentRejSts() !=null ? mrbEsbPaymentRejectStsResultDTO.getPaymentRejSts().getValue() : "");
        paymentRejectStatusModelResponse.setAccountNumber(mrbEsbPaymentRejectStsResultDTO.getAcctNum()!=null ? mrbEsbPaymentRejectStsResultDTO.getAcctNum().getValue() : "");
        if(mrbEsbPaymentRejectStsResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbPaymentRejectStsResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                paymentRejectStatusModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                paymentRejectStatusModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    paymentRejectStatusModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    paymentRejectStatusModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return paymentRejectStatusModelResponse;
    }

}
