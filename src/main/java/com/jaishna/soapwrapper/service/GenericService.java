package com.jaishna.soapwrapper.service;

import com.jaishna.soapwrapper.gen.*;
import com.jaishna.soapwrapper.model.billing.BillingHistory;
import com.jaishna.soapwrapper.model.billing.BillingHistoryModelResponse;
import com.jaishna.soapwrapper.model.general.*;
import com.jaishna.soapwrapper.utils.GenericValidator;
import com.jaishna.soapwrapper.utils.WSSecurityHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;
import java.util.List;

@Service
public class GenericService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenericService.class);

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private GenericValidator genericValidator;

    @Autowired
    WSSecurityHeader wsSecurityHeader;

    @Value("${webservice.endpoint}")
    private String endpoint;

    private WebServiceTemplate webServiceTemplate;

    public GetCurrOSInfoResponse getCurrOSInfoWS(GetCurrOSInfo getCurrOSInfo) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetCurrOSInfoResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getCurrOSInfo,wsSecurityHeader);
    }

    public GetDunningHistoryResponse getDunningHistoryWS(GetDunningHistory getDunningHistory) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetDunningHistoryResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getDunningHistory,wsSecurityHeader);
    }



    public CurrOSInfoModelResponse getCurrOSInfo(CurrOSInfoModelInput currOSInfoModelInput) {
        CurrOSInfoModelResponse currOSInfoModelResponse = null;
        if(genericValidator.validateCurrOSInfoRequest(currOSInfoModelInput)) {
            GetCurrOSInfo getCurrOSInfoRequest = createCurrOSInfoRequest(currOSInfoModelInput);
            try {
                GetCurrOSInfoResponse response = getCurrOSInfoWS(getCurrOSInfoRequest);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                currOSInfoModelResponse = parseCurrOSInfoResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return currOSInfoModelResponse;
    }

    GetCurrOSInfo createCurrOSInfoRequest(CurrOSInfoModelInput currOSInfoModelInput) {
        ObjectFactory obj = new ObjectFactory();
        GetCurrOSInfo getCurrOSInfo = obj.createGetCurrOSInfo();
        CurrOSInfoRequest currOSInfoRequest = obj.createCurrOSInfoRequest();

        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(currOSInfoModelInput.getAcctNum()));
        currOSInfoRequest.setAcctDTO(obj.createCurrOSInfoRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(currOSInfoModelInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(currOSInfoModelInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(currOSInfoModelInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(currOSInfoModelInput.getLanID()));
        currOSInfoRequest.setOperInfo(obj.createCurrOSInfoRequestOperInfo(mrbEsbOperInfoDTO));

        getCurrOSInfo.setCurrOSInfoRequest(obj.createGetCurrOSInfoCurrOSInfoRequest(currOSInfoRequest));
        return getCurrOSInfo;
    }

    private CurrOSInfoModelResponse parseCurrOSInfoResponse(GetCurrOSInfoResponse response) {
        CurrOSInfoModelResponse currOSInfoModelResponse = new CurrOSInfoModelResponse();
        JAXBElement<CurrOSInfoResponse> currOSInfoResponseJAXBElement = response.getReturn();
        CurrOSInfoResponse currOSInfoResponse = currOSInfoResponseJAXBElement.getValue();
        JAXBElement<MrbEsbCurrOSInfoResDTO> mrbEsbCurrOSInfoResDTOJAXBElement = currOSInfoResponse.getCurrOSInfoResDTO();
        MrbEsbCurrOSInfoResDTO mrbEsbCurrOSInfoResDTO = mrbEsbCurrOSInfoResDTOJAXBElement.getValue();
        currOSInfoModelResponse.setAcctNum(mrbEsbCurrOSInfoResDTO.getAcctNum()!=null ? mrbEsbCurrOSInfoResDTO.getAcctNum().getValue() : "");
        currOSInfoModelResponse.setCurrOS(mrbEsbCurrOSInfoResDTO.getCurrOS()!=null ? mrbEsbCurrOSInfoResDTO.getCurrOS().getValue() : "");
        currOSInfoModelResponse.setBillDay(mrbEsbCurrOSInfoResDTO.getBillDay()!=null ? mrbEsbCurrOSInfoResDTO.getBillDay().getValue() : "");
        currOSInfoModelResponse.setCreditStatus(mrbEsbCurrOSInfoResDTO.getCreditStatus()!=null ? mrbEsbCurrOSInfoResDTO.getCreditStatus().getValue() : "");
        currOSInfoModelResponse.setCreditStsCode(mrbEsbCurrOSInfoResDTO.getCreditStsCode()!=null ? mrbEsbCurrOSInfoResDTO.getCreditStsCode().getValue() : "");
        currOSInfoModelResponse.setTotalOS(mrbEsbCurrOSInfoResDTO.getTotalOS()!=null ? mrbEsbCurrOSInfoResDTO.getTotalOS().getValue() : "");
        if(mrbEsbCurrOSInfoResDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbCurrOSInfoResDTO.getResult();
            if(result != null && result.getValue()!=null) {
                currOSInfoModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                currOSInfoModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    currOSInfoModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    currOSInfoModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return currOSInfoModelResponse;
    }

    public DunningHistoryModelResponse getDunningHistory(DunningHistoryModelInput dunningHistoryModelInput) {
        DunningHistoryModelResponse dunningHistoryModelResponse = null;
        if(genericValidator.validateDunningHistoryRequest(dunningHistoryModelInput)) {
            GetDunningHistory getDunningHistory = createDunningHistoryRequest(dunningHistoryModelInput);
            try {
                GetDunningHistoryResponse response = getDunningHistoryWS(getDunningHistory);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                dunningHistoryModelResponse = parseDunningHistoryResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return dunningHistoryModelResponse;
    }

    GetDunningHistory createDunningHistoryRequest(DunningHistoryModelInput dunningHistoryModelInput) {
        ObjectFactory obj = new ObjectFactory();
        GetDunningHistory getDunningHistory = obj.createGetDunningHistory();
        DunningHistoryRequest dunningHistoryRequest = obj.createDunningHistoryRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(dunningHistoryModelInput.getAcctNum()));
        dunningHistoryRequest.setAcctDTO(obj.createDunningHistoryRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(dunningHistoryModelInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(dunningHistoryModelInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(dunningHistoryModelInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(dunningHistoryModelInput.getLanID()));

        dunningHistoryRequest.setOperInfo(obj.createDunningHistoryRequestOperInfo(mrbEsbOperInfoDTO));
        getDunningHistory.setDunningHistoryRequest(obj.createGetDunningHistoryDunningHistoryRequest(dunningHistoryRequest));
        return getDunningHistory;
    }

    DunningHistoryModelResponse parseDunningHistoryResponse(GetDunningHistoryResponse response) {
        DunningHistoryModelResponse dunningHistoryModelResponse = new DunningHistoryModelResponse();
        JAXBElement<DunningHistoryResponse> dunningHistoryResponseJAXBElement = response.getReturn();
        DunningHistoryResponse dunningHistoryResponse = dunningHistoryResponseJAXBElement.getValue();
        MrbEsbDunningHistoryResultDTO mrbEsbDunningHistoryResultDTO = dunningHistoryResponse.getDunningHistoryResultDTO().getValue();
        dunningHistoryModelResponse.setAcctNum(mrbEsbDunningHistoryResultDTO.getAcctNum()!=null ? mrbEsbDunningHistoryResultDTO.getAcctNum().getValue() : "");
        if(mrbEsbDunningHistoryResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbDunningHistoryResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                dunningHistoryModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                dunningHistoryModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    dunningHistoryModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    dunningHistoryModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        if(mrbEsbDunningHistoryResultDTO.getListDunningHistory()!=null) {
            for (MrbEsbDunningHistoryDTO mrbEsbDunningHistoryDTO : mrbEsbDunningHistoryResultDTO.getListDunningHistory()) {
                if(mrbEsbDunningHistoryDTO!=null) {
                    DunningHistoryDTO dunningHistoryDTO = new DunningHistoryDTO();
                    dunningHistoryDTO.setActionDate(mrbEsbDunningHistoryDTO.getActionDate() != null ? mrbEsbDunningHistoryDTO.getActionDate().getValue() : "");
                    dunningHistoryDTO.setActionName(mrbEsbDunningHistoryDTO.getActionName() != null ? mrbEsbDunningHistoryDTO.getActionName().getValue() : "");
                    dunningHistoryDTO.setHoldDunDay(mrbEsbDunningHistoryDTO.getHoldDunDay() != null ? mrbEsbDunningHistoryDTO.getHoldDunDay().getValue() : "");
                    dunningHistoryDTO.setHoldDunReason(mrbEsbDunningHistoryDTO.getHoldDunReason() != null ? mrbEsbDunningHistoryDTO.getHoldDunReason().getValue() : "");
                    dunningHistoryDTO.setOperID(mrbEsbDunningHistoryDTO.getOperID() != null ? mrbEsbDunningHistoryDTO.getOperID().getValue() : "");
                    dunningHistoryDTO.setRemark(mrbEsbDunningHistoryDTO.getRemark() != null ? mrbEsbDunningHistoryDTO.getRemark().getValue() : "");
                    dunningHistoryDTO.setReleaseDate(mrbEsbDunningHistoryDTO.getReleaseDate() != null ? mrbEsbDunningHistoryDTO.getReleaseDate().getValue() : "");
                    dunningHistoryDTO.setCollectorAssignPeriod(mrbEsbDunningHistoryDTO.getCollectorAssignPeriod() != null ? mrbEsbDunningHistoryDTO.getCollectorAssignPeriod().getValue() : "");
                    dunningHistoryDTO.setCollectorName(mrbEsbDunningHistoryDTO.getCollectorName() != null ? mrbEsbDunningHistoryDTO.getCollectorName().getValue() : "");
                    dunningHistoryDTO.setShopCode(mrbEsbDunningHistoryDTO.getShopCode() != null ? mrbEsbDunningHistoryDTO.getShopCode().getValue() : "");
                    dunningHistoryDTO.setSubmitSts(mrbEsbDunningHistoryDTO.getSubmitSts() != null ? mrbEsbDunningHistoryDTO.getSubmitSts().getValue() : "");
                    dunningHistoryModelResponse.getListDunningHistory().add(dunningHistoryDTO);
                }
            }
        }
        return dunningHistoryModelResponse;
    }

}
