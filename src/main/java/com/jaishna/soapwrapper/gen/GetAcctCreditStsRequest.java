
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAcctCreditStsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAcctCreditStsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operInfo" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbOperInfoDTO" minOccurs="0"/&gt;
 *         &lt;element name="subDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbSubDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAcctCreditStsRequest", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "operInfo",
    "subDTO"
})
public class GetAcctCreditStsRequest {

    @XmlElementRef(name = "operInfo", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbOperInfoDTO> operInfo;
    @XmlElementRef(name = "subDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbSubDTO> subDTO;

    /**
     * Gets the value of the operInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbOperInfoDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbOperInfoDTO> getOperInfo() {
        return operInfo;
    }

    /**
     * Sets the value of the operInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbOperInfoDTO }{@code >}
     *     
     */
    public void setOperInfo(JAXBElement<MrbEsbOperInfoDTO> value) {
        this.operInfo = value;
    }

    /**
     * Gets the value of the subDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbSubDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbSubDTO> getSubDTO() {
        return subDTO;
    }

    /**
     * Sets the value of the subDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbSubDTO }{@code >}
     *     
     */
    public void setSubDTO(JAXBElement<MrbEsbSubDTO> value) {
        this.subDTO = value;
    }

}
