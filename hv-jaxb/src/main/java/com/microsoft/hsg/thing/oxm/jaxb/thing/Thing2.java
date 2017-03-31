//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" xmlns:this="urn:com.microsoft.wc.thing" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Thing2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Thing2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thing-id" type="{urn:com.microsoft.wc.thing}ThingKey" minOccurs="0"/>
 *         &lt;element name="type-id" type="{urn:com.microsoft.wc.thing}ThingType" minOccurs="0"/>
 *         &lt;element name="thing-state" type="{urn:com.microsoft.wc.thing}ThingState" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="eff-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="created" type="{urn:com.microsoft.wc.thing}Audit2" minOccurs="0"/>
 *         &lt;element name="updated" type="{urn:com.microsoft.wc.thing}Audit2" minOccurs="0"/>
 *         &lt;element name="data-xml" type="{urn:com.microsoft.wc.thing}DataXml" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="blob-payload" type="{urn:com.microsoft.wc.thing}BlobPayload" minOccurs="0"/>
 *         &lt;element name="eff-permissions" type="{urn:com.microsoft.wc.thing}EffectivePermissions" minOccurs="0"/>
 *         &lt;element name="tags" type="{urn:com.microsoft.wc.types}stringz512" minOccurs="0"/>
 *         &lt;element name="signature-info" type="{urn:com.microsoft.wc.thing}SignatureInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Thing2", propOrder = {
    "thingId",
    "typeId",
    "thingState",
    "flags",
    "effDate",
    "created",
    "updated",
    "dataXml",
    "blobPayload",
    "effPermissions",
    "tags",
    "signatureInfo"
})
public class Thing2 {

    @XmlElement(name = "thing-id")
    protected ThingKey thingId;
    @XmlElement(name = "type-id")
    protected ThingType typeId;
    @XmlElement(name = "thing-state")
    protected ThingState thingState;
    @XmlSchemaType(name = "unsignedInt")
    protected Long flags;
    @XmlElement(name = "eff-date")
    protected XMLGregorianCalendar effDate;
    protected Audit2 created;
    protected Audit2 updated;
    @XmlElement(name = "data-xml")
    protected List<DataXml> dataXml;
    @XmlElement(name = "blob-payload")
    protected BlobPayload blobPayload;
    @XmlElement(name = "eff-permissions")
    protected EffectivePermissions effPermissions;
    protected String tags;
    @XmlElement(name = "signature-info")
    protected SignatureInfo signatureInfo;

    /**
     * Gets the value of the thingId property.
     * 
     * @return
     *     possible object is
     *     {@link ThingKey }
     *     
     */
    public ThingKey getThingId() {
        return thingId;
    }

    /**
     * Sets the value of the thingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThingKey }
     *     
     */
    public void setThingId(ThingKey value) {
        this.thingId = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link ThingType }
     *     
     */
    public ThingType getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThingType }
     *     
     */
    public void setTypeId(ThingType value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the thingState property.
     * 
     * @return
     *     possible object is
     *     {@link ThingState }
     *     
     */
    public ThingState getThingState() {
        return thingState;
    }

    /**
     * Sets the value of the thingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThingState }
     *     
     */
    public void setThingState(ThingState value) {
        this.thingState = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlags(Long value) {
        this.flags = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link Audit2 }
     *     
     */
    public Audit2 getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit2 }
     *     
     */
    public void setCreated(Audit2 value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Audit2 }
     *     
     */
    public Audit2 getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit2 }
     *     
     */
    public void setUpdated(Audit2 value) {
        this.updated = value;
    }

    /**
     * Gets the value of the dataXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataXml }
     * 
     * 
     */
    public List<DataXml> getDataXml() {
        if (dataXml == null) {
            dataXml = new ArrayList<DataXml>();
        }
        return this.dataXml;
    }

    /**
     * Gets the value of the blobPayload property.
     * 
     * @return
     *     possible object is
     *     {@link BlobPayload }
     *     
     */
    public BlobPayload getBlobPayload() {
        return blobPayload;
    }

    /**
     * Sets the value of the blobPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobPayload }
     *     
     */
    public void setBlobPayload(BlobPayload value) {
        this.blobPayload = value;
    }

    /**
     * Gets the value of the effPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePermissions }
     *     
     */
    public EffectivePermissions getEffPermissions() {
        return effPermissions;
    }

    /**
     * Sets the value of the effPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePermissions }
     *     
     */
    public void setEffPermissions(EffectivePermissions value) {
        this.effPermissions = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Gets the value of the signatureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureInfo }
     *     
     */
    public SignatureInfo getSignatureInfo() {
        return signatureInfo;
    }

    /**
     * Sets the value of the signatureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureInfo }
     *     
     */
    public void setSignatureInfo(SignatureInfo value) {
        this.signatureInfo = value;
    }

}
