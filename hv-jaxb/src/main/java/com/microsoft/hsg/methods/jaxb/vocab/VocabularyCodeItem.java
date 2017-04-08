//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//


package com.microsoft.hsg.methods.jaxb.vocab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.vocab" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Describes an indivdual code item.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.vocab" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A code item is a unit member of a vocabulary.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for VocabularyCodeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VocabularyCodeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="display-text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abbreviation-text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info-xml" type="{urn:com.microsoft.wc.vocab}InfoXml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VocabularyCodeItem", propOrder = {
    "codeValue",
    "displayText",
    "abbreviationText",
    "infoXml"
})
public class VocabularyCodeItem {

    @XmlElement(name = "code-value", required = true)
    protected String codeValue;
    @XmlElement(name = "display-text")
    protected String displayText;
    @XmlElement(name = "abbreviation-text")
    protected String abbreviationText;
    @XmlElement(name = "info-xml")
    protected InfoXml infoXml;

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the abbreviationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviationText() {
        return abbreviationText;
    }

    /**
     * Sets the value of the abbreviationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviationText(String value) {
        this.abbreviationText = value;
    }

    /**
     * Gets the value of the infoXml property.
     * 
     * @return
     *     possible object is
     *     {@link InfoXml }
     *     
     */
    public InfoXml getInfoXml() {
        return infoXml;
    }

    /**
     * Sets the value of the infoXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoXml }
     *     
     */
    public void setInfoXml(InfoXml value) {
        this.infoXml = value;
    }

}
