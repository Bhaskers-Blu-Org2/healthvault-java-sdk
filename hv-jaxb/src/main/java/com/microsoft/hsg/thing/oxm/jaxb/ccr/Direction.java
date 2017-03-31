//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 11:38:44 PM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.ccr;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:astm-org:CCR}Description" minOccurs="0"/>
 *         &lt;element name="DoseIndicator" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *         &lt;element name="Dose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:astm-org:CCR}MeasureType">
 *                 &lt;sequence>
 *                   &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DoseSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="VariableDoseModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DoseCalculation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:astm-org:CCR}DoseCalculationType">
 *                 &lt;sequence>
 *                   &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CalculationSequencePosition" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariableCalculationModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" type="{urn:astm-org:CCR}VehicleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Route" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:astm-org:CCR}CodedDescriptionType">
 *                 &lt;sequence>
 *                   &lt;element name="RouteSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="MultipleRouteModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Site" type="{urn:astm-org:CCR}SiteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdministrationTiming" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:astm-org:CCR}DateTimeType">
 *                 &lt;sequence>
 *                   &lt;element name="TimingSequencePosition" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariableTimingModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Frequency" type="{urn:astm-org:CCR}FrequencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Interval" type="{urn:astm-org:CCR}IntervalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Duration" type="{urn:astm-org:CCR}DurationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DoseRestriction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:astm-org:CCR}DoseCalculationType">
 *                 &lt;sequence>
 *                   &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RestrictionSequencePosition" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariableRestrictionModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indication" type="{urn:astm-org:CCR}IndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopIndicator" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
 *         &lt;element name="DirectionSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MultipleDirectionModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
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
    "description",
    "doseIndicator",
    "deliveryMethod",
    "dose",
    "doseCalculation",
    "vehicle",
    "route",
    "site",
    "administrationTiming",
    "frequency",
    "interval",
    "duration",
    "doseRestriction",
    "indication",
    "stopIndicator",
    "directionSequencePosition",
    "multipleDirectionModifier"
})
@XmlRootElement(name = "Direction")
public class Direction {

    @XmlElement(name = "Description")
    protected CodedDescriptionType description;
    @XmlElement(name = "DoseIndicator")
    protected CodedDescriptionType doseIndicator;
    @XmlElement(name = "DeliveryMethod")
    protected CodedDescriptionType deliveryMethod;
    @XmlElement(name = "Dose")
    protected List<Direction.Dose> dose;
    @XmlElement(name = "DoseCalculation")
    protected List<Direction.DoseCalculation> doseCalculation;
    @XmlElement(name = "Vehicle")
    protected List<VehicleType> vehicle;
    @XmlElement(name = "Route")
    protected List<Direction.Route> route;
    @XmlElement(name = "Site")
    protected List<SiteType> site;
    @XmlElement(name = "AdministrationTiming")
    protected List<Direction.AdministrationTiming> administrationTiming;
    @XmlElement(name = "Frequency")
    protected List<FrequencyType> frequency;
    @XmlElement(name = "Interval")
    protected List<IntervalType> interval;
    @XmlElement(name = "Duration")
    protected List<DurationType> duration;
    @XmlElement(name = "DoseRestriction")
    protected List<Direction.DoseRestriction> doseRestriction;
    @XmlElement(name = "Indication")
    protected List<IndicationType> indication;
    @XmlElement(name = "StopIndicator")
    protected CodedDescriptionType stopIndicator;
    @XmlElement(name = "DirectionSequencePosition")
    protected BigInteger directionSequencePosition;
    @XmlElement(name = "MultipleDirectionModifier")
    protected CodedDescriptionType multipleDirectionModifier;

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
     * Gets the value of the doseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getDoseIndicator() {
        return doseIndicator;
    }

    /**
     * Sets the value of the doseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setDoseIndicator(CodedDescriptionType value) {
        this.doseIndicator = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setDeliveryMethod(CodedDescriptionType value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the dose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction.Dose }
     * 
     * 
     */
    public List<Direction.Dose> getDose() {
        if (dose == null) {
            dose = new ArrayList<Direction.Dose>();
        }
        return this.dose;
    }

