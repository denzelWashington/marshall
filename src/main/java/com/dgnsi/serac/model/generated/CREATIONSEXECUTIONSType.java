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
 * <p>Classe Java pour CREATIONS_EXECUTIONSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CREATIONS_EXECUTIONSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATION_EXECUTION" type="{}CREATION_EXECUTIONType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREATIONS_EXECUTIONSType", propOrder = {
    "creationexecution"
})
public class CREATIONSEXECUTIONSType {

    @XmlElement(name = "CREATION_EXECUTION", required = false)
    protected CREATIONEXECUTIONType creationexecution;

    /**
     * Obtient la valeur de la propriété creationexecution.
     * 
     * @return
     *     possible object is
     *     {@link CREATIONEXECUTIONType }
     *     
     */
    public CREATIONEXECUTIONType getCREATIONEXECUTION() {
        return creationexecution;
    }

    /**
     * Définit la valeur de la propriété creationexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link CREATIONEXECUTIONType }
     *     
     */
    public void setCREATIONEXECUTION(CREATIONEXECUTIONType value) {
        this.creationexecution = value;
    }

}
