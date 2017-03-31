//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 11:38:44 PM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.ccr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCRCodedDataObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRCodedDataObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCRDataObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateTime" type="{urn:astm-org:CCR}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IDs" type="{urn:astm-org:CCR}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Type" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:astm-org:CCR}Status" minOccurs="0"/>
 *         &lt;group ref="{urn:astm-org:CCR}SLRCGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRCodedDataObjectType", propOrder = {
    "ccrDataObjectID",
    "dateTime",
    "iDs",
    "type",
    "description",
    "status",
    "source",
    "internalCCRLink",
    "referenceID",
    "commentID",
    "signature"
})
@XmlSeeAlso({
    StructuredProductType.class,
    EncounterType.class,
    FamilyHistoryType.class,
    PlanType.class,
    TestType.class,
    ProblemType.class,
    EpisodeType.class,
    AuthorizationType.class,
    SocialHistoryType.class,
    InsuranceType.class,
    AlertType.class,
    OrderRxHistoryType.class,
    ResultType.class,
    FunctionType.class,
    InterventionType.class
})
public class CCRCodedDataObjectType {

    @XmlElement(name = "CCRDataObjectID", required = true)
    protected String ccrDataObjectID;
    @XmlElement(name = "DateTime")
    protected List<DateTimeType> dateTime;
    @XmlElement(name = "IDs")
    protected List<IDType> iDs;
    @XmlElement(name = "Type")
    protected CodedDescriptionType type;
    @XmlElement(name = "Description")
    protected CodedDescriptionType description;
    @XmlElement(name = "Status")
    protected CodedDescriptionType status;
    @XmlElement(name = "Source", required = true)
    protected List<SourceType> source;
    @XmlElement(name = "InternalCCRLink")
    protected List<InternalCCRLink> internalCCRLink;
    @XmlElement(name = "ReferenceID")
    protected List<String> referenceID;
    @XmlElement(name = "CommentID")
    protected List<String> commentID;
    @XmlElement(name = "Signature")
    protected List<CCRCodedDataObjectType.Signature> signature;

    /**
     * Gets the value of the ccrDataObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCRDataObjectID() {
        return ccrDataObjectID;
    }

    /**
     * Sets the value of the ccrDataObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCRDataObjectID(String value) {
        this.ccrDataObjectID = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeType }
     * 
     * 
     */
    public List<DateTimeType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<DateTimeType>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the iDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getIDs() {
        if (iDs == null) {
            iDs = new ArrayList<IDType>();
        }
        return this.iDs;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setType(CodedDescriptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setDescription(CodedDescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setStatus(CodedDescriptionType value) {
        this.status = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the internalCCRLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalCCRLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalCCRLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalCCRLink }
     * 
     * 
     */
    public List<InternalCCRLink> getInternalCCRLink() {
        if (internalCCRLink == null) {
            internalCCRLink = new ArrayList<InternalCCRLink>();
        }
        return this.internalCCRLink;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceID() {
        if (referenceID == null) {
            referenceID = new ArrayList<String>();
        }
        return this.referenceID;
    }

    /**
     * Gets the value of the commentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommentID() {
        if (commentID == null) {
            commentID = new ArrayList<String>();
        }
        return this.commentID;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCRCodedDataObjectType.Signature }
     * 
     * 
     */
    public List<CCRCodedDataObjectType.Signature> getSignature() {
        if (signature == null) {
            signature = new ArrayList<CCRCodedDataObjectType.Signature>();
        }
        return this.signature;
    }


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
     *         &lt;element name="SignatureID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "signatureID"
    })
    public static class Signature {

        @XmlElement(name = "SignatureID", required = true)
        protected String signatureID;

        /**
         * Gets the value of the signatureID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureID() {
            return signatureID;
        }

        /**
         * Sets the value of the signatureID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureID(String value) {
            this.signatureID = value;
        }

    }

}
