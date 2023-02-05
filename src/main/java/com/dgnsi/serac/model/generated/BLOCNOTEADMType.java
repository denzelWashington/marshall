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
 * <p>Classe Java pour BLOC_NOTE_ADMType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BLOC_NOTE_ADMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE_INFORMATION" type="{}TYPE_INFORMATIONType"/&gt;
 *         &lt;element name="INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BLOC_NOTE_ADMType", propOrder = {
    "typeinformation",
    "information"
})
public class BLOCNOTEADMType {

    @XmlElement(name = "TYPE_INFORMATION", required = false)
    protected TYPEINFORMATIONType typeinformation;
    @XmlElement(name = "INFORMATION", required = false)
    protected String information;

    /**
     * Obtient la valeur de la propriété typeinformation.
     * 
     * @return
     *     possible object is
     *     {@link TYPEINFORMATIONType }
     *     
     */
    public TYPEINFORMATIONType getTYPEINFORMATION() {
        return typeinformation;
    }

    /**
     * Définit la valeur de la propriété typeinformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEINFORMATIONType }
     *     
     */
    public void setTYPEINFORMATION(TYPEINFORMATIONType value) {
        this.typeinformation = value;
    }

    /**
     * Obtient la valeur de la propriété information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFORMATION() {
        return information;
    }

    /**
     * Définit la valeur de la propriété information.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFORMATION(String value) {
        this.information = value;
    }

}
