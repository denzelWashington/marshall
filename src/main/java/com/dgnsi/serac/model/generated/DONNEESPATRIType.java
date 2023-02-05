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
 * <p>Classe Java pour DONNEES_PATRIType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DONNEES_PATRIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROP" type="{}PROPType"/&gt;
 *         &lt;element name="GEST" type="{}GESTType"/&gt;
 *         &lt;element name="NOTES_PATRI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="§Confidentialité§"/&gt;
 *               &lt;enumeration value="Non"/&gt;
 *               &lt;enumeration value="non"/&gt;
 *               &lt;enumeration value="Oui"/&gt;
 *               &lt;enumeration value="oui"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DONNEES_PATRIType", propOrder = {
    "prop",
    "gest",
    "notespatri"
})
public class DONNEESPATRIType {

    @XmlElement(name = "PROP", required = false)
    protected PROPType prop;
    @XmlElement(name = "GEST", required = false)
    protected GESTType gest;
    @XmlElement(name = "NOTES_PATRI")
    protected String notespatri;

    /**
     * Obtient la valeur de la propriété prop.
     * 
     * @return
     *     possible object is
     *     {@link PROPType }
     *     
     */
    public PROPType getPROP() {
        return prop;
    }

    /**
     * Définit la valeur de la propriété prop.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPType }
     *     
     */
    public void setPROP(PROPType value) {
        this.prop = value;
    }

    /**
     * Obtient la valeur de la propriété gest.
     * 
     * @return
     *     possible object is
     *     {@link GESTType }
     *     
     */
    public GESTType getGEST() {
        return gest;
    }

    /**
     * Définit la valeur de la propriété gest.
     * 
     * @param value
     *     allowed object is
     *     {@link GESTType }
     *     
     */
    public void setGEST(GESTType value) {
        this.gest = value;
    }

    /**
     * Obtient la valeur de la propriété notespatri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTESPATRI() {
        return notespatri;
    }

    /**
     * Définit la valeur de la propriété notespatri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTESPATRI(String value) {
        this.notespatri = value;
    }

}
