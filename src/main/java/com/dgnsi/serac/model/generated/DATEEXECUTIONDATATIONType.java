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
 * <p>Classe Java pour DATE_EXECUTION_DATATIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DATE_EXECUTION_DATATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_EXECUTION_DATATION_DEBUT" type="{}DATE_EXECUTION_DATATION_DEBUTType"/&gt;
 *         &lt;element name="DATE_EXECUTION_DATATION_FIN" type="{}DATE_EXECUTION_DATATION_FINType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATE_EXECUTION_DATATIONType", propOrder = {
    "dateexecutiondatationdebut",
    "dateexecutiondatationfin"
})
public class DATEEXECUTIONDATATIONType {

    @XmlElement(name = "DATE_EXECUTION_DATATION_DEBUT", required = false)
    protected DATEEXECUTIONDATATIONDEBUTType dateexecutiondatationdebut;
    @XmlElement(name = "DATE_EXECUTION_DATATION_FIN")
    protected DATEEXECUTIONDATATIONFINType dateexecutiondatationfin;

    /**
     * Obtient la valeur de la propriété dateexecutiondatationdebut.
     * 
     * @return
     *     possible object is
     *     {@link DATEEXECUTIONDATATIONDEBUTType }
     *     
     */
    public DATEEXECUTIONDATATIONDEBUTType getDATEEXECUTIONDATATIONDEBUT() {
        return dateexecutiondatationdebut;
    }

    /**
     * Définit la valeur de la propriété dateexecutiondatationdebut.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEEXECUTIONDATATIONDEBUTType }
     *     
     */
    public void setDATEEXECUTIONDATATIONDEBUT(DATEEXECUTIONDATATIONDEBUTType value) {
        this.dateexecutiondatationdebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateexecutiondatationfin.
     * 
     * @return
     *     possible object is
     *     {@link DATEEXECUTIONDATATIONFINType }
     *     
     */
    public DATEEXECUTIONDATATIONFINType getDATEEXECUTIONDATATIONFIN() {
        return dateexecutiondatationfin;
    }

    /**
     * Définit la valeur de la propriété dateexecutiondatationfin.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEEXECUTIONDATATIONFINType }
     *     
     */
    public void setDATEEXECUTIONDATATIONFIN(DATEEXECUTIONDATATIONFINType value) {
        this.dateexecutiondatationfin = value;
    }

}
