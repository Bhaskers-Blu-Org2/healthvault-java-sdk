//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:39:21 AM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.cholesterolprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.dates.Date;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.cholesterol-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Cholesterol test results. Also referred to as lipid profile. 
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.cholesterol-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Cholesterol profile is typically comprised of LDL (low-density 
 *                         lipoprotein) cholesterol, HDL (high density lipoprotein) cholesterol and total cholesterol.
 *                         This data type also in corporates currently-requested secondary tests
 *                         that may be applicable for cholesterol.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date"/>
 *         &lt;element name="ldl" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="hdl" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="total-cholesterol" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
 *         &lt;element name="triglyceride" type="{urn:com.microsoft.wc.thing.types}positiveInt" minOccurs="0"/>
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
    "when",
    "ldl",
    "hdl",
    "totalCholesterol",
    "triglyceride"
})
@XmlRootElement(name = "cholesterol-profile")
public class CholesterolProfile {

    @XmlElement(required = true)
    protected Date when;
    protected Integer ldl;
    protected Integer hdl;
    @XmlElement(name = "total-cholesterol")
    protected Integer totalCholesterol;
    protected Integer triglyceride;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setWhen(Date value) {
        this.when = value;
    }

    /**
     * Gets the value of the ldl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLdl() {
        return ldl;
    }

    /**
     * Sets the value of the ldl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLdl(Integer value) {
        this.ldl = value;
    }

    /**
     * Gets the value of the hdl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHdl() {
        return hdl;
    }

    /**
     * Sets the value of the hdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHdl(Integer value) {
        this.hdl = value;
    }

    /**
     * Gets the value of the totalCholesterol property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCholesterol() {
        return totalCholesterol;
    }

    /**
     * Sets the value of the totalCholesterol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCholesterol(Integer value) {
        this.totalCholesterol = value;
    }

    /**
     * Gets the value of the triglyceride property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTriglyceride() {
        return triglyceride;
    }

    /**
     * Sets the value of the triglyceride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTriglyceride(Integer value) {
        this.triglyceride = value;
    }

}
