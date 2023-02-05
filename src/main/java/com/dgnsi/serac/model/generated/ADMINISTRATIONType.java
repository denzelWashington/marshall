

package com.dgnsi.serac.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ADMINISTRATIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ADMINISTRATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BLOC_NOTE_ADMS" type="{}BLOC_NOTE_ADMSType" minOccurs="0"/&gt;
 *         &lt;element name="REPRISE_HISTO_ETAT_AVANCE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Non"/&gt;
 *               &lt;enumeration value="Données importées : Ariane Devanthéry - 02.11.2017 (Liste objets MUMH)"/&gt;
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
@XmlType(name = "ADMINISTRATIONType", propOrder = {
    "blocnoteadms",
    "reprisehistoetatavance"
})
public class ADMINISTRATIONType {

    @XmlElement(name = "BLOC_NOTE_ADMS")
    protected BLOCNOTEADMSType blocnoteadms;
    @XmlElement(name = "REPRISE_HISTO_ETAT_AVANCE", required = false)
    protected String reprisehistoetatavance;

    /**
     * Obtient la valeur de la propriété blocnoteadms.
     * 
     * @return
     *     possible object is
     *     {@link BLOCNOTEADMSType }
     *     
     */
    public BLOCNOTEADMSType getBLOCNOTEADMS() {
        return blocnoteadms;
    }

    /**
     * Définit la valeur de la propriété blocnoteadms.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOCNOTEADMSType }
     *     
     */
    public void setBLOCNOTEADMS(BLOCNOTEADMSType value) {
        this.blocnoteadms = value;
    }

    /**
     * Obtient la valeur de la propriété reprisehistoetatavance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPRISEHISTOETATAVANCE() {
        return reprisehistoetatavance;
    }

    /**
     * Définit la valeur de la propriété reprisehistoetatavance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPRISEHISTOETATAVANCE(String value) {
        this.reprisehistoetatavance = value;
    }

}
