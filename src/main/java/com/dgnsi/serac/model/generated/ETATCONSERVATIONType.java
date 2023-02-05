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
 * <p>Classe Java pour ETAT_CONSERVATIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ETAT_CONSERVATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRECISIONS_ETAT_CONSERV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETAT_CONSERVATIONType", propOrder = {
    "precisionsetatconserv"
})
public class ETATCONSERVATIONType {

    @XmlElement(name = "PRECISIONS_ETAT_CONSERV", required = false)
    protected String precisionsetatconserv;

    /**
     * Obtient la valeur de la propriété precisionsetatconserv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECISIONSETATCONSERV() {
        return precisionsetatconserv;
    }

    /**
     * Définit la valeur de la propriété precisionsetatconserv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECISIONSETATCONSERV(String value) {
        this.precisionsetatconserv = value;
    }

}
