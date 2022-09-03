
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbPaymentRejHistoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbPaymentRejHistoryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtRejDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtRejReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pymtSts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbPaymentRejHistoryDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "ccToken",
    "pymtAmt",
    "pymtChannel",
    "pymtDate",
    "pymtRejDate",
    "pymtRejReason",
    "pymtSts"
})
public class MrbEsbPaymentRejHistoryDTO {

    @XmlElementRef(name = "ccToken", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccToken;
    @XmlElementRef(name = "pymtAmt", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtAmt;
    @XmlElementRef(name = "pymtChannel", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtChannel;
    @XmlElementRef(name = "pymtDate", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtDate;
    @XmlElementRef(name = "pymtRejDate", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtRejDate;
    @XmlElementRef(name = "pymtRejReason", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtRejReason;
    @XmlElementRef(name = "pymtSts", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pymtSts;

    /**
     * Gets the value of the ccToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCcToken() {
        return ccToken;
    }

    /**
     * Sets the value of the ccToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCcToken(JAXBElement<String> value) {
        this.ccToken = value;
    }

    /**
     * Gets the value of the pymtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtAmt() {
        return pymtAmt;
    }

    /**
     * Sets the value of the pymtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtAmt(JAXBElement<String> value) {
        this.pymtAmt = value;
    }

    /**
     * Gets the value of the pymtChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtChannel() {
        return pymtChannel;
    }

    /**
     * Sets the value of the pymtChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtChannel(JAXBElement<String> value) {
        this.pymtChannel = value;
    }

    /**
     * Gets the value of the pymtDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtDate() {
        return pymtDate;
    }

    /**
     * Sets the value of the pymtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtDate(JAXBElement<String> value) {
        this.pymtDate = value;
    }

    /**
     * Gets the value of the pymtRejDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtRejDate() {
        return pymtRejDate;
    }

    /**
     * Sets the value of the pymtRejDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtRejDate(JAXBElement<String> value) {
        this.pymtRejDate = value;
    }

    /**
     * Gets the value of the pymtRejReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtRejReason() {
        return pymtRejReason;
    }

    /**
     * Sets the value of the pymtRejReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtRejReason(JAXBElement<String> value) {
        this.pymtRejReason = value;
    }

    /**
     * Gets the value of the pymtSts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPymtSts() {
        return pymtSts;
    }

    /**
     * Sets the value of the pymtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPymtSts(JAXBElement<String> value) {
        this.pymtSts = value;
    }

}
