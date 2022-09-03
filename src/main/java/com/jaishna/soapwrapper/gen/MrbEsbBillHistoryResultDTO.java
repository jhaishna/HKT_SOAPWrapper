
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
 * <p>Java class for MrbEsbBillHistoryResultDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MrbEsbBillHistoryResultDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divertLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="divertRmnCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listBillHistory" type="{http://esbSi.object.mrb.mob.bom/xsd}MrbEsbBillHistoryDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MrbEsbBillHistoryResultDTO", namespace = "http://esbSi.object.mrb.mob.bom/xsd", propOrder = {
    "acctNum",
    "divertLoc",
    "divertRmnCycle",
    "listBillHistory",
    "result"
})
public class MrbEsbBillHistoryResultDTO {

    @XmlElementRef(name = "acctNum", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acctNum;
    @XmlElementRef(name = "divertLoc", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> divertLoc;
    @XmlElementRef(name = "divertRmnCycle", namespace = "http://esbSi.object.mrb.mob.bom/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> divertRmnCycle;
    @XmlElement(nillable = true)
    protected List<MrbEsbBillHistoryDTO> listBillHistory;
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
     * Gets the value of the divertLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivertLoc() {
        return divertLoc;
    }

    /**
     * Sets the value of the divertLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivertLoc(JAXBElement<String> value) {
        this.divertLoc = value;
    }

    /**
     * Gets the value of the divertRmnCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivertRmnCycle() {
        return divertRmnCycle;
    }

    /**
     * Sets the value of the divertRmnCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivertRmnCycle(JAXBElement<String> value) {
        this.divertRmnCycle = value;
    }

    /**
     * Gets the value of the listBillHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listBillHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListBillHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MrbEsbBillHistoryDTO }
     * 
     * 
     */
    public List<MrbEsbBillHistoryDTO> getListBillHistory() {
        if (listBillHistory == null) {
            listBillHistory = new ArrayList<MrbEsbBillHistoryDTO>();
        }
        return this.listBillHistory;
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
