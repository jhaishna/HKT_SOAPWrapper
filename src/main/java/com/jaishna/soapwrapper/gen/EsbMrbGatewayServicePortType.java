
package com.jaishna.soapwrapper.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EsbMrbGatewayServicePortType", targetNamespace = "http://services.mrb.mob.bom")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EsbMrbGatewayServicePortType {


    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.ListBillDateResponse
     */
    @WebMethod(action = "urn:getListBillDate")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getListBillDate", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetListBillDate")
    @ResponseWrapper(localName = "getListBillDateResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetListBillDateResponse")
    public ListBillDateResponse getListBillDate(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        ListBillDateRequest req);

    /**
     * 
     * @param acctOSPenaltyRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctOSPenaltyResponse
     */
    @WebMethod(action = "urn:getAcctOSPenalty")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctOSPenalty", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctOSPenalty")
    @ResponseWrapper(localName = "getAcctOSPenaltyResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctOSPenaltyResponse")
    public AcctOSPenaltyResponse getAcctOSPenalty(
        @WebParam(name = "acctOSPenaltyRequest", targetNamespace = "http://services.mrb.mob.bom")
        AcctOSPenaltyRequest acctOSPenaltyRequest);

    /**
     * 
     * @param acctCommonInfoRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctCommonInfoResponse
     */
    @WebMethod(action = "urn:getAcctCommonInfo")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctCommonInfo", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCommonInfo")
    @ResponseWrapper(localName = "getAcctCommonInfoResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCommonInfoResponse")
    public AcctCommonInfoResponse getAcctCommonInfo(
        @WebParam(name = "acctCommonInfoRequest", targetNamespace = "http://services.mrb.mob.bom")
        AcctCommonInfoRequest acctCommonInfoRequest);

    /**
     * 
     * @param currOSInfoRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.CurrOSInfoResponse
     */
    @WebMethod(action = "urn:getCurrOSInfo")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getCurrOSInfo", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetCurrOSInfo")
    @ResponseWrapper(localName = "getCurrOSInfoResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetCurrOSInfoResponse")
    public CurrOSInfoResponse getCurrOSInfo(
        @WebParam(name = "currOSInfoRequest", targetNamespace = "http://services.mrb.mob.bom")
        CurrOSInfoRequest currOSInfoRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.SubmitAcctHoldDunResponse
     */
    @WebMethod(action = "urn:submitAcctHoldDunningReq")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "submitAcctHoldDunningReq", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.SubmitAcctHoldDunningReq")
    @ResponseWrapper(localName = "submitAcctHoldDunningReqResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.SubmitAcctHoldDunningReqResponse")
    public SubmitAcctHoldDunResponse submitAcctHoldDunningReq(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        SubmitAcctHoldDunRequest req);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.UnbilledNEDayPassUsageResponse
     */
    @WebMethod(action = "urn:getUnbilledNEDayPassUsage")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getUnbilledNEDayPassUsage", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbilledNEDayPassUsage")
    @ResponseWrapper(localName = "getUnbilledNEDayPassUsageResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbilledNEDayPassUsageResponse")
    public UnbilledNEDayPassUsageResponse getUnbilledNEDayPassUsage(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        UnbilledNEDayPassUsageRequest req);

    /**
     * 
     * @param getAcctCreditStsReq
     * @return
     *     returns com.jaishna.soapwrapper.gen.GetAcctCreditStsResponse2
     */
    @WebMethod(action = "urn:getAcctCreditSts")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctCreditSts", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCreditSts")
    @ResponseWrapper(localName = "getAcctCreditStsResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCreditStsResponse")
    public GetAcctCreditStsResponse2 getAcctCreditSts(
        @WebParam(name = "getAcctCreditStsReq", targetNamespace = "http://services.mrb.mob.bom")
        GetAcctCreditStsRequest getAcctCreditStsReq);

    /**
     * 
     * @param bomNextBillDateRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.BomNextBillDateResponse
     */
    @WebMethod(action = "urn:getBomNextBillDate")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getBomNextBillDate", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBomNextBillDate")
    @ResponseWrapper(localName = "getBomNextBillDateResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBomNextBillDateResponse")
    public BomNextBillDateResponse getBomNextBillDate(
        @WebParam(name = "bomNextBillDateRequest", targetNamespace = "http://services.mrb.mob.bom")
        BomNextBillDateRequest bomNextBillDateRequest);

    /**
     * 
     * @param paymentRejectStsRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.PaymentRejectStsResponse
     */
    @WebMethod(action = "urn:chkPaymentRejectSts")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "chkPaymentRejectSts", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ChkPaymentRejectSts")
    @ResponseWrapper(localName = "chkPaymentRejectStsResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ChkPaymentRejectStsResponse")
    public PaymentRejectStsResponse chkPaymentRejectSts(
        @WebParam(name = "paymentRejectStsRequest", targetNamespace = "http://services.mrb.mob.bom")
        PaymentRejectStsRequest paymentRejectStsRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.SubmitBillReprintResponse
     */
    @WebMethod(action = "urn:submitCSAutoBillReprintRequest")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "submitCSAutoBillReprintRequest", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.SubmitCSAutoBillReprintRequest")
    @ResponseWrapper(localName = "submitCSAutoBillReprintRequestResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.SubmitCSAutoBillReprintRequestResponse")
    public SubmitBillReprintResponse submitCSAutoBillReprintRequest(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        SubmitBillReprintRequest req);

    /**
     * 
     * @param getAccountCreditStsReq
     * @return
     *     returns com.jaishna.soapwrapper.gen.GetAccountCreditStsResponse2
     */
    @WebMethod(action = "urn:getAccountCreditSts")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAccountCreditSts", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAccountCreditSts")
    @ResponseWrapper(localName = "getAccountCreditStsResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAccountCreditStsResponse")
    public GetAccountCreditStsResponse2 getAccountCreditSts(
        @WebParam(name = "getAccountCreditStsReq", targetNamespace = "http://services.mrb.mob.bom")
        GetAccountCreditStsRequest getAccountCreditStsReq);

    /**
     * 
     * @param billHistoryRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.BillHistoryResponse
     */
    @WebMethod(action = "urn:getBillHistory")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getBillHistory", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBillHistory")
    @ResponseWrapper(localName = "getBillHistoryResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBillHistoryResponse")
    public BillHistoryResponse getBillHistory(
        @WebParam(name = "billHistoryRequest", targetNamespace = "http://services.mrb.mob.bom")
        BillHistoryRequest billHistoryRequest);

    /**
     * 
     * @param acctSingleCreditInfoRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctSingleCreditInfoResponse
     */
    @WebMethod(action = "urn:getAcctSingleCreditInfo")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctSingleCreditInfo", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctSingleCreditInfo")
    @ResponseWrapper(localName = "getAcctSingleCreditInfoResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctSingleCreditInfoResponse")
    public AcctSingleCreditInfoResponse getAcctSingleCreditInfo(
        @WebParam(name = "acctSingleCreditInfoRequest", targetNamespace = "http://services.mrb.mob.bom")
        AcctSingleCreditInfoRequest acctSingleCreditInfoRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctCreditStatusResponse
     */
    @WebMethod(action = "urn:getAcctCreditStatus")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctCreditStatus", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCreditStatus")
    @ResponseWrapper(localName = "getAcctCreditStatusResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctCreditStatusResponse")
    public AcctCreditStatusResponse getAcctCreditStatus(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        AcctCreditStatusRequest req);

    /**
     * 
     * @param unbilledDailyRoamWifiRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.UnbilledDailyRoamWifiResult
     */
    @WebMethod(action = "urn:getUnbilledDailyRoamWifi")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getUnbilledDailyRoamWifi", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbilledDailyRoamWifi")
    @ResponseWrapper(localName = "getUnbilledDailyRoamWifiResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbilledDailyRoamWifiResponse")
    public UnbilledDailyRoamWifiResult getUnbilledDailyRoamWifi(
        @WebParam(name = "unbilledDailyRoamWifiRequest", targetNamespace = "http://services.mrb.mob.bom")
        UnbilledDailyRoamWifiRequest unbilledDailyRoamWifiRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.BillingAddressResponse
     */
    @WebMethod(action = "urn:getBillingAddress")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getBillingAddress", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBillingAddress")
    @ResponseWrapper(localName = "getBillingAddressResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetBillingAddressResponse")
    public BillingAddressResponse getBillingAddress(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        BillingAddressRequest req);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.ChargeItemizedBillResponse2
     */
    @WebMethod(action = "urn:chargeItemizedBill")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "chargeItemizedBill", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ChargeItemizedBill")
    @ResponseWrapper(localName = "chargeItemizedBillResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ChargeItemizedBillResponse")
    public ChargeItemizedBillResponse2 chargeItemizedBill(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        ChargeItemizedBillRequest req);

    /**
     * 
     * @param dunningHistoryRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.DunningHistoryResponse
     */
    @WebMethod(action = "urn:getDunningHistory")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getDunningHistory", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetDunningHistory")
    @ResponseWrapper(localName = "getDunningHistoryResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetDunningHistoryResponse")
    public DunningHistoryResponse getDunningHistory(
        @WebParam(name = "dunningHistoryRequest", targetNamespace = "http://services.mrb.mob.bom")
        DunningHistoryRequest dunningHistoryRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.UnbillFreeEntitleResponse
     */
    @WebMethod(action = "urn:getUnbillFreeEntitleInfo")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getUnbillFreeEntitleInfo", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbillFreeEntitleInfo")
    @ResponseWrapper(localName = "getUnbillFreeEntitleInfoResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetUnbillFreeEntitleInfoResponse")
    public UnbillFreeEntitleResponse getUnbillFreeEntitleInfo(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        UnbillFreeEntitleRequest req);

    /**
     * 
     * @param acctTotalOSBalRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctTotalOSBalResponse
     */
    @WebMethod(action = "urn:getAcctTotalOSBal")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctTotalOSBal", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctTotalOSBal")
    @ResponseWrapper(localName = "getAcctTotalOSBalResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctTotalOSBalResponse")
    public AcctTotalOSBalResponse getAcctTotalOSBal(
        @WebParam(name = "acctTotalOSBalRequest", targetNamespace = "http://services.mrb.mob.bom")
        AcctTotalOSBalRequest acctTotalOSBalRequest);

    /**
     * 
     * @param paymentHistoryRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.PaymentHistoryResponse
     */
    @WebMethod(action = "urn:getPaymentHistory")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getPaymentHistory", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetPaymentHistory")
    @ResponseWrapper(localName = "getPaymentHistoryResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetPaymentHistoryResponse")
    public PaymentHistoryResponse getPaymentHistory(
        @WebParam(name = "paymentHistoryRequest", targetNamespace = "http://services.mrb.mob.bom")
        PaymentHistoryRequest paymentHistoryRequest);

    /**
     * 
     * @param req
     * @return
     *     returns com.jaishna.soapwrapper.gen.ValidateAcctForHoldDunResponse
     */
    @WebMethod(action = "urn:validateAcctForHoldDunning")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "validateAcctForHoldDunning", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ValidateAcctForHoldDunning")
    @ResponseWrapper(localName = "validateAcctForHoldDunningResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.ValidateAcctForHoldDunningResponse")
    public ValidateAcctForHoldDunResponse validateAcctForHoldDunning(
        @WebParam(name = "req", targetNamespace = "http://services.mrb.mob.bom")
        ValidateAcctForHoldDunRequest req);

    /**
     * 
     * @param paymentRejHistoryRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.PaymentRejHistoryResponse
     */
    @WebMethod(action = "urn:getPaymentRejHistory")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getPaymentRejHistory", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetPaymentRejHistory")
    @ResponseWrapper(localName = "getPaymentRejHistoryResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetPaymentRejHistoryResponse")
    public PaymentRejHistoryResponse getPaymentRejHistory(
        @WebParam(name = "paymentRejHistoryRequest", targetNamespace = "http://services.mrb.mob.bom")
        PaymentRejHistoryRequest paymentRejHistoryRequest);

    /**
     * 
     * @param acctInfoRequest
     * @return
     *     returns com.jaishna.soapwrapper.gen.AcctInfoResponse
     */
    @WebMethod(action = "urn:getAcctInfo")
    @WebResult(targetNamespace = "http://services.mrb.mob.bom")
    @RequestWrapper(localName = "getAcctInfo", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctInfo")
    @ResponseWrapper(localName = "getAcctInfoResponse", targetNamespace = "http://services.mrb.mob.bom", className = "com.jaishna.soapwrapper.gen.GetAcctInfoResponse")
    public AcctInfoResponse getAcctInfo(
        @WebParam(name = "acctInfoRequest", targetNamespace = "http://services.mrb.mob.bom")
        AcctInfoRequest acctInfoRequest);

}
