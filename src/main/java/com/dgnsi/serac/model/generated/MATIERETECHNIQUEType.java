//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MATIERE_TECHNIQUEType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MATIERE_TECHNIQUEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MATIERE" type="{}MATIEREType" minOccurs="0"/&gt;
 *         &lt;element name="TECHNIQUE" type="{}TECHNIQUEType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MATIERE_TECHNIQUEType", propOrder = {
    "matiere",
    "technique"
})
public class MATIERETECHNIQUEType {

    @XmlElement(name = "MATIERE")
    protected MATIEREType matiere;
    @XmlElement(name = "TECHNIQUE")
    protected TECHNIQUEType technique;

    /**
     * Obtient la valeur de la propriété matiere.
     * 
     * @return
     *     possible object is
     *     {@link MATIEREType }
     *     
     */
    public MATIEREType getMATIERE() {
        return matiere;
    }

    /**
     * Définit la valeur de la propriété matiere.
     * 
     * @param value
     *     allowed object is
     *     {@link MATIEREType }
     *     
     */
    public void setMATIERE(MATIEREType value) {
        this.matiere = value;
    }

    /**
     * Obtient la valeur de la propriété technique.
     * 
     * @return
     *     possible object is
     *     {@link TECHNIQUEType }
     *     
     */
    public TECHNIQUEType getTECHNIQUE() {
        return technique;
    }

    /**
     * Définit la valeur de la propriété technique.
     * 
     * @param value
     *     allowed object is
     *     {@link TECHNIQUEType }
     *     
     */
    public void setTECHNIQUE(TECHNIQUEType value) {
        this.technique = value;
    }

}
