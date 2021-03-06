//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.03 at 05:13:06 PM GMT 
//


package org.opengroup.archimate31;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 document attribute holds all the concern information.
 *             
 * 
 * <p>Java class for ConcernType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcernType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}LabelGroup" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}DocumentationGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stakeholders" type="{http://www.opengroup.org/xsd/archimate/3.0/}StakeholdersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcernType", propOrder = {
    "labelGroup",
    "documentationGroup",
    "stakeholders"
})
public class ConcernType {

    @XmlElement(name = "label", required = true)
    protected List<LangStringType> labelGroup;
    @XmlElement(name = "documentation")
    protected List<PreservedLangStringType> documentationGroup;
    protected StakeholdersType stakeholders;

    /**
     * Gets the value of the labelGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the labelGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangStringType }
     * 
     * 
     */
    public List<LangStringType> getLabelGroup() {
        if (labelGroup == null) {
            labelGroup = new ArrayList<LangStringType>();
        }
        return this.labelGroup;
    }

    /**
     * Gets the value of the documentationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreservedLangStringType }
     * 
     * 
     */
    public List<PreservedLangStringType> getDocumentationGroup() {
        if (documentationGroup == null) {
            documentationGroup = new ArrayList<PreservedLangStringType>();
        }
        return this.documentationGroup;
    }

    /**
     * Gets the value of the stakeholders property.
     * 
     * @return
     *     possible object is
     *     {@link StakeholdersType }
     *     
     */
    public StakeholdersType getStakeholders() {
        return stakeholders;
    }

    /**
     * Sets the value of the stakeholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link StakeholdersType }
     *     
     */
    public void setStakeholders(StakeholdersType value) {
        this.stakeholders = value;
    }

}
