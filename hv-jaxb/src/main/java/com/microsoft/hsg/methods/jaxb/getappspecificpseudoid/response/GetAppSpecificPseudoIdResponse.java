//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.14 at 09:59:35 PM PDT 
//


package com.microsoft.hsg.methods.jaxb.getappspecificpseudoid.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetAppSpecificPseudoId" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetAppSpecificPseudoId" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pseudo-record-id" type="{urn:com.microsoft.wc.methods.response.GetAppSpecificPseudoId}ConvertedPseudoRecordId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pseudoRecordId"
})
@XmlRootElement(name = "info")
public class GetAppSpecificPseudoIdResponse {

    @XmlElement(name = "pseudo-record-id")
    protected List<ConvertedPseudoRecordId> pseudoRecordId;

    /**
     * Gets the value of the pseudoRecordId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pseudoRecordId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPseudoRecordId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvertedPseudoRecordId }
     * 
     * 
     */
    public List<ConvertedPseudoRecordId> getPseudoRecordId() {
        if (pseudoRecordId == null) {
            pseudoRecordId = new ArrayList<ConvertedPseudoRecordId>();
        }
        return this.pseudoRecordId;
    }

}
