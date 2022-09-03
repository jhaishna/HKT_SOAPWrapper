
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbSingleCreditInfoResDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbSingleCreditInfoResDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bucketAmt0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bucketAmt1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bucketAmt2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bucketAmt3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dunningGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbResultDTO" minOccurs="0"/&gt;
 *         &lt;element name="totalOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unbillCreditAdj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unbillDebitAdj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbSingleCreditInfoResDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "acctNum",
    "acctStatus",
    "billDay",
    "bucketAmt0",
    "bucketAmt1",
    "bucketAmt2",
    "bucketAmt3",
    "creditStatus",
    "dunningGroup",
    "result",
    "totalOS",
    "unbillCreditAdj",
    "unbillDebitAdj"
})
public class MrbEsbSingleCreditInfoResDTO {

    @XmlElementRef(name = "acctNum", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acctNum;
    @XmlElementRef(name = "acctStatus", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acctStatus;
    @XmlElementRef(name = "billDay", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billDay;
    @XmlElementRef(name = "bucketAmt0", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bucketAmt0;
    @XmlElementRef(name = "bucketAmt1", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bucketAmt1;
    @XmlElementRef(name = "bucketAmt2", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bucketAmt2;
    @XmlElementRef(name = "bucketAmt3", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bucketAmt3;
    @XmlElementRef(name = "creditStatus", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditStatus;
    @XmlElementRef(name = "dunningGroup", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunningGroup;
    @XmlElementRef(name = "result", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbResultDTO> result;
    @XmlElementRef(name = "totalOS", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalOS;
    @XmlElementRef(name = "unbillCreditAdj", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unbillCreditAdj;
    @XmlElementRef(name = "unbillDebitAdj", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unbillDebitAdj;

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcctNum(JAXBElement<String> value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the acctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcctStatus() {
        return acctStatus;
    }

    /**
     * Sets the value of the acctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcctStatus(JAXBElement<String> value) {
        this.acctStatus = value;
    }

    /**
     * Gets the value of the billDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillDay() {
        return billDay;
    }

    /**
     * Sets the value of the billDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillDay(JAXBElement<String> value) {
        this.billDay = value;
    }

    /**
     * Gets the value of the bucketAmt0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBucketAmt0() {
        return bucketAmt0;
    }

    /**
     * Sets the value of the bucketAmt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBucketAmt0(JAXBElement<String> value) {
        this.bucketAmt0 = value;
    }

    /**
     * Gets the value of the bucketAmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBucketAmt1() {
        return bucketAmt1;
    }

    /**
     * Sets the value of the bucketAmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBucketAmt1(JAXBElement<String> value) {
        this.bucketAmt1 = value;
    }

    /**
     * Gets the value of the bucketAmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBucketAmt2() {
        return bucketAmt2;
    }

    /**
     * Sets the value of the bucketAmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBucketAmt2(JAXBElement<String> value) {
        this.bucketAmt2 = value;
    }

    /**
     * Gets the value of the bucketAmt3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBucketAmt3() {
        return bucketAmt3;
    }

    /**
     * Sets the value of the bucketAmt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBucketAmt3(JAXBElement<String> value) {
        this.bucketAmt3 = value;
    }

    /**
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditStatus(JAXBElement<String> value) {
        this.creditStatus = value;
    }

    /**
     * Gets the value of the dunningGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDunningGroup() {
        return dunningGroup;
    }

    /**
     * Sets the value of the dunningGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDunningGroup(JAXBElement<String> value) {
        this.dunningGroup = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbResultDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbResultDTO> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbResultDTO }{@code >}
     *     
     */
    public void setResult(JAXBElement<MrbEsbResultDTO> value) {
        this.result = value;
    }

    /**
     * Gets the value of the totalOS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalOS() {
        return totalOS;
    }

    /**
     * Sets the value of the totalOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalOS(JAXBElement<String> value) {
        this.totalOS = value;
    }

    /**
     * Gets the value of the unbillCreditAdj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnbillCreditAdj() {
        return unbillCreditAdj;
    }

    /**
     * Sets the value of the unbillCreditAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnbillCreditAdj(JAXBElement<String> value) {
        this.unbillCreditAdj = value;
    }

    /**
     * Gets the value of the unbillDebitAdj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnbillDebitAdj() {
        return unbillDebitAdj;
    }

    /**
     * Sets the value of the unbillDebitAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnbillDebitAdj(JAXBElement<String> value) {
        this.unbillDebitAdj = value;
    }

}
