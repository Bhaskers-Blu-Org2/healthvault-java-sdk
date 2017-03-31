//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:38:29 AM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.application;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:app="urn:com.microsoft.wc.thing.application" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines a thing type to store arbitrary application 
 *                         data.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:app="urn:com.microsoft.wc.thing.application" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Applications are responsible for using the format-appid
 *                         and format-tag to guarantee uniques of the data format.
 *                     &lt;/remarks&gt;
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
 *         &lt;element name="format-appid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format-tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
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
    "formatAppid",
    "formatTag",
    "when",
    "summary",
    "any"
})
@XmlRootElement(name = "app-specific")
public class AppSpecific {

    @XmlElement(name = "format-appid", required = true)
    protected String formatAppid;
    @XmlElement(name = "format-tag", required = true)
    protected String formatTag;
    protected DateTime when;
    @XmlElement(required = true)
    protected String summary;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the formatAppid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatAppid() {
        return formatAppid;
    }

    /**
     * Sets the value of the formatAppid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatAppid(String value) {
        this.formatAppid = value;
    }

    /**
     * Gets the value of the formatTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatTag() {
        return formatTag;
    }

    /**
     * Sets the value of the formatTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatTag(String value) {
        this.formatTag = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
