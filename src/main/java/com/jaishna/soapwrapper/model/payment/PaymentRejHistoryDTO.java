package com.jaishna.soapwrapper.model.payment;

public class PaymentRejHistoryDTO {

    private String ccToken;
    private String paymentAmount;
    private String paymentChannel;
    private String paymentDate;
    private String paymentRejDate;
    private String paymentRejReason;
    private String paymentStatus;

    public String getCcToken() {
        return ccToken;
    }

    public void setCcToken(String ccToken) {
        this.ccToken = ccToken;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentRejDate() {
        return paymentRejDate;
    }

    public void setPaymentRejDate(String paymentRejDate) {
        this.paymentRejDate = paymentRejDate;
    }

    public String getPaymentRejReason() {
        return paymentRejReason;
    }

    public void setPaymentRejReason(String paymentRejReason) {
        this.paymentRejReason = paymentRejReason;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}


