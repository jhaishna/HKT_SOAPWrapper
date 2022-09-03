
package com.jaishna.soapwrapper.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbPaymentRejHistoryResultDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbPaymentRejHistoryResultDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autopayRejCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ccRejCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listPaymentRejHistory" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbPaymentRejHistoryDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbResultDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbPaymentRejHistoryResultDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "acctNum",
    "autopayRejCnt",
    "ccRejCnt",
    "listPaymentRejHistory",
    "result"
})
public class MrbEsbPaymentRejHistoryResultDTO {

    @XmlElementRef(name = "acctNum", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acctNum;
    @XmlElementRef(name = "autopayRejCnt", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autopayRejCnt;
    @XmlElementRef(name = "ccRejCnt", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccRejCnt;
    @XmlElement(nillable = true)
    protected List<MrbEsbPaymentRejHistoryDTO> listPaymentRejHistory;
    @XmlElementRef(name = "result", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbResultDTO> result;

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
     * Gets the value of the autopayRejCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutopayRejCnt() {
        return autopayRejCnt;
    }

    /**
     * Sets the value of the autopayRejCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutopayRejCnt(JAXBElement<String> value) {
        this.autopayRejCnt = value;
    }

    /**
     * Gets the value of the ccRejCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcRejCnt() {
        return ccRejCnt;
    }

    /**
     * Sets the value of the ccRejCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcRejCnt(JAXBElement<String> value) {
        this.ccRejCnt = value;
    }

    /**
     * Gets the value of the listPaymentRejHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPaymentRejHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPaymentRejHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MrbEsbPaymentRejHistoryDTO }
     * 
     * 
     */
    public List<MrbEsbPaymentRejHistoryDTO> getListPaymentRejHistory() {
        if (listPaymentRejHistory == null) {
            listPaymentRejHistory = new ArrayList<MrbEsbPaymentRejHistoryDTO>();
        }
        return this.listPaymentRejHistory;
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

}
