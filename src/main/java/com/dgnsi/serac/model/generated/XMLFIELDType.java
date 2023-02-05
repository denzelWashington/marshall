//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour XML_FIELDType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="XML_FIELDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MARQUAGE" type="{}MARQUAGEType"/&gt;
 *         &lt;element name="LOCALISATION" type="{}LOCALISATIONType"/&gt;
 *         &lt;element name="DESIGNATION" type="{}DESIGNATIONType"/&gt;
 *         &lt;element name="DESCRIPTION" type="{}DESCRIPTIONType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CREATIONS_EXECUTIONS" type="{}CREATIONS_EXECUTIONSType" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENTATION" type="{}DOCUMENTATIONType" minOccurs="0"/&gt;
 *         &lt;element name="ETAT_CONSERVATION" type="{}ETAT_CONSERVATIONType" minOccurs="0"/&gt;
 *         &lt;element name="ADMINISTRATION" type="{}ADMINISTRATIONType"/&gt;
 *         &lt;element name="DONNEES_PATRI" type="{}DONNEES_PATRIType"/&gt;
 *         &lt;element name="HISTORIQUE_APPARTENANCES" type="{}HISTORIQUE_APPARTENANCESType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML_FIELDType", propOrder = {
    "marquage",
    "localisation",
    "designation",
    "description",
    "creationsexecutions",
    "documentation",
    "etatconservation",
    "administration",
    "donneespatri",
    "historiqueappartenances"
})
public class XMLFIELDType {

    @XmlElement(name = "MARQUAGE", required = false)
    protected MARQUAGEType marquage;
    @XmlElement(name = "LOCALISATION", required = false)
    protected LOCALISATIONType localisation;
    @XmlElement(name = "DESIGNATION", required = false)
    protected DESIGNATIONType designation;
    @XmlElement(name = "DESCRIPTION")
    protected List<DESCRIPTIONType> description;
    @XmlElement(name = "CREATIONS_EXECUTIONS")
    protected CREATIONSEXECUTIONSType creationsexecutions;
    @XmlElement(name = "DOCUMENTATION")
    protected DOCUMENTATIONType documentation;
    @XmlElement(name = "ETAT_CONSERVATION")
    protected ETATCONSERVATIONType etatconservation;
    @XmlElement(name = "ADMINISTRATION", required = false)
    protected ADMINISTRATIONType administration;
    @XmlElement(name = "DONNEES_PATRI", required = false)
    protected DONNEESPATRIType donneespatri;
    @XmlElement(name = "HISTORIQUE_APPARTENANCES", required = false)
    protected HISTORIQUEAPPARTENANCESType historiqueappartenances;

    /**
     * Obtient la valeur de la propriété marquage.
     * 
     * @return
     *     possible object is
     *     {@link MARQUAGEType }
     *     
     */
    public MARQUAGEType getMARQUAGE() {
        return marquage;
    }

    /**
     * Définit la valeur de la propriété marquage.
     * 
     * @param value
     *     allowed object is
     *     {@link MARQUAGEType }
     *     
     */
    public void setMARQUAGE(MARQUAGEType value) {
        this.marquage = value;
    }

    /**
     * Obtient la valeur de la propriété localisation.
     * 
     * @return
     *     possible object is
     *     {@link LOCALISATIONType }
     *     
     */
    public LOCALISATIONType getLOCALISATION() {
        return localisation;
    }

    /**
     * Définit la valeur de la propriété localisation.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALISATIONType }
     *     
     */
    public void setLOCALISATION(LOCALISATIONType value) {
        this.localisation = value;
    }

    /**
     * Obtient la valeur de la propriété designation.
     * 
     * @return
     *     possible object is
     *     {@link DESIGNATIONType }
     *     
     */
    public DESIGNATIONType getDESIGNATION() {
        return designation;
    }

    /**
     * Définit la valeur de la propriété designation.
     * 
     * @param value
     *     allowed object is
     *     {@link DESIGNATIONType }
     *     
     */
    public void setDESIGNATION(DESIGNATIONType value) {
        this.designation = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONType }
     * 
     * 
     */
    public List<DESCRIPTIONType> getDESCRIPTION() {
        if (description == null) {
            description = new ArrayList<DESCRIPTIONType>();
        }
        return this.description;
    }

    /**
     * Obtient la valeur de la propriété creationsexecutions.
     * 
     * @return
     *     possible object is
     *     {@link CREATIONSEXECUTIONSType }
     *     
     */
    public CREATIONSEXECUTIONSType getCREATIONSEXECUTIONS() {
        return creationsexecutions;
    }

    /**
     * Définit la valeur de la propriété creationsexecutions.
     * 
     * @param value
     *     allowed object is
     *     {@link CREATIONSEXECUTIONSType }
     *     
     */
    public void setCREATIONSEXECUTIONS(CREATIONSEXECUTIONSType value) {
        this.creationsexecutions = value;
    }

    /**
     * Obtient la valeur de la propriété documentation.
     * 
     * @return
     *     possible object is
     *     {@link DOCUMENTATIONType }
     *     
     */
    public DOCUMENTATIONType getDOCUMENTATION() {
        return documentation;
    }

    /**
     * Définit la valeur de la propriété documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link DOCUMENTATIONType }
     *     
     */
    public void setDOCUMENTATION(DOCUMENTATIONType value) {
        this.documentation = value;
    }

    /**
     * Obtient la valeur de la propriété etatconservation.
     * 
     * @return
     *     possible object is
     *     {@link ETATCONSERVATIONType }
     *     
     */
    public ETATCONSERVATIONType getETATCONSERVATION() {
        return etatconservation;
    }

    /**
     * Définit la valeur de la propriété etatconservation.
     * 
     * @param value
     *     allowed object is
     *     {@link ETATCONSERVATIONType }
     *     
     */
    public void setETATCONSERVATION(ETATCONSERVATIONType value) {
        this.etatconservation = value;
    }

    /**
     * Obtient la valeur de la propriété administration.
     * 
     * @return
     *     possible object is
     *     {@link ADMINISTRATIONType }
     *     
     */
    public ADMINISTRATIONType getADMINISTRATION() {
        return administration;
    }

    /**
     * Définit la valeur de la propriété administration.
     * 
     * @param value
     *     allowed object is
     *     {@link ADMINISTRATIONType }
     *     
     */
    public void setADMINISTRATION(ADMINISTRATIONType value) {
        this.administration = value;
    }

    /**
     * Obtient la valeur de la propriété donneespatri.
     * 
     * @return
     *     possible object is
     *     {@link DONNEESPATRIType }
     *     
     */
    public DONNEESPATRIType getDONNEESPATRI() {
        return donneespatri;
    }

    /**
     * Définit la valeur de la propriété donneespatri.
     * 
     * @param value
     *     allowed object is
     *     {@link DONNEESPATRIType }
     *     
     */
    public void setDONNEESPATRI(DONNEESPATRIType value) {
        this.donneespatri = value;
    }

    /**
     * Obtient la valeur de la propriété historiqueappartenances.
     * 
     * @return
     *     possible object is
     *     {@link HISTORIQUEAPPARTENANCESType }
     *     
     */
    public HISTORIQUEAPPARTENANCESType getHISTORIQUEAPPARTENANCES() {
        return historiqueappartenances;
    }

    /**
     * Définit la valeur de la propriété historiqueappartenances.
     * 
     * @param value
     *     allowed object is
     *     {@link HISTORIQUEAPPARTENANCESType }
     *     
     */
    public void setHISTORIQUEAPPARTENANCES(HISTORIQUEAPPARTENANCESType value) {
        this.historiqueappartenances = value;
    }

}
