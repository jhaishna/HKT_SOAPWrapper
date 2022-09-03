
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MrbEsbOperInfoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbOperInfoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MrbEsbOperInfoDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "channel",
    "deptID",
    "lanID",
    "operID"
})
public class MrbEsbOperInfoDTO {

    @XmlElementRef(name = "channel", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channel;
    @XmlElementRef(name = "deptID", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deptID;
    @XmlElementRef(name = "lanID", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lanID;
    @XmlElementRef(name = "operID", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operID;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannel(JAXBElement<String> value) {
        this.channel = value;
    }

    /**
     * Gets the value of the deptID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeptID() {
        return deptID;
    }

    /**
     * Sets the value of the deptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeptID(JAXBElement<String> value) {
        this.deptID = value;
    }

    /**
     * Gets the value of the lanID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanID() {
        return lanID;
    }

    /**
     * Sets the value of the lanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanID(JAXBElement<String> value) {
        this.lanID = value;
    }

    /**
     * Gets the value of the operID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperID() {
        return operID;
    }

    /**
     * Sets the value of the operID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperID(JAXBElement<String> value) {
        this.operID = value;
    }

}
