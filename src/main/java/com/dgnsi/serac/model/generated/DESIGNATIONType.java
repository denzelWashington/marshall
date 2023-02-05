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
 * <p>Classe Java pour DESIGNATIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DESIGNATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SH" type="{}SHType" minOccurs="0"/&gt;
 *         &lt;element name="PRECISION_DESIGNATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NB_PART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESIGNATIONType", propOrder = {
    "sh",
    "precisiondesignation",
    "nbpart"
})
public class DESIGNATIONType {

    @XmlElement(name = "SH")
    protected SHType sh;
    @XmlElement(name = "PRECISION_DESIGNATION", required = false)
    protected String precisiondesignation;
    @XmlElement(name = "NB_PART")
    protected String nbpart;

    /**
     * Obtient la valeur de la propriété sh.
     * 
     * @return
     *     possible object is
     *     {@link SHType }
     *     
     */
    public SHType getSH() {
        return sh;
    }

    /**
     * Définit la valeur de la propriété sh.
     * 
     * @param value
     *     allowed object is
     *     {@link SHType }
     *     
     */
    public void setSH(SHType value) {
        this.sh = value;
    }

    /**
     * Obtient la valeur de la propriété precisiondesignation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECISIONDESIGNATION() {
        return precisiondesignation;
    }

    /**
     * Définit la valeur de la propriété precisiondesignation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECISIONDESIGNATION(String value) {
        this.precisiondesignation = value;
    }

    /**
     * Obtient la valeur de la propriété nbpart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBPART() {
        return nbpart;
    }

    /**
     * Définit la valeur de la propriété nbpart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBPART(String value) {
        this.nbpart = value;
    }

}
