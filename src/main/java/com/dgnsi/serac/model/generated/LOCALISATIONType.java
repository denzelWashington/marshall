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
 * <p>Classe Java pour LOCALISATIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LOCALISATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMPLACEMENT_MUSEE" type="{}EMPLACEMENT_MUSEEType" minOccurs="0"/&gt;
 *         &lt;element name="PRECISIONS_LOCALISATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCALISATIONType", propOrder = {
    "emplacementmusee",
    "precisionslocalisation"
})
public class LOCALISATIONType {

    @XmlElement(name = "EMPLACEMENT_MUSEE")
    protected EMPLACEMENTMUSEEType emplacementmusee;
    @XmlElement(name = "PRECISIONS_LOCALISATION")
    protected String precisionslocalisation;

    /**
     * Obtient la valeur de la propriété emplacementmusee.
     * 
     * @return
     *     possible object is
     *     {@link EMPLACEMENTMUSEEType }
     *     
     */
    public EMPLACEMENTMUSEEType getEMPLACEMENTMUSEE() {
        return emplacementmusee;
    }

    /**
     * Définit la valeur de la propriété emplacementmusee.
     * 
     * @param value
     *     allowed object is
     *     {@link EMPLACEMENTMUSEEType }
     *     
     */
    public void setEMPLACEMENTMUSEE(EMPLACEMENTMUSEEType value) {
        this.emplacementmusee = value;
    }

    /**
     * Obtient la valeur de la propriété precisionslocalisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECISIONSLOCALISATION() {
        return precisionslocalisation;
    }

    /**
     * Définit la valeur de la propriété precisionslocalisation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECISIONSLOCALISATION(String value) {
        this.precisionslocalisation = value;
    }

}
