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
 * <p>Classe Java pour CREATION_EXECUTIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CREATION_EXECUTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STYLE" type="{}STYLEType" minOccurs="0"/&gt;
 *         &lt;element name="DATES_EXECUTION" type="{}DATES_EXECUTIONType" minOccurs="0"/&gt;
 *         &lt;element name="PERIODE_EXECUTION" type="{}PERIODE_EXECUTIONType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREATION_EXECUTIONType", propOrder = {
    "style",
    "datesexecution",
    "periodeexecution"
})
public class CREATIONEXECUTIONType {

    @XmlElement(name = "STYLE")
    protected STYLEType style;
    @XmlElement(name = "DATES_EXECUTION")
    protected DATESEXECUTIONType datesexecution;
    @XmlElement(name = "PERIODE_EXECUTION")
    protected PERIODEEXECUTIONType periodeexecution;

    /**
     * Obtient la valeur de la propriété style.
     * 
     * @return
     *     possible object is
     *     {@link STYLEType }
     *     
     */
    public STYLEType getSTYLE() {
        return style;
    }

    /**
     * Définit la valeur de la propriété style.
     * 
     * @param value
     *     allowed object is
     *     {@link STYLEType }
     *     
     */
    public void setSTYLE(STYLEType value) {
        this.style = value;
    }

    /**
     * Obtient la valeur de la propriété datesexecution.
     * 
     * @return
     *     possible object is
     *     {@link DATESEXECUTIONType }
     *     
     */
    public DATESEXECUTIONType getDATESEXECUTION() {
        return datesexecution;
    }

    /**
     * Définit la valeur de la propriété datesexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link DATESEXECUTIONType }
     *     
     */
    public void setDATESEXECUTION(DATESEXECUTIONType value) {
        this.datesexecution = value;
    }

    /**
     * Obtient la valeur de la propriété periodeexecution.
     * 
     * @return
     *     possible object is
     *     {@link PERIODEEXECUTIONType }
     *     
     */
    public PERIODEEXECUTIONType getPERIODEEXECUTION() {
        return periodeexecution;
    }

    /**
     * Définit la valeur de la propriété periodeexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link PERIODEEXECUTIONType }
     *     
     */
    public void setPERIODEEXECUTION(PERIODEEXECUTIONType value) {
        this.periodeexecution = value;
    }

}
