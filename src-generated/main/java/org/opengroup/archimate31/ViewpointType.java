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
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewpointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewpointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengroup.org/xsd/archimate/3.0/}NamedReferenceableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}PropertiesGroup"/&gt;
 *         &lt;element name="concern" type="{http://www.opengroup.org/xsd/archimate/3.0/}ConcernType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="viewpointPurpose" type="{http://www.opengroup.org/xsd/archimate/3.0/}ViewpointPurposeType" minOccurs="0"/&gt;
 *         &lt;element name="viewpointContent" type="{http://www.opengroup.org/xsd/archimate/3.0/}ViewpointContentType" minOccurs="0"/&gt;
 *         &lt;element name="allowedElementType" type="{http://www.opengroup.org/xsd/archimate/3.0/}AllowedElementTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowedRelationshipType" type="{http://www.opengroup.org/xsd/archimate/3.0/}AllowedRelationshipTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="modelingNote" type="{http://www.opengroup.org/xsd/archimate/3.0/}ModelingNoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewpointType", propOrder = {
    "properties",
    "concern",
    "viewpointPurpose",
    "viewpointContent",
    "allowedElementType",
    "allowedRelationshipType",
    "modelingNote"
})
public class ViewpointType
    extends NamedReferenceableType
{

    protected PropertiesType properties;
    protected List<ConcernType> concern;
    @XmlList
    protected List<ViewpointPurposeEnum> viewpointPurpose;
    @XmlList
    protected List<ViewpointContentEnum> viewpointContent;
    protected List<AllowedElementTypeType> allowedElementType;
    protected List<AllowedRelationshipTypeType> allowedRelationshipType;
    protected List<ModelingNoteType> modelingNote;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the concern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the concern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConcernType }
     * 
     * 
     */
    public List<ConcernType> getConcern() {
        if (concern == null) {
            concern = new ArrayList<ConcernType>();
        }
        return this.concern;
    }

    /**
     * Gets the value of the viewpointPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the viewpointPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewpointPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewpointPurposeEnum }
     * 
     * 
     */
    public List<ViewpointPurposeEnum> getViewpointPurpose() {
        if (viewpointPurpose == null) {
            viewpointPurpose = new ArrayList<ViewpointPurposeEnum>();
        }
        return this.viewpointPurpose;
    }

    /**
     * Gets the value of the viewpointContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the viewpointContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewpointContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewpointContentEnum }
     * 
     * 
     */
    public List<ViewpointContentEnum> getViewpointContent() {
        if (viewpointContent == null) {
            viewpointContent = new ArrayList<ViewpointContentEnum>();
        }
        return this.viewpointContent;
    }

    /**
     * Gets the value of the allowedElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allowedElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedElementTypeType }
     * 
     * 
     */
    public List<AllowedElementTypeType> getAllowedElementType() {
        if (allowedElementType == null) {
            allowedElementType = new ArrayList<AllowedElementTypeType>();
        }
        return this.allowedElementType;
    }

    /**
     * Gets the value of the allowedRelationshipType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allowedRelationshipType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedRelationshipType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedRelationshipTypeType }
     * 
     * 
     */
    public List<AllowedRelationshipTypeType> getAllowedRelationshipType() {
        if (allowedRelationshipType == null) {
            allowedRelationshipType = new ArrayList<AllowedRelationshipTypeType>();
        }
        return this.allowedRelationshipType;
    }

    /**
     * Gets the value of the modelingNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the modelingNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelingNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelingNoteType }
     * 
     * 
     */
    public List<ModelingNoteType> getModelingNote() {
        if (modelingNote == null) {
            modelingNote = new ArrayList<ModelingNoteType>();
        }
        return this.modelingNote;
    }

}
