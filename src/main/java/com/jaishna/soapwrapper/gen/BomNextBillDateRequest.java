
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BomNextBillDateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomNextBillDateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbQryAcctDTO" minOccurs="0"/&gt;
 *         &lt;element name="operInfo" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbOperInfoDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BomNextBillDateRequest", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "acctDTO",
    "operInfo"
})
public class BomNextBillDateRequest {

    @XmlElementRef(name = "acctDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbQryAcctDTO> acctDTO;
    @XmlElementRef(name = "operInfo", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbOperInfoDTO> operInfo;

    /**
     * Gets the value of the acctDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbQryAcctDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbQryAcctDTO> getAcctDTO() {
        return acctDTO;
    }

    /**
     * Sets the value of the acctDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbQryAcctDTO }{@code >}
     *     
     */
    public void setAcctDTO(JAXBElement<MrbEsbQryAcctDTO> value) {
        this.acctDTO = value;
    }

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

}