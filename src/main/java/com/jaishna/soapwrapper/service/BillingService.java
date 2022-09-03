package com.jaishna.soapwrapper.service;

import com.jaishna.soapwrapper.gen.*;
import com.jaishna.soapwrapper.model.billing.*;
import com.jaishna.soapwrapper.model.billing.ChargeItemizedBillInput;
import com.jaishna.soapwrapper.utils.BillingValidator;
import com.jaishna.soapwrapper.utils.WSSecurityHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;
import java.util.List;

@Service
public class BillingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BillingService.class);

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    @Autowired
    private BillingValidator billingValidator;

    @Autowired
    WSSecurityHeader wsSecurityHeader;

    @Value("${webservice.endpoint}")
    private String endpoint;

    private WebServiceTemplate webServiceTemplate;

    public GetBillHistoryResponse getBillHistory(GetBillHistory billHistoryRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetBillHistoryResponse) webServiceTemplate.marshalSendAndReceive(endpoint,billHistoryRequest,wsSecurityHeader);
    }

    public GetBillingAddressResponse getBillingAddressWS(GetBillingAddress billingAddressRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetBillingAddressResponse) webServiceTemplate.marshalSendAndReceive(endpoint,billingAddressRequest,wsSecurityHeader);
    }

    public GetBomNextBillDateResponse getBomNextBillDateWS(GetBomNextBillDate getBomNextBillDate) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetBomNextBillDateResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getBomNextBillDate,wsSecurityHeader);
    }

    public ChargeItemizedBillResponse getChargeItemizedBillWS(ChargeItemizedBill chargeItemizedBill) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (ChargeItemizedBillResponse) webServiceTemplate.marshalSendAndReceive(endpoint,chargeItemizedBill,wsSecurityHeader);
    }

    public GetUnbilledDailyRoamWifiResponse getUnbilledDailyRoamWifiWS(GetUnbilledDailyRoamWifi getUnbilledDailyRoamWifi) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetUnbilledDailyRoamWifiResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getUnbilledDailyRoamWifi,wsSecurityHeader);
    }

    public GetListBillDateResponse getListBillDateWS(GetListBillDate getListBillDate) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetListBillDateResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getListBillDate,wsSecurityHeader);
    }

    public GetUnbillFreeEntitleInfoResponse getUnbillFreeEntitleInfoWS(GetUnbillFreeEntitleInfo getUnbillFreeEntitleInfo) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetUnbillFreeEntitleInfoResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getUnbillFreeEntitleInfo,wsSecurityHeader);
    }

    public GetUnbilledNEDayPassUsageResponse getUnbilledNEDayPassUsageWS(GetUnbilledNEDayPassUsage getUnbilledNEDayPassUsage) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetUnbilledNEDayPassUsageResponse) webServiceTemplate.marshalSendAndReceive(endpoint,getUnbilledNEDayPassUsage,wsSecurityHeader);
    }

    public SubmitCSAutoBillReprintRequestResponse getSubmitCSAutoBillReprintWS(SubmitCSAutoBillReprintRequest submitCSAutoBillReprintRequest) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (SubmitCSAutoBillReprintRequestResponse) webServiceTemplate.marshalSendAndReceive(endpoint,submitCSAutoBillReprintRequest,wsSecurityHeader);
    }

    public BillingHistoryModelResponse getBillingHistory(BillingHistory billingHistory) {
        BillingHistoryModelResponse billingHistoryModelResponse = null;
        if(billingValidator.validateBillingHistoryRequest(billingHistory)) {
            GetBillHistory billingHistoryRequest = createBillingHistoryRequest(billingHistory);
            try {
                GetBillHistoryResponse response = getBillHistory(billingHistoryRequest);
                LOGGER.info("Response after successfully calling the SOAP API.." + response);
                billingHistoryModelResponse = parseBillingHistoryResponse(response);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return billingHistoryModelResponse;
    }

    public BillingHistoryModelResponse parseBillingHistoryResponse(GetBillHistoryResponse response) {
        BillingHistoryModelResponse billingHistoryModelResponse = new BillingHistoryModelResponse();
        JAXBElement<BillHistoryResponse> billHistoryResponseJAXBElement = response.getReturn();
        BillHistoryResponse billHistoryResponse = billHistoryResponseJAXBElement.getValue();
        JAXBElement<MrbEsbBillHistoryResultDTO> mrbEsbBillHistoryResultDTOElement = billHistoryResponse.getBillHistoryResultDTO();
        MrbEsbBillHistoryResultDTO resultDTO = mrbEsbBillHistoryResultDTOElement.getValue();
        billingHistoryModelResponse.setAcctNum(resultDTO.getAcctNum()!=null ? resultDTO.getAcctNum().getValue() : "");
        billingHistoryModelResponse.setDivertLoc(resultDTO.getDivertLoc()!=null ? resultDTO.getDivertLoc().getValue() : "");
        billingHistoryModelResponse.setDivertRmnCycle(resultDTO.getDivertRmnCycle()!=null ? resultDTO.getDivertRmnCycle().getValue() : "");
        if(resultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = resultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                billingHistoryModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                billingHistoryModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    billingHistoryModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    billingHistoryModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return billingHistoryModelResponse;
    }

    public GetBillHistory createBillingHistoryRequest(BillingHistory billingHistory) {
        ObjectFactory obj = new ObjectFactory();
        GetBillHistory billHistory = obj.createGetBillHistory();
        BillHistoryRequest request = obj.createBillHistoryRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(billingHistory.getAccountNumber()));
        request.setAcctDTO(obj.createBillHistoryRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(billingHistory.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(billingHistory.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(billingHistory.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(billingHistory.getLanID()));
        request.setOperInfo(obj.createBillHistoryRequestOperInfo(mrbEsbOperInfoDTO));
        billHistory.setBillHistoryRequest(obj.createGetBillHistoryBillHistoryRequest(request));
        return billHistory;
    }

    public BillingAddressModelResponse getBillingAddress(BillingAddress billingAddress) {
        BillingAddressModelResponse response = new BillingAddressModelResponse();
        if(billingValidator.validateBillingHistory(billingAddress)) {
            GetBillingAddress billingHistoryRequest = createBillingAddressRequest(billingAddress);
            try {
                GetBillingAddressResponse wsResponse = getBillingAddressWS(billingHistoryRequest);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                response = parseBillingAddressResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return response;
    }

    public GetBillingAddress createBillingAddressRequest(BillingAddress billingAddress) {
        ObjectFactory obj = new ObjectFactory();
        GetBillingAddress getBillingAddress = obj.createGetBillingAddress();
        BillingAddressRequest request = obj.createBillingAddressRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(billingAddress.getAccountNumber()));
        request.setAcctDTO(obj.createAcctInfoRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(billingAddress.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(billingAddress.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(billingAddress.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(billingAddress.getLanID()));
        request.setOperInfo(obj.createBillingAddressRequestOperInfo(mrbEsbOperInfoDTO));
        getBillingAddress.setReq(obj.createGetBillingAddressReq(request));
        return getBillingAddress;
    }

    private BillingAddressModelResponse parseBillingAddressResponse(GetBillingAddressResponse wsResponse) {
        BillingAddressModelResponse response = new BillingAddressModelResponse();
        JAXBElement<BillingAddressResponse> billingAddressResponseJAXBElement = wsResponse.getReturn();
        BillingAddressResponse billingAddressResponse = billingAddressResponseJAXBElement.getValue();
        JAXBElement<MrbEsbBillingAddressDTO> billingAddressDTOJAXBElement = billingAddressResponse.getBillingAddressDTO();
        MrbEsbBillingAddressDTO mrbEsbBillingAddressDTO = billingAddressDTOJAXBElement.getValue();
        response.setAcctNum(mrbEsbBillingAddressDTO.getAcctNum()!=null ? mrbEsbBillingAddressDTO.getAcctNum().getValue() : "");
        response.setAddrDesc1(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ? mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        response.setAddrDesc2(mrbEsbBillingAddressDTO.getAddrDesc2()!=null ? mrbEsbBillingAddressDTO.getAddrDesc2().getValue() : "");
        response.setAddrDesc3(mrbEsbBillingAddressDTO.getAddrDesc3()!=null ? mrbEsbBillingAddressDTO.getAddrDesc3().getValue() : "");
        response.setAddrDesc4(mrbEsbBillingAddressDTO.getAddrDesc4()!=null ? mrbEsbBillingAddressDTO.getAddrDesc4().getValue() : "");
        response.setAddrDesc5(mrbEsbBillingAddressDTO.getAddrDesc5()!=null ? mrbEsbBillingAddressDTO.getAddrDesc5().getValue() : "");
        response.setAddrDesc6(mrbEsbBillingAddressDTO.getAddrDesc6()!=null ? mrbEsbBillingAddressDTO.getAddrDesc6().getValue() : "");
        if(mrbEsbBillingAddressDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbBillingAddressDTO.getResult();
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

    public BomNextBillDateModelResponse getBomNextBillDate(BomNextBillDate bomNextBillDate) {
        BomNextBillDateModelResponse bomNextBillDateModelResponse = new BomNextBillDateModelResponse();
        if(billingValidator.validateBomNextBillDate(bomNextBillDate)) {
            GetBomNextBillDate getBomNextBillDate = createBomNextBillDateRequest(bomNextBillDate);
            try {
                GetBomNextBillDateResponse wsResponse = getBomNextBillDateWS(getBomNextBillDate);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                bomNextBillDateModelResponse = parseBomNextBillDateResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return bomNextBillDateModelResponse;
    }

    GetBomNextBillDate createBomNextBillDateRequest(BomNextBillDate bomNextBillDate) {
        ObjectFactory obj = new ObjectFactory();
        GetBomNextBillDate getBomNextBillDate = obj.createGetBomNextBillDate();
        BomNextBillDateRequest bomNextBillDateRequest = obj.createBomNextBillDateRequest();
        MrbEsbQryAcctDTO mrbEsbQryAcctDTO = obj.createMrbEsbQryAcctDTO();
        mrbEsbQryAcctDTO.setAcctCode(obj.createMrbEsbQryAcctDTOAcctCode(bomNextBillDate.getAcctCode()));
        mrbEsbQryAcctDTO.setAcctNum(obj.createMrbEsbQryAcctDTOAcctNum(bomNextBillDate.getAcctNum()));
        mrbEsbQryAcctDTO.setMsisdn(obj.createMrbEsbQryAcctDTOMsisdn(bomNextBillDate.getMsisdn()));
        bomNextBillDateRequest.setAcctDTO(obj.createBomNextBillDateRequestAcctDTO(mrbEsbQryAcctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(bomNextBillDate.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(bomNextBillDate.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(bomNextBillDate.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(bomNextBillDate.getLanID()));
        bomNextBillDateRequest.setOperInfo(obj.createBomNextBillDateRequestOperInfo(mrbEsbOperInfoDTO));
        getBomNextBillDate.setBomNextBillDateRequest(obj.createGetBomNextBillDateBomNextBillDateRequest(bomNextBillDateRequest));
        return getBomNextBillDate;
    }

    BomNextBillDateModelResponse parseBomNextBillDateResponse(GetBomNextBillDateResponse wsResonse) {
        BomNextBillDateModelResponse response = new BomNextBillDateModelResponse();
        JAXBElement<BomNextBillDateResponse> bomNextBillDateResponseJAXBElement = wsResonse.getReturn();
        BomNextBillDateResponse bomNextBillDateResponse = bomNextBillDateResponseJAXBElement.getValue();
        JAXBElement<MrbEsbAcctBomNxtBDateDTO> mrbEsbAcctBomNxtBDateDTOJAXBElement = bomNextBillDateResponse.getAcctBomNxtBDateDTO();
        MrbEsbAcctBomNxtBDateDTO mrbEsbAcctBomNxtBDateDTO = mrbEsbAcctBomNxtBDateDTOJAXBElement.getValue();
        response.setBomNextBillDate(mrbEsbAcctBomNxtBDateDTO.getBomNextBillDate() !=null ? mrbEsbAcctBomNxtBDateDTO.getBomNextBillDate().getValue() : "");
        response.setBomStartBillDate(mrbEsbAcctBomNxtBDateDTO.getBomStartBillDate() !=null ? mrbEsbAcctBomNxtBDateDTO.getBomStartBillDate().getValue() : "");
        response.setAcctNum(mrbEsbAcctBomNxtBDateDTO.getAcctNum() != null ? mrbEsbAcctBomNxtBDateDTO.getAcctNum().getValue() : "");
        if(mrbEsbAcctBomNxtBDateDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbAcctBomNxtBDateDTO.getResult();
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

    public ChargeItemizedBillModelResponse getChargeItemizedBill(ChargeItemizedBillInput chargeItemizedBillInput) {
        ChargeItemizedBillModelResponse chargeItemizedBillModelResponse = new ChargeItemizedBillModelResponse();
        if(billingValidator.validateChargeItemizedBill(chargeItemizedBillInput)) {
            ChargeItemizedBill chargeItemizedBill = createChargeItemizedBillRequest(chargeItemizedBillInput);
            try {
                ChargeItemizedBillResponse wsResponse = getChargeItemizedBillWS(chargeItemizedBill);
                LOGGER.info("Response after successfully calling the SOAP API.." + wsResponse);
                chargeItemizedBillModelResponse = parseChargeItemizedBillResponse(wsResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return chargeItemizedBillModelResponse;
    }

    private ChargeItemizedBill createChargeItemizedBillRequest(ChargeItemizedBillInput chargeItemizedBillInput) {
        ObjectFactory obj = new ObjectFactory();
        ChargeItemizedBill chargeItemizedBill = obj.createChargeItemizedBill();
        ChargeItemizedBillRequest chargeItemizedBillRequest = obj.createChargeItemizedBillRequest();
        MrbEsbItemizedBillChargeDTO mrbEsbItemizedBillChargeDTO = obj.createMrbEsbItemizedBillChargeDTO();
        mrbEsbItemizedBillChargeDTO.setCharge(new Double(chargeItemizedBillInput.getCharge()));
        mrbEsbItemizedBillChargeDTO.setBillOfferingID(obj.createMrbEsbItemizedBillChargeDTOBillOfferingID(chargeItemizedBillInput.getBillOfferingID()));
        mrbEsbItemizedBillChargeDTO.setAcctNum(obj.createMrbEsbItemizedBillChargeDTOAcctNum(chargeItemizedBillInput.getAcctNum()));
        mrbEsbItemizedBillChargeDTO.setMsisdn(obj.createMrbEsbItemizedBillChargeDTOMsisdn(chargeItemizedBillInput.getMsisdn()));
        mrbEsbItemizedBillChargeDTO.setDescription(obj.createMrbEsbItemizedBillChargeDTODescription(chargeItemizedBillInput.getDescription()));
        JAXBElement<MrbEsbItemizedBillChargeDTO> mrbEsbItemizedBillChargeDTOJAXBElement = obj.createChargeItemizedBillRequestIitemizedBillChargeDTO(mrbEsbItemizedBillChargeDTO);
        chargeItemizedBillRequest.setIitemizedBillChargeDTO(mrbEsbItemizedBillChargeDTOJAXBElement);

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(chargeItemizedBillInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(chargeItemizedBillInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(chargeItemizedBillInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(chargeItemizedBillInput.getLanID()));
        chargeItemizedBillRequest.setOperInfo(obj.createChargeItemizedBillRequestOperInfo(mrbEsbOperInfoDTO));

        chargeItemizedBill.setReq(obj.createChargeItemizedBillReq(chargeItemizedBillRequest));
        return chargeItemizedBill;
    }

    private ChargeItemizedBillModelResponse parseChargeItemizedBillResponse(ChargeItemizedBillResponse wsResponse) {
        ChargeItemizedBillModelResponse chargeItemizedBillModelResponse = new ChargeItemizedBillModelResponse();
        JAXBElement<ChargeItemizedBillResponse2> chargeItemizedBillResponse2JAXBElement = wsResponse.getReturn();
        ChargeItemizedBillResponse2 chargeItemizedBillResponse2 = chargeItemizedBillResponse2JAXBElement.getValue();
        JAXBElement<MrbEsbResultDTO> mrbEsbResultDTOJAXBElement = chargeItemizedBillResponse2.getResultDTO();
        MrbEsbResultDTO mrbEsbResultDTO = mrbEsbResultDTOJAXBElement.getValue();
        chargeItemizedBillModelResponse.setResultRefCode(mrbEsbResultDTO.getResultRefCode() !=null ? mrbEsbResultDTO.getResultRefCode().getValue() : "");
        chargeItemizedBillModelResponse.setErrCode(mrbEsbResultDTO.getErrCode() !=null ? mrbEsbResultDTO.getErrCode().getValue() : "");
        chargeItemizedBillModelResponse.setErrMsg(mrbEsbResultDTO.getErrMsg()!=null ? mrbEsbResultDTO.getErrMsg().getValue() : "");
        return chargeItemizedBillModelResponse;
    }

    public ListBillDateModelResponse getListBillDate(ListBillDateInput listBillDateInput) {
        ListBillDateModelResponse listBillDateModelResponse = null;
        if(billingValidator.validateListBillDateInput(listBillDateInput)) {
            GetListBillDate getListBillDate = createListBillDateRequest(listBillDateInput);
            try {
                GetListBillDateResponse getListBillDateResponse = getListBillDateWS(getListBillDate);
                LOGGER.info("Response after successfully calling the SOAP API.." + getListBillDateResponse);
                listBillDateModelResponse = parseListBillDateResponse(getListBillDateResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return listBillDateModelResponse;
    }

    GetListBillDate createListBillDateRequest(ListBillDateInput listBillDateInput) {
        ObjectFactory obj = new ObjectFactory();
        GetListBillDate getListBillDate = obj.createGetListBillDate();
        ListBillDateRequest listBillDateRequest = obj.createListBillDateRequest();

        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(listBillDateInput.getAcctNum()));
        listBillDateRequest.setAcctDTO(obj.createListBillDateRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(listBillDateInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(listBillDateInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(listBillDateInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(listBillDateInput.getLanID()));
        listBillDateRequest.setOperInfo(obj.createListBillDateRequestOperInfo(mrbEsbOperInfoDTO));

        getListBillDate.setReq(obj.createGetListBillDateReq(listBillDateRequest));
        return getListBillDate;
    }

    private ListBillDateModelResponse parseListBillDateResponse(GetListBillDateResponse getListBillDateResponse) {
        ListBillDateModelResponse listBillDateModelResponse = new ListBillDateModelResponse();
        JAXBElement<ListBillDateResponse> listBillDateResponseJAXBElement = getListBillDateResponse.getReturn();
        ListBillDateResponse listBillDateResponse = listBillDateResponseJAXBElement.getValue();
        JAXBElement<MrbEsbBillDateResultDTO> mrbEsbBillDateResultDTOJAXBElement = listBillDateResponse.getBillDateResultDTO();
        MrbEsbBillDateResultDTO mrbEsbBillDateResultDTO = mrbEsbBillDateResultDTOJAXBElement.getValue();
        List<MrbEsbBillDateDTO> mrbEsbBillDateDTOList = mrbEsbBillDateResultDTO.getListBillDate();
        if(mrbEsbBillDateDTOList !=null) {
            for (MrbEsbBillDateDTO mrbEsbBillDateDTO : mrbEsbBillDateDTOList) {
                if(mrbEsbBillDateDTO!=null) {
                    BillDateDTO billDateDTO = new BillDateDTO();
                    billDateDTO.setBillDate(mrbEsbBillDateDTO.getBillDate() != null ? mrbEsbBillDateDTO.getBillDate().getValue() : "");
                    billDateDTO.setBillSendStatus(mrbEsbBillDateDTO.getBillSendStatus() != null ? mrbEsbBillDateDTO.getBillSendStatus().getValue() : "");
                    billDateDTO.setAcctNum(mrbEsbBillDateDTO.getAcctNum() != null ? mrbEsbBillDateDTO.getAcctNum().getValue() : "");
                    listBillDateModelResponse.getBillDateDTOList().add(billDateDTO);
                }
            }
        }
        if(mrbEsbBillDateResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbBillDateResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                listBillDateModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                listBillDateModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    listBillDateModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    listBillDateModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return listBillDateModelResponse;
    }

    public UnbilledDailyRoamWifiModelResponse getUnbilledDailyRoamWifi(UnbilledDailyRoamWifiInput unbilledDailyRoamWifiInput) {
        UnbilledDailyRoamWifiModelResponse unbilledDailyRoamWifiModelResponse = null;
        if(billingValidator.validateUnbilledDailyRoamWifi(unbilledDailyRoamWifiInput)) {
            GetUnbilledDailyRoamWifi getUnbilledDailyRoamWifi = createUnbilledDailyRoamWifiRequest(unbilledDailyRoamWifiInput);
            try {
                GetUnbilledDailyRoamWifiResponse getUnbilledDailyRoamWifiResponse = getUnbilledDailyRoamWifiWS(getUnbilledDailyRoamWifi);
                LOGGER.info("Response after successfully calling the SOAP API.." + getUnbilledDailyRoamWifiResponse);
                unbilledDailyRoamWifiModelResponse = parseUnbilledDailyRoamWifiResponse(getUnbilledDailyRoamWifiResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return unbilledDailyRoamWifiModelResponse;
    }

    private GetUnbilledDailyRoamWifi createUnbilledDailyRoamWifiRequest(UnbilledDailyRoamWifiInput unbilledDailyRoamWifiInput) {
        ObjectFactory obj = new ObjectFactory();
        GetUnbilledDailyRoamWifi GetUnbilledDailyRoamWifi = obj.createGetUnbilledDailyRoamWifi();
        UnbilledDailyRoamWifiRequest unbilledDailyRoamWifiRequest = obj.createUnbilledDailyRoamWifiRequest();
        MrbEsbQueryUnbilledDailyRoamWifiDTO mrbEsbQueryUnbilledDailyRoamWifiDTO = obj.createMrbEsbQueryUnbilledDailyRoamWifiDTO();
        mrbEsbQueryUnbilledDailyRoamWifiDTO.setMsisdn(obj.createUnbilledDailyRoamWifiResultMsisdn(unbilledDailyRoamWifiInput.getMsisdn()));
        mrbEsbQueryUnbilledDailyRoamWifiDTO.setIccid(obj.createUnbilledDailyRoamWifiResultIccid(unbilledDailyRoamWifiInput.getIccid()));
        mrbEsbQueryUnbilledDailyRoamWifiDTO.setSubId(obj.createUnbilledDailyRoamWifiResultSubId(unbilledDailyRoamWifiInput.getSubId()));
        unbilledDailyRoamWifiRequest.setQueryUnbilledDailyRoamWifiDTO(obj.createUnbilledDailyRoamWifiRequestQueryUnbilledDailyRoamWifiDTO(mrbEsbQueryUnbilledDailyRoamWifiDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(unbilledDailyRoamWifiInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(unbilledDailyRoamWifiInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(unbilledDailyRoamWifiInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(unbilledDailyRoamWifiInput.getLanID()));
        unbilledDailyRoamWifiRequest.setOperInfo(obj.createUnbilledDailyRoamWifiRequestOperInfo(mrbEsbOperInfoDTO));
        GetUnbilledDailyRoamWifi.setUnbilledDailyRoamWifiRequest(obj.createGetUnbilledDailyRoamWifiUnbilledDailyRoamWifiRequest(unbilledDailyRoamWifiRequest));
        return GetUnbilledDailyRoamWifi;
    }

    private UnbilledDailyRoamWifiModelResponse parseUnbilledDailyRoamWifiResponse(GetUnbilledDailyRoamWifiResponse getUnbilledDailyRoamWifiResponse) {
        UnbilledDailyRoamWifiModelResponse unbilledDailyRoamWifiModelResponse = new UnbilledDailyRoamWifiModelResponse();
        JAXBElement<UnbilledDailyRoamWifiResult> unbilledDailyRoamWifiResultJAXBElement = getUnbilledDailyRoamWifiResponse.getReturn();
        UnbilledDailyRoamWifiResult unbilledDailyRoamWifiResult = unbilledDailyRoamWifiResultJAXBElement.getValue();
        if(unbilledDailyRoamWifiResult!=null) {
            for (MrbEsbUnbilledDailyRoamWifiDTO mrbEsbUnbilledDailyRoamWifiDTO : unbilledDailyRoamWifiResult.getListUnbilledDailyRoamWifi()) {
                if(mrbEsbUnbilledDailyRoamWifiDTO!=null) {
                    UnbilledDailyRoamWifiDTO unbilledDailyRoamWifiDTO = new UnbilledDailyRoamWifiDTO();
                    unbilledDailyRoamWifiDTO.setCallType(mrbEsbUnbilledDailyRoamWifiDTO.getCallType() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getCallType().getValue() : "");
                    unbilledDailyRoamWifiDTO.setFreeEntitle(mrbEsbUnbilledDailyRoamWifiDTO.getFreeEntitle() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getFreeEntitle().getValue() : "");
                    unbilledDailyRoamWifiDTO.setServiceType(mrbEsbUnbilledDailyRoamWifiDTO.getServiceType() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getServiceType().getValue() : "");
                    unbilledDailyRoamWifiDTO.setInScopeUsedUsage(mrbEsbUnbilledDailyRoamWifiDTO.getInScopeUsedUsage() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getInScopeUsedUsage().getValue() : "");
                    unbilledDailyRoamWifiDTO.setUnit(mrbEsbUnbilledDailyRoamWifiDTO.getUnit() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getUnit().getValue() : "");
                    unbilledDailyRoamWifiDTO.setLastUpdDate(mrbEsbUnbilledDailyRoamWifiDTO.getLastUpdDate() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getLastUpdDate().getValue() : "");
                    unbilledDailyRoamWifiDTO.setStartDate(mrbEsbUnbilledDailyRoamWifiDTO.getStartDate() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getStartDate().getValue() : "");
                    unbilledDailyRoamWifiDTO.setUsedUsage(mrbEsbUnbilledDailyRoamWifiDTO.getUsedUsage() != null ? mrbEsbUnbilledDailyRoamWifiDTO.getUsedUsage().getValue() : "");
                    unbilledDailyRoamWifiModelResponse.getUnbilledDailyRoamWifiDTOS().add(unbilledDailyRoamWifiDTO);
                }
            }
            unbilledDailyRoamWifiModelResponse.setIccid(unbilledDailyRoamWifiResult.getIccid() != null ? unbilledDailyRoamWifiResult.getIccid().getValue() : "");
            unbilledDailyRoamWifiModelResponse.setMsisdn(unbilledDailyRoamWifiResult.getMsisdn() != null ? unbilledDailyRoamWifiResult.getMsisdn().getValue() : "");
            unbilledDailyRoamWifiModelResponse.setSubId(unbilledDailyRoamWifiResult.getSubId() != null ? unbilledDailyRoamWifiResult.getSubId().getValue() : "");
            if (unbilledDailyRoamWifiResult.getResult() != null) {
                JAXBElement<MrbEsbResultDTO> result = unbilledDailyRoamWifiResult.getResult();
                if (result != null && result.getValue() != null) {
                    unbilledDailyRoamWifiModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                    unbilledDailyRoamWifiModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                    if (result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() != null) {
                        unbilledDailyRoamWifiModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                    } else {
                        unbilledDailyRoamWifiModelResponse.getResult().setResultRefCode("");
                    }
                }
            }
        }
        return unbilledDailyRoamWifiModelResponse;
    }

    public UnbillFreeEntitleInfoModelResponse getUnbillFreeEntitleInfo(UnbillFreeEntitleInfoInput unbillFreeEntitleInfoInput) {
        UnbillFreeEntitleInfoModelResponse unbillFreeEntitleInfoModelResponse = null;
        if(billingValidator.validateUnbillFreeEntitleInfo(unbillFreeEntitleInfoInput)) {
            GetUnbillFreeEntitleInfo getUnbillFreeEntitleInfo = createUnbillFreeEntitleInfoRequest(unbillFreeEntitleInfoInput);
            try {
                GetUnbillFreeEntitleInfoResponse getUnbillFreeEntitleInfoResponse = getUnbillFreeEntitleInfoWS(getUnbillFreeEntitleInfo);
                LOGGER.info("Response after successfully calling the SOAP API.." + getUnbillFreeEntitleInfoResponse);
                unbillFreeEntitleInfoModelResponse = parseUnbillFreeEntitleInfoResponse(getUnbillFreeEntitleInfoResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return unbillFreeEntitleInfoModelResponse;
    }

    GetUnbillFreeEntitleInfo createUnbillFreeEntitleInfoRequest(UnbillFreeEntitleInfoInput unbillFreeEntitleInfoInput) {
        ObjectFactory obj = new ObjectFactory();
        GetUnbillFreeEntitleInfo getUnbillFreeEntitleInfo = obj.createGetUnbillFreeEntitleInfo();
        UnbillFreeEntitleRequest unbillFreeEntitleRequest = obj.createUnbillFreeEntitleRequest();
        MrbEsbQryUbFreeEntDTO mrbEsbQryUbFreeEntDTO = obj.createMrbEsbQryUbFreeEntDTO();
        mrbEsbQryUbFreeEntDTO.setIccid(obj.createMrbEsbQryUbFreeEntDTOIccid(unbillFreeEntitleInfoInput.getIccid()));
        mrbEsbQryUbFreeEntDTO.setMsisdn(obj.createMrbEsbQryUbFreeEntDTOMsisdn(unbillFreeEntitleInfoInput.getMsisdn()));
        mrbEsbQryUbFreeEntDTO.setSubId(obj.createMrbEsbQryUbFreeEntDTOSubId(unbillFreeEntitleInfoInput.getSubId()));
        unbillFreeEntitleRequest.setQryUbFreeEntDTO(obj.createUnbillFreeEntitleRequestQryUbFreeEntDTO(mrbEsbQryUbFreeEntDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(unbillFreeEntitleInfoInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(unbillFreeEntitleInfoInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(unbillFreeEntitleInfoInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(unbillFreeEntitleInfoInput.getLanID()));
        unbillFreeEntitleRequest.setOperInfo(obj.createUnbillFreeEntitleRequestOperInfo(mrbEsbOperInfoDTO));
        getUnbillFreeEntitleInfo.setReq(obj.createGetUnbillFreeEntitleInfoReq(unbillFreeEntitleRequest));
        return getUnbillFreeEntitleInfo;
    }

    UnbillFreeEntitleInfoModelResponse parseUnbillFreeEntitleInfoResponse(GetUnbillFreeEntitleInfoResponse getUnbillFreeEntitleInfoResponse) {
        UnbillFreeEntitleInfoModelResponse unbillFreeEntitleInfoModelResponse = new UnbillFreeEntitleInfoModelResponse();
        JAXBElement<UnbillFreeEntitleResponse> unbillFreeEntitleResponseJAXBElement = getUnbillFreeEntitleInfoResponse.getReturn();
        UnbillFreeEntitleResponse unbillFreeEntitleResponse = unbillFreeEntitleResponseJAXBElement.getValue();
        JAXBElement<MrbEsbUbFreeEntResDTO> mrbEsbUbFreeEntResDTOJAXBElement = unbillFreeEntitleResponse.getUbFreeEntResDTO();
        MrbEsbUbFreeEntResDTO mrbEsbUbFreeEntResDTO = mrbEsbUbFreeEntResDTOJAXBElement.getValue();
        if(mrbEsbUbFreeEntResDTO!=null && mrbEsbUbFreeEntResDTO.getListEsbUbFreeEnt()!=null) {
            for (MrbEsbUbFreeEntDTO mrbEsbUbFreeEntDTO : mrbEsbUbFreeEntResDTO.getListEsbUbFreeEnt()) {
                if(mrbEsbUbFreeEntDTO!=null) {
                    UbFreeEntDTO ubFreeEntDTO = new UbFreeEntDTO();
                    ubFreeEntDTO.setServiceType(mrbEsbUbFreeEntDTO.getServiceType() != null ? mrbEsbUbFreeEntDTO.getServiceType().getValue() : "");
                    ubFreeEntDTO.setCallType(mrbEsbUbFreeEntDTO.getCallType() != null ? mrbEsbUbFreeEntDTO.getCallType().getValue() : "");
                    ubFreeEntDTO.setUnit(mrbEsbUbFreeEntDTO.getUnit() != null ? mrbEsbUbFreeEntDTO.getUnit().getValue() : "");
                    ubFreeEntDTO.setUsedUsage(mrbEsbUbFreeEntDTO.getUsedUsage() != null ? mrbEsbUbFreeEntDTO.getUsedUsage().getValue() : "");
                    ubFreeEntDTO.setValue(mrbEsbUbFreeEntDTO.getValue() != null ? mrbEsbUbFreeEntDTO.getValue().getValue() : "");
                    unbillFreeEntitleInfoModelResponse.getUnbilledFreeEntDTOs().add(ubFreeEntDTO);
                }
            }
        }
        unbillFreeEntitleInfoModelResponse.setIccid(mrbEsbUbFreeEntResDTO.getIccid()!=null ? mrbEsbUbFreeEntResDTO.getIccid().getValue() : "");
        unbillFreeEntitleInfoModelResponse.setMsisdn(mrbEsbUbFreeEntResDTO.getMsisdn()!=null ? mrbEsbUbFreeEntResDTO.getMsisdn().getValue() : "");
        unbillFreeEntitleInfoModelResponse.setSubId(mrbEsbUbFreeEntResDTO.getSubId()!=null ? mrbEsbUbFreeEntResDTO.getSubId().getValue() : "");
        unbillFreeEntitleInfoModelResponse.setLastUpdDate(mrbEsbUbFreeEntResDTO.getLastUpdDate()!=null ? mrbEsbUbFreeEntResDTO.getLastUpdDate().getValue() : "");
        if(mrbEsbUbFreeEntResDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbUbFreeEntResDTO.getResult();
            if(result != null && result.getValue()!=null) {
                unbillFreeEntitleInfoModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                unbillFreeEntitleInfoModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    unbillFreeEntitleInfoModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    unbillFreeEntitleInfoModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return unbillFreeEntitleInfoModelResponse;
    }

    public UnbilledNEDayPassUsageModelResponse getUnbilledNEDayPassUsage(UnbilledNEDayPassUsageInput unbilledNEDayPassUsageInput) {
        UnbilledNEDayPassUsageModelResponse unbilledNEDayPassUsageModelResponse = null;
        if(billingValidator.validateUnbilledNEDayPassUsage(unbilledNEDayPassUsageInput)) {
            GetUnbilledNEDayPassUsage getUnbilledNEDayPassUsage = createUnbilledNEDayPassUsageRequest(unbilledNEDayPassUsageInput);
            try {
                GetUnbilledNEDayPassUsageResponse getUnbilledNEDayPassUsageResponse = getUnbilledNEDayPassUsageWS(getUnbilledNEDayPassUsage);
                LOGGER.info("Response after successfully calling the SOAP API.." + getUnbilledNEDayPassUsageResponse);
                unbilledNEDayPassUsageModelResponse = parseUnbilledNEDayPassUsageResponse(getUnbilledNEDayPassUsageResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return unbilledNEDayPassUsageModelResponse;
    }

    private GetUnbilledNEDayPassUsage createUnbilledNEDayPassUsageRequest(UnbilledNEDayPassUsageInput unbilledNEDayPassUsageInput) {
        ObjectFactory obj = new ObjectFactory();
        GetUnbilledNEDayPassUsage getUnbilledNEDayPassUsage = obj.createGetUnbilledNEDayPassUsage();
        UnbilledNEDayPassUsageRequest unbilledNEDayPassUsageRequest = obj.createUnbilledNEDayPassUsageRequest();
        MrbEsbQryUbNEDayPassUsageDTO mrbEsbQryUbNEDayPassUsageDTO = obj.createMrbEsbQryUbNEDayPassUsageDTO();
        mrbEsbQryUbNEDayPassUsageDTO.setIccid(obj.createMrbEsbQryUbNEDayPassUsageDTOIccid(unbilledNEDayPassUsageInput.getIccid()));
        mrbEsbQryUbNEDayPassUsageDTO.setNeServiceID(obj.createMrbEsbQryUbNEDayPassUsageDTONeServiceID(unbilledNEDayPassUsageInput.getNeServiceID()));
        mrbEsbQryUbNEDayPassUsageDTO.setMsisdn(obj.createMrbEsbQryUbNEDayPassUsageDTOMsisdn(unbilledNEDayPassUsageInput.getMsisdn()));
        mrbEsbQryUbNEDayPassUsageDTO.setSubId(obj.createMrbEsbQryUbNEDayPassUsageDTOSubId(unbilledNEDayPassUsageInput.getSubId()));
        mrbEsbQryUbNEDayPassUsageDTO.setOfferGroup(obj.createMrbEsbQryUbNEDayPassUsageDTOOfferGroup(unbilledNEDayPassUsageInput.getOfferGroup()));
        unbilledNEDayPassUsageRequest.setQryUbNEDayPassUsageDTO(obj.createUnbilledNEDayPassUsageRequestQryUbNEDayPassUsageDTO(mrbEsbQryUbNEDayPassUsageDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(unbilledNEDayPassUsageInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(unbilledNEDayPassUsageInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(unbilledNEDayPassUsageInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(unbilledNEDayPassUsageInput.getLanID()));
        unbilledNEDayPassUsageRequest.setOperInfo(obj.createUnbilledNEDayPassUsageRequestOperInfo(mrbEsbOperInfoDTO));

        getUnbilledNEDayPassUsage.setReq(obj.createGetUnbilledNEDayPassUsageReq(unbilledNEDayPassUsageRequest));

        return getUnbilledNEDayPassUsage;
    }

    private UnbilledNEDayPassUsageModelResponse parseUnbilledNEDayPassUsageResponse(GetUnbilledNEDayPassUsageResponse getUnbilledNEDayPassUsageResponse) {
        UnbilledNEDayPassUsageModelResponse unbilledNEDayPassUsageModelResponse = new UnbilledNEDayPassUsageModelResponse();
        JAXBElement<UnbilledNEDayPassUsageResponse> unbilledNEDayPassUsageResponseJAXBElement = getUnbilledNEDayPassUsageResponse.getReturn();
        UnbilledNEDayPassUsageResponse unbilledNEDayPassUsageResponse = unbilledNEDayPassUsageResponseJAXBElement.getValue();
        JAXBElement<MrbEsbUbNEDayPassUsageResultDTO> mrbEsbUbNEDayPassUsageResultDTOJAXBElement = unbilledNEDayPassUsageResponse.getUbNEDayPassUsageResultDTO();
        MrbEsbUbNEDayPassUsageResultDTO mrbEsbUbNEDayPassUsageResultDTO = mrbEsbUbNEDayPassUsageResultDTOJAXBElement.getValue();
        if(mrbEsbUbNEDayPassUsageResultDTO.getListUbNEDayPassUsage()!=null) {
            for (MrbEsbUbNEDayPassUsageDTO mrbEsbUbNEDayPassUsageDTO : mrbEsbUbNEDayPassUsageResultDTO.getListUbNEDayPassUsage()) {
                if(mrbEsbUbNEDayPassUsageDTO!=null) {
                    UbNEDayPassUsageDTO ubNEDayPassUsageDTO = new UbNEDayPassUsageDTO();
                    if(mrbEsbUbNEDayPassUsageDTO.getListUbNEDayPass()!=null) {
                        for (MrbEsbUbNEDayPassDTO mrbEsbUbNEDayPassDTO : mrbEsbUbNEDayPassUsageDTO.getListUbNEDayPass()) {
                            if(mrbEsbUbNEDayPassDTO!=null) {
                                UbNEDayPassDTO ubNEDayPassDTO = new UbNEDayPassDTO();
                                ubNEDayPassDTO.setUsageDate(mrbEsbUbNEDayPassDTO.getUsageDate() != null ? mrbEsbUbNEDayPassDTO.getUsageDate().getValue() : "");
                                ubNEDayPassDTO.setMsisdn(mrbEsbUbNEDayPassDTO.getMsisdn() != null ? mrbEsbUbNEDayPassDTO.getMsisdn().getValue() : "");
                                ubNEDayPassDTO.setChargeAmount(mrbEsbUbNEDayPassDTO.getChargeAmount() != null ? mrbEsbUbNEDayPassDTO.getChargeAmount().getValue() : "");
                                ubNEDayPassUsageDTO.getUbNEDayPassDTOList().add(ubNEDayPassDTO);
                            }
                        }
                    }
                    ubNEDayPassUsageDTO.setNeDayPassChiDescription(mrbEsbUbNEDayPassUsageDTO.getNeDayPassChiDescr() != null ? mrbEsbUbNEDayPassUsageDTO.getNeDayPassChiDescr().getValue() : "");
                    ubNEDayPassUsageDTO.setNeDayPassEngDescription(mrbEsbUbNEDayPassUsageDTO.getNeDayPassEngDescr() != null ? mrbEsbUbNEDayPassUsageDTO.getNeDayPassEngDescr().getValue() : "");
                    unbilledNEDayPassUsageModelResponse.getUbNEDayPassUsageDTO().add(ubNEDayPassUsageDTO);
                }
            }
        }
        unbilledNEDayPassUsageModelResponse.setIccid(mrbEsbUbNEDayPassUsageResultDTO.getIccid()!=null ? mrbEsbUbNEDayPassUsageResultDTO.getIccid().getValue() : "");
        unbilledNEDayPassUsageModelResponse.setLastUpdDate(mrbEsbUbNEDayPassUsageResultDTO.getLastUpdDate()!=null ? mrbEsbUbNEDayPassUsageResultDTO.getLastUpdDate().getValue() : "");
        unbilledNEDayPassUsageModelResponse.setMsisdn(mrbEsbUbNEDayPassUsageResultDTO.getMsisdn()!=null ? mrbEsbUbNEDayPassUsageResultDTO.getMsisdn().getValue() : "");
        unbilledNEDayPassUsageModelResponse.setSubId(mrbEsbUbNEDayPassUsageResultDTO.getSubId()!=null ? mrbEsbUbNEDayPassUsageResultDTO.getSubId().getValue() : "");
        if(mrbEsbUbNEDayPassUsageResultDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbUbNEDayPassUsageResultDTO.getResult();
            if(result != null && result.getValue()!=null) {
                unbilledNEDayPassUsageModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                unbilledNEDayPassUsageModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    unbilledNEDayPassUsageModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    unbilledNEDayPassUsageModelResponse.getResult().setResultRefCode("");
                }
            }
        }
    return unbilledNEDayPassUsageModelResponse;
    }

    public SubmitCSAutoBillReprintInputModelResponse submitCSAutoBillReprint(SubmitCSAutoBillReprintInput submitCSAutoBillReprintInput) {
        SubmitCSAutoBillReprintInputModelResponse submitCSAutoBillReprintInputModelResponse = null;
        if(billingValidator.submitCSAutoBillReprintInput(submitCSAutoBillReprintInput)) {
            SubmitCSAutoBillReprintRequest submitCSAutoBillReprintRequest = createSubmitCSAutoBillReprintRequest(submitCSAutoBillReprintInput);
            try {
                SubmitCSAutoBillReprintRequestResponse submitCSAutoBillReprintRequestResponse = getSubmitCSAutoBillReprintWS(submitCSAutoBillReprintRequest);
                LOGGER.info("Response after successfully calling the SOAP API.." + submitCSAutoBillReprintRequestResponse);
                submitCSAutoBillReprintInputModelResponse = parseSubmitCSAutoBillReprintResponse(submitCSAutoBillReprintRequestResponse);
            } catch (Exception e) {
                LOGGER.error("Exception while calling/processing SOAP API response..", e);
            }
        }
        return submitCSAutoBillReprintInputModelResponse;
    }

    private SubmitCSAutoBillReprintRequest createSubmitCSAutoBillReprintRequest(SubmitCSAutoBillReprintInput submitCSAutoBillReprintInput) {
        ObjectFactory obj = new ObjectFactory();
        SubmitCSAutoBillReprintRequest submitCSAutoBillReprintRequest = obj.createSubmitCSAutoBillReprintRequest();

        SubmitBillReprintRequest submitBillReprintRequest = obj.createSubmitBillReprintRequest();

        MrbEsbCSAutoBillReprintReqDTO mrbEsbCSAutoBillReprintReqDTO = obj.createMrbEsbCSAutoBillReprintReqDTO();
        mrbEsbCSAutoBillReprintReqDTO.setBillCycle(obj.createMrbEsbCSAutoBillReprintReqDTOBillCycle(submitCSAutoBillReprintInput.getBillCycle()));
        mrbEsbCSAutoBillReprintReqDTO.setBillType(obj.createMrbEsbCSAutoBillReprintReqDTOBillType(submitCSAutoBillReprintInput.getBillType()));
        mrbEsbCSAutoBillReprintReqDTO.setAcctNum(obj.createMrbEsbCSAutoBillReprintReqDTOAcctNum(submitCSAutoBillReprintInput.getAcctNum()));
        submitBillReprintRequest.setCsAutoBillReprintReqDTO(obj.createSubmitBillReprintRequestCsAutoBillReprintReqDTO(mrbEsbCSAutoBillReprintReqDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(submitCSAutoBillReprintInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(submitCSAutoBillReprintInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(submitCSAutoBillReprintInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(submitCSAutoBillReprintInput.getLanID()));
        submitBillReprintRequest.setOperInfo(obj.createSubmitBillReprintRequestOperInfo(mrbEsbOperInfoDTO));
        submitCSAutoBillReprintRequest.setReq(obj.createSubmitCSAutoBillReprintRequestReq(submitBillReprintRequest));
        return submitCSAutoBillReprintRequest;
    }

    private SubmitCSAutoBillReprintInputModelResponse parseSubmitCSAutoBillReprintResponse(SubmitCSAutoBillReprintRequestResponse wsResponse) {
        SubmitCSAutoBillReprintInputModelResponse submitCSAutoBillReprintInputModelResponse = new SubmitCSAutoBillReprintInputModelResponse();
        JAXBElement<SubmitBillReprintResponse> submitBillReprintResponseJAXBElement = wsResponse.getReturn();
        SubmitBillReprintResponse submitBillReprintResponse = submitBillReprintResponseJAXBElement.getValue();
        JAXBElement<MrbEsbBillingAddressDTO> mrbEsbBillingAddressDTOJAXBElement = submitBillReprintResponse.getBillingAddressDTO();
        MrbEsbBillingAddressDTO mrbEsbBillingAddressDTO = mrbEsbBillingAddressDTOJAXBElement.getValue();
        submitCSAutoBillReprintInputModelResponse.setAddrDesc1(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAddrDesc2(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAddrDesc3(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAddrDesc4(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAddrDesc5(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAddrDesc1(mrbEsbBillingAddressDTO.getAddrDesc1()!=null ?mrbEsbBillingAddressDTO.getAddrDesc1().getValue() : "");
        submitCSAutoBillReprintInputModelResponse.setAcctNum(mrbEsbBillingAddressDTO.getAcctNum()!=null ?mrbEsbBillingAddressDTO.getAcctNum().getValue() : "");
        if(mrbEsbBillingAddressDTO.getResult()!=null) {
            JAXBElement<MrbEsbResultDTO> result = mrbEsbBillingAddressDTO.getResult();
            if(result != null && result.getValue()!=null) {
                submitCSAutoBillReprintInputModelResponse.getResult().setErrCode(result.getValue().getErrCode() != null ? result.getValue().getErrCode().getValue() : "");
                submitCSAutoBillReprintInputModelResponse.getResult().setErrMsg(result.getValue().getErrMsg() != null ? result.getValue().getErrMsg().getValue() : "");
                if(result.getValue().getResultRefCode() != null && result.getValue().getResultRefCode().getValue() !=null) {
                    submitCSAutoBillReprintInputModelResponse.getResult().setResultRefCode(result.getValue().getResultRefCode().getValue());
                } else {
                    submitCSAutoBillReprintInputModelResponse.getResult().setResultRefCode("");
                }
            }
        }
        return submitCSAutoBillReprintInputModelResponse;
    }

}
