package com.jaishna.soapwrapper.utils;

import com.jaishna.soapwrapper.gen.*;
import com.jaishna.soapwrapper.model.*;
import org.springframework.stereotype.Service;

@Service
public class RequestCreator {

    public AcctOSPenaltyRequest createAcctOSPenaltyRequest(AcctOSPenalty acctOSPenalty) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctOSPenalty getAcctOSPenalty = obj.createGetAcctOSPenalty();
        AcctOSPenaltyRequest request = obj.createAcctOSPenaltyRequest();
        MrbEsbAcctDTO mrbEsbAcctDTO = obj.createMrbEsbAcctDTO();
        mrbEsbAcctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(acctOSPenalty.getAccountNumber()));
        request.setAcctDTO(obj.createAcctOSPenaltyRequestAcctDTO(mrbEsbAcctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctOSPenalty.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctOSPenalty.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctOSPenalty.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctOSPenalty.getLanID()));
        request.setOperInfo(obj.createAcctInfoRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctOSPenalty.setAcctOSPenaltyRequest(obj.createGetAcctOSPenaltyAcctOSPenaltyRequest(request));
        return request;
    }

    public GetAcctInfo createAcctInfoRequest(AcctInfo acctInfo) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctInfo getAcctInfo = obj.createGetAcctInfo();
        AcctInfoRequest acctInfoRequest = obj.createAcctInfoRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(acctInfo.getAccountNumber()));
        acctInfoRequest.setAcctDTO(obj.createAcctInfoRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctInfo.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctInfo.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctInfo.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctInfo.getLanID()));
        acctInfoRequest.setOperInfo(obj.createAcctInfoRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctInfo.setAcctInfoRequest(obj.createGetAcctInfoAcctInfoRequest(acctInfoRequest));
        return getAcctInfo;
    }

    public GetAcctCommonInfo createAcctCommonInfoRequest(AccountCommonInfo accountCommonInfo) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctCommonInfo getAccountCommonInfo = obj.createGetAcctCommonInfo();
        AcctCommonInfoRequest request = obj.createAcctCommonInfoRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(accountCommonInfo.getAccountNumber()));
        request.setAcctDTO(obj.createAcctCommonInfoRequestAcctDTO(acctDTO));
        MrbEsbOperInfoDTO operInfoDTO = obj.createMrbEsbOperInfoDTO();
        operInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(accountCommonInfo.getOperationId()));
        operInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(accountCommonInfo.getChannel()));
        request.setOperInfo(obj.createAcctCommonInfoRequestOperInfo(operInfoDTO));
        getAccountCommonInfo.setAcctCommonInfoRequest(obj.createGetAcctCommonInfoAcctCommonInfoRequest(request));
        return getAccountCommonInfo;
    }

    public GetAcctCreditSts createAcctCreditStsRequest(AcctCreditSts acctCreditStatus) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctCreditSts getAcctCreditSts = obj.createGetAcctCreditSts();
        GetAcctCreditStsRequest request = obj.createGetAcctCreditStsRequest();
        MrbEsbSubDTO subDTO = new MrbEsbSubDTO();
        subDTO.setMsisdn(obj.createMrbEsbSubDTOMsisdn(acctCreditStatus.getMsisdn()));
        request.setSubDTO(obj.createGetAcctCreditStsRequestSubDTO(subDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctCreditStatus.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctCreditStatus.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctCreditStatus.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctCreditStatus.getLanID()));
        request.setOperInfo(obj.createAcctInfoRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctCreditSts.setGetAcctCreditStsReq(obj.createGetAcctCreditStsGetAcctCreditStsReq(request));
        return getAcctCreditSts;
    }

    public GetAcctCreditStatus createAcctCreditStatusRequest(AcctCreditStatus acctCreditStatus) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctCreditStatus getAcctCreditStatus = obj.createGetAcctCreditStatus();
        AcctCreditStatusRequest request = obj.createAcctCreditStatusRequest();
        MrbEsbAcctDTO mrbEsbAcctDTO = obj.createMrbEsbAcctDTO();
        mrbEsbAcctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(acctCreditStatus.getAcctNum()));
        request.setAcctDTO(obj.createAcctCreditStatusRequestAcctDTO(mrbEsbAcctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctCreditStatus.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctCreditStatus.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctCreditStatus.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctCreditStatus.getLanID()));
        request.setOperInfo(obj.createAcctInfoRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctCreditStatus.setReq(obj.createGetAcctCreditStatusReq(request));
        return getAcctCreditStatus;
    }



    public AcctTotalOSBalRequest createAcctTotalOSBalRequest(AcctTotalOSBal acctTotalOSBal) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctTotalOSBal getAcctTotalOSBal = obj.createGetAcctTotalOSBal();
        AcctTotalOSBalRequest request = obj.createAcctTotalOSBalRequest();
        MrbEsbQryAcctDTO mrbEsbQryAcctDTO = obj.createMrbEsbQryAcctDTO();
        mrbEsbQryAcctDTO.setAcctCode(obj.createMrbEsbQryAcctDTOAcctCode(acctTotalOSBal.getAcctCode()));
        mrbEsbQryAcctDTO.setAcctNum(obj.createMrbEsbQryAcctDTOAcctNum(acctTotalOSBal.getAcctNum()));
        mrbEsbQryAcctDTO.setMsisdn(obj.createMrbEsbQryAcctDTOMsisdn(acctTotalOSBal.getMsisdn()));
        request.setAcctDTO(obj.createAcctTotalOSBalRequestAcctDTO(mrbEsbQryAcctDTO));
        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctTotalOSBal.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctTotalOSBal.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctTotalOSBal.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctTotalOSBal.getLanID()));
        request.setOperInfo(obj.createAcctTotalOSBalRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctTotalOSBal.setAcctTotalOSBalRequest(obj.createGetAcctTotalOSBalAcctTotalOSBalRequest(request));
        return request;
    }

    public GetAcctSingleCreditInfo createAcctSingleCreditInfoRequest(AcctSingleCreditInfo acctSingleCreditInfo) {
        ObjectFactory obj = new ObjectFactory();
        GetAcctSingleCreditInfo getAcctSingleCreditInfo = obj.createGetAcctSingleCreditInfo();
        AcctSingleCreditInfoRequest acctSingleCreditInfoRequest = obj.createAcctSingleCreditInfoRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(acctSingleCreditInfo.getAccountNumber()));
        acctSingleCreditInfoRequest.setAcctDTO(obj.createAcctInfoRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(acctSingleCreditInfo.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(acctSingleCreditInfo.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(acctSingleCreditInfo.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(acctSingleCreditInfo.getLanID()));
        acctSingleCreditInfoRequest.setOperInfo(obj.createAcctInfoRequestOperInfo(mrbEsbOperInfoDTO));
        getAcctSingleCreditInfo.setAcctSingleCreditInfoRequest(obj.createGetAcctSingleCreditInfoAcctSingleCreditInfoRequest(acctSingleCreditInfoRequest));
        return getAcctSingleCreditInfo;
    }

    public ValidateAcctForHoldDunning createValidateAcctForHoldDunningRequest(ValidateAcctForHoldDunningInput validateAcctForHoldDunningInput) {
        ObjectFactory obj = new ObjectFactory();
        ValidateAcctForHoldDunning validateAcctForHoldDunning = obj.createValidateAcctForHoldDunning();
        ValidateAcctForHoldDunRequest validateAcctForHoldDunRequest = obj.createValidateAcctForHoldDunRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(validateAcctForHoldDunningInput.getAcctNum()));
        validateAcctForHoldDunRequest.setAcctDTO(obj.createValidateAcctForHoldDunRequestAcctDTO(acctDTO));
        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(validateAcctForHoldDunningInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(validateAcctForHoldDunningInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(validateAcctForHoldDunningInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(validateAcctForHoldDunningInput.getLanID()));
        validateAcctForHoldDunRequest.setOperInfo(obj.createValidateAcctForHoldDunRequestOperInfo(mrbEsbOperInfoDTO));
        validateAcctForHoldDunning.setReq(obj.createValidateAcctForHoldDunningReq(validateAcctForHoldDunRequest));
        return validateAcctForHoldDunning;
    }

    public SubmitAcctHoldDunningReq createSubmitAcctHoldDunningRequest(SubmitAcctHoldDunningInput submitAcctHoldDunningInput) {
        ObjectFactory obj = new ObjectFactory();
        SubmitAcctHoldDunningReq submitAcctHoldDunningReq = obj.createSubmitAcctHoldDunningReq();
        SubmitAcctHoldDunRequest submitAcctHoldDunRequest = obj.createSubmitAcctHoldDunRequest();
        MrbEsbAcctDTO acctDTO = obj.createMrbEsbAcctDTO();
        acctDTO.setAcctNum(obj.createMrbEsbAcctDTOAcctNum(submitAcctHoldDunningInput.getAcctNum()));
        submitAcctHoldDunRequest.setAcctDTO(obj.createSubmitAcctHoldDunRequestAcctDTO(acctDTO));

        MrbEsbOperInfoDTO mrbEsbOperInfoDTO = obj.createMrbEsbOperInfoDTO();
        mrbEsbOperInfoDTO.setChannel(obj.createMrbEsbOperInfoDTOChannel(submitAcctHoldDunningInput.getChannel()));
        mrbEsbOperInfoDTO.setOperID(obj.createMrbEsbOperInfoDTOOperID(submitAcctHoldDunningInput.getOperID()));
        mrbEsbOperInfoDTO.setDeptID(obj.createMrbEsbOperInfoDTODeptID(submitAcctHoldDunningInput.getDeptID()));
        mrbEsbOperInfoDTO.setLanID(obj.createMrbEsbOperInfoDTOLanID(submitAcctHoldDunningInput.getLanID()));

        submitAcctHoldDunRequest.setOperInfo(obj.createSubmitAcctHoldDunRequestOperInfo(mrbEsbOperInfoDTO));
        submitAcctHoldDunningReq.setReq(obj.createSubmitAcctHoldDunningReqReq(submitAcctHoldDunRequest));
        return submitAcctHoldDunningReq;
    }

}
