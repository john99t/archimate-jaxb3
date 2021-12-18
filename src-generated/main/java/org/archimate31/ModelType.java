//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.18 at 10:03:29 PM GMT 
//


package org.archimate31;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengroup.org/xsd/archimate/3.0/}ModelType"&gt;
 *       &lt;redefine&gt;
 *         &lt;complexType name="ModelType"&gt;
 *           &lt;complexContent&gt;
 *             &lt;extension base="{http://www.opengroup.org/xsd/archimate/3.0/}NamedReferenceableType"&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://www.opengroup.org/xsd/archimate/3.0/}PropertiesGroup"/&gt;
 *                 &lt;element name="metadata" type="{http://www.opengroup.org/xsd/archimate/3.0/}MetadataType" minOccurs="0"/&gt;
 *                 &lt;element name="elements" type="{http://www.opengroup.org/xsd/archimate/3.0/}ElementsType" minOccurs="0"/&gt;
 *                 &lt;element name="relationships" type="{http://www.opengroup.org/xsd/archimate/3.0/}RelationshipsType" minOccurs="0"/&gt;
 *                 &lt;element name="organizations" type="{http://www.opengroup.org/xsd/archimate/3.0/}OrganizationsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element name="propertyDefinitions" type="{http://www.opengroup.org/xsd/archimate/3.0/}PropertyDefinitionsType" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;anyAttribute namespace='##other'/&gt;
 *             &lt;/extension&gt;
 *           &lt;/complexContent&gt;
 *         &lt;/complexType&gt;
 *       &lt;/redefine&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="views" type="{http://www.opengroup.org/xsd/archimate/3.0/}ViewsType" minOccurs="0"/&gt;
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
@XmlType(name = "ModelType", propOrder = {
    "views"
})
public class ModelType
    extends OriginalModelType
{

    protected ViewsType views;

    /**
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link ViewsType }
     *     
     */
    public ViewsType getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewsType }
     *     
     */
    public void setViews(ViewsType value) {
        this.views = value;
    }

}