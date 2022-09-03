
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbUnbilledDailyRoamWifiDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbUnbilledDailyRoamWifiDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="freeEntitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inScopeUsedUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbUnbilledDailyRoamWifiDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "callType",
    "freeEntitle",
    "inScopeUsedUsage",
    "lastUpdDate",
    "serviceType",
    "startDate",
    "unit",
    "usedUsage"
})
public class MrbEsbUnbilledDailyRoamWifiDTO {

    @XmlElementRef(name = "callType", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callType;
    @XmlElementRef(name = "freeEntitle", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeEntitle;
    @XmlElementRef(name = "inScopeUsedUsage", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inScopeUsedUsage;
    @XmlElementRef(name = "lastUpdDate", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdDate;
    @XmlElementRef(name = "serviceType", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceType;
    @XmlElementRef(name = "startDate", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "unit", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unit;
    @XmlElementRef(name = "usedUsage", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usedUsage;

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallType(JAXBElement<String> value) {
        this.callType = value;
    }

    /**
     * Gets the value of the freeEntitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeEntitle() {
        return freeEntitle;
    }

    /**
     * Sets the value of the freeEntitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeEntitle(JAXBElement<String> value) {
        this.freeEntitle = value;
    }

    /**
     * Gets the value of the inScopeUsedUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInScopeUsedUsage() {
        return inScopeUsedUsage;
    }

    /**
     * Sets the value of the inScopeUsedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInScopeUsedUsage(JAXBElement<String> value) {
        this.inScopeUsedUsage = value;
    }

    /**
     * Gets the value of the lastUpdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * Sets the value of the lastUpdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdDate(JAXBElement<String> value) {
        this.lastUpdDate = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<String> value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnit(JAXBElement<String> value) {
        this.unit = value;
    }

    /**
     * Gets the value of the usedUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsedUsage() {
        return usedUsage;
    }

    /**
     * Sets the value of the usedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsedUsage(JAXBElement<String> value) {
        this.usedUsage = value;
    }

}
