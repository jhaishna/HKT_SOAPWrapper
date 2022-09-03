
package com.jaishna.soapwrapper.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitBillReprintRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitBillReprintRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="csAutoBillReprintReqDTO" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbCSAutoBillReprintReqDTO" minOccurs="0"/&gt;
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
@XmlType(name = "SubmitBillReprintRequest", namespace = "http://schema.mrb.mob.bom/xsd", propOrder = {
    "csAutoBillReprintReqDTO",
    "operInfo"
})
public class SubmitBillReprintRequest {

    @XmlElementRef(name = "csAutoBillReprintReqDTO", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbCSAutoBillReprintReqDTO> csAutoBillReprintReqDTO;
    @XmlElementRef(name = "operInfo", namespace = "http://schema.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MrbEsbOperInfoDTO> operInfo;

    /**
     * Gets the value of the csAutoBillReprintReqDTO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbCSAutoBillReprintReqDTO }{@code >}
     *     
     */
    public JAXBElement<MrbEsbCSAutoBillReprintReqDTO> getCsAutoBillReprintReqDTO() {
        return csAutoBillReprintReqDTO;
    }

    /**
     * Sets the value of the csAutoBillReprintReqDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MrbEsbCSAutoBillReprintReqDTO }{@code >}
     *     
     */
    public void setCsAutoBillReprintReqDTO(JAXBElement<MrbEsbCSAutoBillReprintReqDTO> value) {
        this.csAutoBillReprintReqDTO = value;
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
