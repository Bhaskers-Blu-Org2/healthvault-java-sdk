//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.07 at 01:38:03 AM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.aerobicprofile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A heart rate range.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A heart rate zone defines a range of heart rate measurements
 *                     in beats per minute (BPM). A heart rate zone can be used to
 *                     categorize the intensity of aerobic exercise or to guide
 *                     an aerobic session.
 *                     &lt;br/&gt;&lt;br/&gt;
 *                     A zone is defined by a lower and upper limit measured in
 *                     BPM or as a percentage of a person's maximum heart rate.&lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HeartrateZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeartrateZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lower-bound" type="{urn:com.microsoft.wc.thing.aerobic-profile}ZoneBoundary"/>
 *         &lt;element name="upper-bound" type="{urn:com.microsoft.wc.thing.aerobic-profile}ZoneBoundary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeartrateZone", propOrder = {
    "lowerBound",
    "upperBound"
})
public class HeartrateZone {

    @XmlElement(name = "lower-bound", required = true)
    protected ZoneBoundary lowerBound;
    @XmlElement(name = "upper-bound", required = true)
    protected ZoneBoundary upperBound;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneBoundary }
     *     
     */
    public ZoneBoundary getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneBoundary }
     *     
     */
    public void setLowerBound(ZoneBoundary value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneBoundary }
     *     
     */
    public ZoneBoundary getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneBoundary }
     *     
     */
    public void setUpperBound(ZoneBoundary value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
