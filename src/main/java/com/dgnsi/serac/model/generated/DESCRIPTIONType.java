//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DESCRIPTIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DESCRIPTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MATIERE_TECHNIQUES" type="{}MATIERE_TECHNIQUESType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DIMENSIONS" type="{}DIMENSIONSType" minOccurs="0"/&gt;
 *         &lt;element name="INSCRIPTIONS" type="{}INSCRIPTIONSType" minOccurs="0"/&gt;
 *         &lt;element name="INDEXATION" type="{}INDEXATIONType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRIPTIONType", propOrder = {
    "matieretechniques",
    "dimensions",
    "inscriptions",
    "indexation"
})
public class DESCRIPTIONType {

    @XmlElement(name = "MATIERE_TECHNIQUES")
    protected List<MATIERETECHNIQUESType> matieretechniques;
    @XmlElement(name = "DIMENSIONS")
    protected DIMENSIONSType dimensions;
    @XmlElement(name = "INSCRIPTIONS")
    protected INSCRIPTIONSType inscriptions;
    @XmlElement(name = "INDEXATION")
    protected INDEXATIONType indexation;

    /**
     * Gets the value of the matieretechniques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matieretechniques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMATIERETECHNIQUES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MATIERETECHNIQUESType }
     * 
     * 
     */
    public List<MATIERETECHNIQUESType> getMATIERETECHNIQUES() {
        if (matieretechniques == null) {
            matieretechniques = new ArrayList<MATIERETECHNIQUESType>();
        }
        return this.matieretechniques;
    }

    /**
     * Obtient la valeur de la propriété dimensions.
     * 
     * @return
     *     possible object is
     *     {@link DIMENSIONSType }
     *     
     */
    public DIMENSIONSType getDIMENSIONS() {
        return dimensions;
    }

    /**
     * Définit la valeur de la propriété dimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link DIMENSIONSType }
     *     
     */
    public void setDIMENSIONS(DIMENSIONSType value) {
        this.dimensions = value;
    }

    /**
     * Obtient la valeur de la propriété inscriptions.
     * 
     * @return
     *     possible object is
     *     {@link INSCRIPTIONSType }
     *     
     */
    public INSCRIPTIONSType getINSCRIPTIONS() {
        return inscriptions;
    }

    /**
     * Définit la valeur de la propriété inscriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link INSCRIPTIONSType }
     *     
     */
    public void setINSCRIPTIONS(INSCRIPTIONSType value) {
        this.inscriptions = value;
    }

    /**
     * Obtient la valeur de la propriété indexation.
     * 
     * @return
     *     possible object is
     *     {@link INDEXATIONType }
     *     
     */
    public INDEXATIONType getINDEXATION() {
        return indexation;
    }

    /**
     * Définit la valeur de la propriété indexation.
     * 
     * @param value
     *     allowed object is
     *     {@link INDEXATIONType }
     *     
     */
    public void setINDEXATION(INDEXATIONType value) {
        this.indexation = value;
    }

}