    /**
     * Gets the value of the doseCalculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doseCalculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoseCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction.DoseCalculation }
     * 
     * 
     */
    public List<Direction.DoseCalculation> getDoseCalculation() {
        if (doseCalculation == null) {
            doseCalculation = new ArrayList<Direction.DoseCalculation>();
        }
        return this.doseCalculation;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleType }
     * 
     * 
     */
    public List<VehicleType> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<VehicleType>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction.Route }
     * 
     * 
     */
    public List<Direction.Route> getRoute() {
        if (route == null) {
            route = new ArrayList<Direction.Route>();
        }
        return this.route;
    }

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteType }
     * 
     * 
     */
    public List<SiteType> getSite() {
        if (site == null) {
            site = new ArrayList<SiteType>();
        }
        return this.site;
    }

    /**
     * Gets the value of the administrationTiming property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrationTiming property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrationTiming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction.AdministrationTiming }
     * 
     * 
     */
    public List<Direction.AdministrationTiming> getAdministrationTiming() {
        if (administrationTiming == null) {
            administrationTiming = new ArrayList<Direction.AdministrationTiming>();
        }
        return this.administrationTiming;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyType }
     * 
     * 
     */
    public List<FrequencyType> getFrequency() {
        if (frequency == null) {
            frequency = new ArrayList<FrequencyType>();
        }
        return this.frequency;
    }

    /**
     * Gets the value of the interval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalType }
     * 
     * 
     */
    public List<IntervalType> getInterval() {
        if (interval == null) {
            interval = new ArrayList<IntervalType>();
        }
        return this.interval;
    }

    /**
     * Gets the value of the duration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DurationType }
     * 
     * 
     */
    public List<DurationType> getDuration() {
        if (duration == null) {
            duration = new ArrayList<DurationType>();
        }
        return this.duration;
    }

    /**
     * Gets the value of the doseRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doseRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoseRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direction.DoseRestriction }
     * 
     * 
     */
    public List<Direction.DoseRestriction> getDoseRestriction() {
        if (doseRestriction == null) {
            doseRestriction = new ArrayList<Direction.DoseRestriction>();
        }
        return this.doseRestriction;
    }

    /**
     * Gets the value of the indication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     * 
     * 
     */
    public List<IndicationType> getIndication() {
        if (indication == null) {
            indication = new ArrayList<IndicationType>();
        }
        return this.indication;
    }

    /**
     * Gets the value of the stopIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getStopIndicator() {
        return stopIndicator;
    }

    /**
     * Sets the value of the stopIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setStopIndicator(CodedDescriptionType value) {
        this.stopIndicator = value;
    }

    /**
     * Gets the value of the directionSequencePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectionSequencePosition() {
        return directionSequencePosition;
    }

    /**
     * Sets the value of the directionSequencePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectionSequencePosition(BigInteger value) {
        this.directionSequencePosition = value;
    }

    /**
     * Gets the value of the multipleDirectionModifier property.
     * 
     * @return
     *     possible object is
     *     {@link CodedDescriptionType }
     *     
     */
    public CodedDescriptionType getMultipleDirectionModifier() {
        return multipleDirectionModifier;
    }

    /**
     * Sets the value of the multipleDirectionModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedDescriptionType }
     *     
     */
    public void setMultipleDirectionModifier(CodedDescriptionType value) {
        this.multipleDirectionModifier = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:astm-org:CCR}DateTimeType">
     *       &lt;sequence>
     *         &lt;element name="TimingSequencePosition" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariableTimingModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timingSequencePosition",
        "variableTimingModifier"
    })
    public static class AdministrationTiming
        extends DateTimeType
    {

        @XmlElement(name = "TimingSequencePosition")
        protected BigInteger timingSequencePosition;
        @XmlElement(name = "VariableTimingModifier")
        protected CodedDescriptionType variableTimingModifier;

        /**
         * Gets the value of the timingSequencePosition property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTimingSequencePosition() {
            return timingSequencePosition;
        }

        /**
         * Sets the value of the timingSequencePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTimingSequencePosition(BigInteger value) {
            this.timingSequencePosition = value;
        }

        /**
         * Gets the value of the variableTimingModifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedDescriptionType }
         *     
         */
        public CodedDescriptionType getVariableTimingModifier() {
            return variableTimingModifier;
        }

        /**
         * Sets the value of the variableTimingModifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedDescriptionType }
         *     
         */
        public void setVariableTimingModifier(CodedDescriptionType value) {
            this.variableTimingModifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:astm-org:CCR}MeasureType">
     *       &lt;sequence>
     *         &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DoseSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="VariableDoseModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rate",
        "doseSequencePosition",
        "variableDoseModifier"
    })
    public static class Dose
        extends MeasureType
    {

        @XmlElement(name = "Rate")
        protected List<RateType> rate;
        @XmlElement(name = "DoseSequencePosition")
        protected BigInteger doseSequencePosition;
        @XmlElement(name = "VariableDoseModifier")
        protected CodedDescriptionType variableDoseModifier;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateType }
         * 
         * 
         */
        public List<RateType> getRate() {
            if (rate == null) {
                rate = new ArrayList<RateType>();
            }
            return this.rate;
        }

        /**
         * Gets the value of the doseSequencePosition property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDoseSequencePosition() {
            return doseSequencePosition;
        }

        /**
         * Sets the value of the doseSequencePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDoseSequencePosition(BigInteger value) {
            this.doseSequencePosition = value;
        }

        /**
         * Gets the value of the variableDoseModifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedDescriptionType }
         *     
         */
        public CodedDescriptionType getVariableDoseModifier() {
            return variableDoseModifier;
        }

        /**
         * Sets the value of the variableDoseModifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedDescriptionType }
         *     
         */
        public void setVariableDoseModifier(CodedDescriptionType value) {
            this.variableDoseModifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:astm-org:CCR}DoseCalculationType">
     *       &lt;sequence>
     *         &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CalculationSequencePosition" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariableCalculationModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rate",
        "calculationSequencePosition",
        "variableCalculationModifier"
    })
    public static class DoseCalculation
        extends DoseCalculationType
    {

        @XmlElement(name = "Rate")
        protected List<RateType> rate;
        @XmlElement(name = "CalculationSequencePosition")
        protected BigInteger calculationSequencePosition;
        @XmlElement(name = "VariableCalculationModifier")
        protected CodedDescriptionType variableCalculationModifier;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateType }
         * 
         * 
         */
        public List<RateType> getRate() {
            if (rate == null) {
                rate = new ArrayList<RateType>();
            }
            return this.rate;
        }

        /**
         * Gets the value of the calculationSequencePosition property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCalculationSequencePosition() {
            return calculationSequencePosition;
        }

        /**
         * Sets the value of the calculationSequencePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCalculationSequencePosition(BigInteger value) {
            this.calculationSequencePosition = value;
        }

        /**
         * Gets the value of the variableCalculationModifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedDescriptionType }
         *     
         */
        public CodedDescriptionType getVariableCalculationModifier() {
            return variableCalculationModifier;
        }

        /**
         * Sets the value of the variableCalculationModifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedDescriptionType }
         *     
         */
        public void setVariableCalculationModifier(CodedDescriptionType value) {
            this.variableCalculationModifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:astm-org:CCR}DoseCalculationType">
     *       &lt;sequence>
     *         &lt;element name="Rate" type="{urn:astm-org:CCR}RateType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RestrictionSequencePosition" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariableRestrictionModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rate",
        "restrictionSequencePosition",
        "variableRestrictionModifier"
    })
    public static class DoseRestriction
        extends DoseCalculationType
    {

        @XmlElement(name = "Rate")
        protected List<RateType> rate;
        @XmlElement(name = "RestrictionSequencePosition")
        protected BigInteger restrictionSequencePosition;
        @XmlElement(name = "VariableRestrictionModifier")
        protected CodedDescriptionType variableRestrictionModifier;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateType }
         * 
         * 
         */
        public List<RateType> getRate() {
            if (rate == null) {
                rate = new ArrayList<RateType>();
            }
            return this.rate;
        }

        /**
         * Gets the value of the restrictionSequencePosition property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRestrictionSequencePosition() {
            return restrictionSequencePosition;
        }

        /**
         * Sets the value of the restrictionSequencePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRestrictionSequencePosition(BigInteger value) {
            this.restrictionSequencePosition = value;
        }

        /**
         * Gets the value of the variableRestrictionModifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedDescriptionType }
         *     
         */
        public CodedDescriptionType getVariableRestrictionModifier() {
            return variableRestrictionModifier;
        }

        /**
         * Sets the value of the variableRestrictionModifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedDescriptionType }
         *     
         */
        public void setVariableRestrictionModifier(CodedDescriptionType value) {
            this.variableRestrictionModifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:astm-org:CCR}CodedDescriptionType">
     *       &lt;sequence>
     *         &lt;element name="RouteSequencePosition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="MultipleRouteModifier" type="{urn:astm-org:CCR}CodedDescriptionType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routeSequencePosition",
        "multipleRouteModifier"
    })
    public static class Route
        extends CodedDescriptionType
    {

        @XmlElement(name = "RouteSequencePosition")
        protected BigInteger routeSequencePosition;
        @XmlElement(name = "MultipleRouteModifier")
        protected CodedDescriptionType multipleRouteModifier;

        /**
         * Gets the value of the routeSequencePosition property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRouteSequencePosition() {
            return routeSequencePosition;
        }

        /**
         * Sets the value of the routeSequencePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRouteSequencePosition(BigInteger value) {
            this.routeSequencePosition = value;
        }

        /**
         * Gets the value of the multipleRouteModifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedDescriptionType }
         *     
         */
        public CodedDescriptionType getMultipleRouteModifier() {
            return multipleRouteModifier;
        }

        /**
         * Sets the value of the multipleRouteModifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedDescriptionType }
         *     
         */
        public void setMultipleRouteModifier(CodedDescriptionType value) {
            this.multipleRouteModifier = value;
        }

    }

}
