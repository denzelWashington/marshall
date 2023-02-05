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
 * <p>Classe Java pour DOCUMENT_TEXTType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_TEXTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE_DOC" type="{}TYPE_DOCType"/&gt;
 *         &lt;element name="DOC_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENT_TEXTType", propOrder = {
    "typedoc",
    "doctext"
})
public class DOCUMENTTEXTType {

    @XmlElement(name = "TYPE_DOC", required = false)
    protected TYPEDOCType typedoc;
    @XmlElement(name = "DOC_TEXT", required = false)
    protected String doctext;

    /**
     * Obtient la valeur de la propriété typedoc.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDOCType }
     *     
     */
    public TYPEDOCType getTYPEDOC() {
        return typedoc;
    }

    /**
     * Définit la valeur de la propriété typedoc.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDOCType }
     *     
     */
    public void setTYPEDOC(TYPEDOCType value) {
        this.typedoc = value;
    }

    /**
     * Obtient la valeur de la propriété doctext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCTEXT() {
        return doctext;
    }

    /**
     * Définit la valeur de la propriété doctext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCTEXT(String value) {
        this.doctext = value;
    }

}
