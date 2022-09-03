
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
 * <p>Java class for UnbilledDailyRoamWifiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnbilledDailyRoamWifiResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listUnbilledDailyRoamWifi" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbUnbilledDailyRoamWifiDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbResultDTO" minOccurs="0"/&gt;
 *         &lt;element name="subId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnbilledDailyRoamWifiResult", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "iccid",
    "listUnbilledDailyRoamWifi",
    "msisdn",
    "result",
    "subId"
})
public class UnbilledDailyRoamWifiResult {

    @XmlElementRef(name = "iccid", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iccid;
    @XmlElement(nillable = true)
    protected List<MrbEsbUnbilledDailyRoamWifiDTO> listUnbilledDailyRoamWifi;
    @XmlElementRef(name = "msisdn", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdn;
    @XmlElementRef(name = "result", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbResultDTO> result;
    @XmlElementRef(name = "subId", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subId;

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIccid(JAXBElement<String> value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the listUnbilledDailyRoamWifi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUnbilledDailyRoamWifi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUnbilledDailyRoamWifi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MrbEsbUnbilledDailyRoamWifiDTO }
     * 
     * 
     */
    public List<MrbEsbUnbilledDailyRoamWifiDTO> getListUnbilledDailyRoamWifi() {
        if (listUnbilledDailyRoamWifi == null) {
            listUnbilledDailyRoamWifi = new ArrayList<MrbEsbUnbilledDailyRoamWifiDTO>();
        }
        return this.listUnbilledDailyRoamWifi;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsisdn(JAXBElement<String> value) {
        this.msisdn = value;
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
     * Gets the value of the subId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubId() {
        return subId;
    }

    /**
     * Sets the value of the subId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubId(JAXBElement<String> value) {
        this.subId = value;
    }

}
