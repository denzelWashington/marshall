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
 * <p>Classe Java pour DATES_EXECUTIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DATES_EXECUTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_EXECUTION" type="{}DATE_EXECUTIONType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATES_EXECUTIONType", propOrder = {
    "dateexecution"
})
public class DATESEXECUTIONType {

    @XmlElement(name = "DATE_EXECUTION", required = false)
    protected DATEEXECUTIONType dateexecution;

    /**
     * Obtient la valeur de la propriété dateexecution.
     * 
     * @return
     *     possible object is
     *     {@link DATEEXECUTIONType }
     *     
     */
    public DATEEXECUTIONType getDATEEXECUTION() {
        return dateexecution;
    }

    /**
     * Définit la valeur de la propriété dateexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEEXECUTIONType }
     *     
     */
    public void setDATEEXECUTION(DATEEXECUTIONType value) {
        this.dateexecution = value;
    }

}
