//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:22:05 PM PDT 
//


package com.microsoft.hsg.thing.oxm.jaxb.medicalimagestudy2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;
import com.microsoft.hsg.thing.oxm.jaxb.base.Person;
import com.microsoft.hsg.thing.oxm.jaxb.dates.DateTime;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="patient-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="series" type="{urn:com.microsoft.wc.thing.medical-images}medical-image-study-series" maxOccurs="unbounded"/>
 *         &lt;element name="reason" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="preview-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="key-images" type="{urn:com.microsoft.wc.thing.medical-images}medical-image-study-series-image" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="study-instance-uid" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="referring-physician" type="{urn:com.microsoft.wc.thing.types}person" minOccurs="0"/>
 *         &lt;element name="accession-number" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
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
    "patientName",
    "description",
    "series",
    "reason",
    "previewBlobName",
    "keyImages",
    "studyInstanceUid",
    "referringPhysician",
    "accessionNumber"
})
@XmlRootElement(name = "medical-image-study")
public class MedicalImageStudy {

    @XmlElement(required = true)
    protected DateTime when;
    @XmlElement(name = "patient-name")
    protected String patientName;
    protected String description;
    @XmlElement(required = true)
    protected List<MedicalImageStudySeries> series;
    protected CodableValue reason;
    @XmlElement(name = "preview-blob-name")
    protected String previewBlobName;
    @XmlElement(name = "key-images")
    protected List<MedicalImageStudySeriesImage> keyImages;
    @XmlElement(name = "study-instance-uid")
    protected String studyInstanceUid;
    @XmlElement(name = "referring-physician")
    protected Person referringPhysician;
    @XmlElement(name = "accession-number")
    protected String accessionNumber;

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
     * Gets the value of the patientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * Sets the value of the patientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientName(String value) {
        this.patientName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalImageStudySeries }
     * 
     * 
     */
    public List<MedicalImageStudySeries> getSeries() {
        if (series == null) {
            series = new ArrayList<MedicalImageStudySeries>();
        }
        return this.series;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setReason(CodableValue value) {
        this.reason = value;
    }

    /**
     * Gets the value of the previewBlobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewBlobName() {
        return previewBlobName;
    }

    /**
     * Sets the value of the previewBlobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewBlobName(String value) {
        this.previewBlobName = value;
    }

    /**
     * Gets the value of the keyImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalImageStudySeriesImage }
     * 
     * 
     */
    public List<MedicalImageStudySeriesImage> getKeyImages() {
        if (keyImages == null) {
            keyImages = new ArrayList<MedicalImageStudySeriesImage>();
        }
        return this.keyImages;
    }

    /**
     * Gets the value of the studyInstanceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyInstanceUid() {
        return studyInstanceUid;
    }

    /**
     * Sets the value of the studyInstanceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyInstanceUid(String value) {
        this.studyInstanceUid = value;
    }

    /**
     * Gets the value of the referringPhysician property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getReferringPhysician() {
        return referringPhysician;
    }

    /**
     * Sets the value of the referringPhysician property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setReferringPhysician(Person value) {
        this.referringPhysician = value;
    }

    /**
     * Gets the value of the accessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Sets the value of the accessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

}
