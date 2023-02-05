//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour MUS_BIENType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MUS_BIENType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNIQUE_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SORT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DISPLAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DISPLAY_DENOMINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_PERSONNE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMPLACEMENT_PARENT" type="{}EMPLACEMENT_PARENTType" minOccurs="0"/&gt;
 *         &lt;element name="EMPLACEMENT_TRI" type="{}EMPLACEMENT_TRIType" minOccurs="0"/&gt;
 *         &lt;element name="CREATE_USER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Devanthéry Ariane"/&gt;
 *               &lt;enumeration value="system"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CREATE_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MODIFY_USER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Aude Spicher"/&gt;
 *               &lt;enumeration value="§Créé par§"/&gt;
 *               &lt;enumeration value="Ariane Devanthéry"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MODIFY_DATE" type="{}MODIFY_DATEType"/&gt;
 *         &lt;element name="ETAT_AVANCE_SAISIE" type="{}ETAT_AVANCE_SAISIEType"/&gt;
 *         &lt;element name="MUSEE" type="{}MUSEEType"/&gt;
 *         &lt;element name="NUM_INVENTAIRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NB_OBJETS_LOT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COLLECTION" type="{}COLLECTIONType"/&gt;
 *         &lt;element name="TYPE_BIEN" type="{}TYPE_BIENType"/&gt;
 *         &lt;element name="STATUT_BIEN" type="{}STATUT_BIENType"/&gt;
 *         &lt;element name="ILINK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PSBC_SCORE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PSBC_SCORE_G1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PSBC_SCORE_G2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PSBC_SCORE_G3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XML_FIELD" type="{}XML_FIELDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MUS_BIENType", propOrder = {
    "uniquekey",
    "sort",
    "display",
    "displaydenomination",
    "displaypersonne",
    "emplacementparent",
    "emplacementtri",
    "createuser",
    "createdate",
    "modifyuser",
    "modifydate",
    "etatavancesaisie",
    "musee",
    "numinventaire",
    "nbobjetslot",
    "collection",
    "typebien",
    "statutbien",
    "ilink",
    "psbcscore",
    "psbcscoreg1",
    "psbcscoreg2",
    "psbcscoreg3",
    "xmlfield"
})
public class MUSBIENType {

    @XmlElement(name = "UNIQUE_KEY", required = false)
    protected String uniquekey;
    @XmlElement(name = "SORT", required = false)
    protected String sort;
    @XmlElement(name = "DISPLAY", required = false)
    protected String display;
    @XmlElement(name = "DISPLAY_DENOMINATION")
    protected String displaydenomination;
    @XmlElement(name = "DISPLAY_PERSONNE", required = false)
    protected String displaypersonne;
    @XmlElement(name = "EMPLACEMENT_PARENT")
    protected EMPLACEMENTPARENTType emplacementparent;
    @XmlElement(name = "EMPLACEMENT_TRI")
    protected EMPLACEMENTTRIType emplacementtri;
    @XmlElement(name = "CREATE_USER", required = false)
    protected String createuser;
    @XmlElement(name = "CREATE_DATE", required = false)
    protected MUSBIENType.CREATEDATE createdate;
    @XmlElement(name = "MODIFY_USER", required = false)
    protected String modifyuser;
    @XmlElement(name = "MODIFY_DATE", required = false)
    protected MODIFYDATEType modifydate;
    @XmlElement(name = "ETAT_AVANCE_SAISIE", required = false)
    protected ETATAVANCESAISIEType etatavancesaisie;
    @XmlElement(name = "MUSEE", required = false)
    protected MUSEEType musee;
    @XmlElement(name = "NUM_INVENTAIRE", required = false)
    protected String numinventaire;
    @XmlElement(name = "NB_OBJETS_LOT", required = false)
    protected String nbobjetslot;
    @XmlElement(name = "COLLECTION", required = false)
    protected COLLECTIONType collection;
    @XmlElement(name = "TYPE_BIEN", required = false)
    protected TYPEBIENType typebien;
    @XmlElement(name = "STATUT_BIEN", required = false)
    protected STATUTBIENType statutbien;
    @XmlElement(name = "ILINK", required = false)
    protected String ilink;
    @XmlElement(name = "PSBC_SCORE", required = false)
    protected String psbcscore;
    @XmlElement(name = "PSBC_SCORE_G1", required = false)
    protected String psbcscoreg1;
    @XmlElement(name = "PSBC_SCORE_G2", required = false)
    protected String psbcscoreg2;
    @XmlElement(name = "PSBC_SCORE_G3", required = false)
    protected String psbcscoreg3;
    @XmlElement(name = "XML_FIELD", required = false)
    protected XMLFIELDType xmlfield;

    /**
     * Obtient la valeur de la propriété uniquekey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUEKEY() {
        return uniquekey;
    }

    /**
     * Définit la valeur de la propriété uniquekey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUEKEY(String value) {
        this.uniquekey = value;
    }

    /**
     * Obtient la valeur de la propriété sort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORT() {
        return sort;
    }

    /**
     * Définit la valeur de la propriété sort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORT(String value) {
        this.sort = value;
    }

    /**
     * Obtient la valeur de la propriété display.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDISPLAY() {
        return display;
    }

    /**
     * Définit la valeur de la propriété display.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDISPLAY(String value) {
        this.display = value;
    }

    /**
     * Obtient la valeur de la propriété displaydenomination.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDISPLAYDENOMINATION() {
        return displaydenomination;
    }

    /**
     * Définit la valeur de la propriété displaydenomination.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDISPLAYDENOMINATION(String value) {
        this.displaydenomination = value;
    }

    /**
     * Obtient la valeur de la propriété displaypersonne.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDISPLAYPERSONNE() {
        return displaypersonne;
    }

    /**
     * Définit la valeur de la propriété displaypersonne.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDISPLAYPERSONNE(String value) {
        this.displaypersonne = value;
    }

    /**
     * Obtient la valeur de la propriété emplacementparent.
     *
     * @return
     *     possible object is
     *     {@link EMPLACEMENTPARENTType }
     *
     */
    public EMPLACEMENTPARENTType getEMPLACEMENTPARENT() {
        return emplacementparent;
    }

    /**
     * Définit la valeur de la propriété emplacementparent.
     *
     * @param value
     *     allowed object is
     *     {@link EMPLACEMENTPARENTType }
     *
     */
    public void setEMPLACEMENTPARENT(EMPLACEMENTPARENTType value) {
        this.emplacementparent = value;
    }

    /**
     * Obtient la valeur de la propriété emplacementtri.
     *
     * @return
     *     possible object is
     *     {@link EMPLACEMENTTRIType }
     *
     */
    public EMPLACEMENTTRIType getEMPLACEMENTTRI() {
        return emplacementtri;
    }

    /**
     * Définit la valeur de la propriété emplacementtri.
     *
     * @param value
     *     allowed object is
     *     {@link EMPLACEMENTTRIType }
     *
     */
    public void setEMPLACEMENTTRI(EMPLACEMENTTRIType value) {
        this.emplacementtri = value;
    }

    /**
     * Obtient la valeur de la propriété createuser.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCREATEUSER() {
        return createuser;
    }

    /**
     * Définit la valeur de la propriété createuser.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCREATEUSER(String value) {
        this.createuser = value;
    }

    /**
     * Obtient la valeur de la propriété createdate.
     *
     * @return
     *     possible object is
     *     {@link MUSBIENType.CREATEDATE }
     *
     */
    public MUSBIENType.CREATEDATE getCREATEDATE() {
        return createdate;
    }

    /**
     * Définit la valeur de la propriété createdate.
     *
     * @param value
     *     allowed object is
     *     {@link MUSBIENType.CREATEDATE }
     *
     */
    public void setCREATEDATE(MUSBIENType.CREATEDATE value) {
        this.createdate = value;
    }

    /**
     * Obtient la valeur de la propriété modifyuser.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMODIFYUSER() {
        return modifyuser;
    }

    /**
     * Définit la valeur de la propriété modifyuser.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMODIFYUSER(String value) {
        this.modifyuser = value;
    }

    /**
     * Obtient la valeur de la propriété modifydate.
     *
     * @return
     *     possible object is
     *     {@link MODIFYDATEType }
     *
     */
    public MODIFYDATEType getMODIFYDATE() {
        return modifydate;
    }

    /**
     * Définit la valeur de la propriété modifydate.
     *
     * @param value
     *     allowed object is
     *     {@link MODIFYDATEType }
     *
     */
    public void setMODIFYDATE(MODIFYDATEType value) {
        this.modifydate = value;
    }

    /**
     * Obtient la valeur de la propriété etatavancesaisie.
     *
     * @return
     *     possible object is
     *     {@link ETATAVANCESAISIEType }
     *
     */
    public ETATAVANCESAISIEType getETATAVANCESAISIE() {
        return etatavancesaisie;
    }

    /**
     * Définit la valeur de la propriété etatavancesaisie.
     *
     * @param value
     *     allowed object is
     *     {@link ETATAVANCESAISIEType }
     *
     */
    public void setETATAVANCESAISIE(ETATAVANCESAISIEType value) {
        this.etatavancesaisie = value;
    }

    /**
     * Obtient la valeur de la propriété musee.
     *
     * @return
     *     possible object is
     *     {@link MUSEEType }
     *
     */
    public MUSEEType getMUSEE() {
        return musee;
    }

    /**
     * Définit la valeur de la propriété musee.
     *
     * @param value
     *     allowed object is
     *     {@link MUSEEType }
     *
     */
    public void setMUSEE(MUSEEType value) {
        this.musee = value;
    }

    /**
     * Obtient la valeur de la propriété numinventaire.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMINVENTAIRE() {
        return numinventaire;
    }

    /**
     * Définit la valeur de la propriété numinventaire.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMINVENTAIRE(String value) {
        this.numinventaire = value;
    }

    /**
     * Obtient la valeur de la propriété nbobjetslot.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNBOBJETSLOT() {
        return nbobjetslot;
    }

    /**
     * Définit la valeur de la propriété nbobjetslot.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNBOBJETSLOT(String value) {
        this.nbobjetslot = value;
    }

    /**
     * Obtient la valeur de la propriété collection.
     *
     * @return
     *     possible object is
     *     {@link COLLECTIONType }
     *
     */
    public COLLECTIONType getCOLLECTION() {
        return collection;
    }

    /**
     * Définit la valeur de la propriété collection.
     *
     * @param value
     *     allowed object is
     *     {@link COLLECTIONType }
     *
     */
    public void setCOLLECTION(COLLECTIONType value) {
        this.collection = value;
    }

    /**
     * Obtient la valeur de la propriété typebien.
     *
     * @return
     *     possible object is
     *     {@link TYPEBIENType }
     *
     */
    public TYPEBIENType getTYPEBIEN() {
        return typebien;
    }

    /**
     * Définit la valeur de la propriété typebien.
     *
     * @param value
     *     allowed object is
     *     {@link TYPEBIENType }
     *
     */
    public void setTYPEBIEN(TYPEBIENType value) {
        this.typebien = value;
    }

    /**
     * Obtient la valeur de la propriété statutbien.
     *
     * @return
     *     possible object is
     *     {@link STATUTBIENType }
     *
     */
    public STATUTBIENType getSTATUTBIEN() {
        return statutbien;
    }

    /**
     * Définit la valeur de la propriété statutbien.
     *
     * @param value
     *     allowed object is
     *     {@link STATUTBIENType }
     *
     */
    public void setSTATUTBIEN(STATUTBIENType value) {
        this.statutbien = value;
    }

    /**
     * Obtient la valeur de la propriété ilink.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getILINK() {
        return ilink;
    }

    /**
     * Définit la valeur de la propriété ilink.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setILINK(String value) {
        this.ilink = value;
    }

    /**
     * Obtient la valeur de la propriété psbcscore.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSBCSCORE() {
        return psbcscore;
    }

    /**
     * Définit la valeur de la propriété psbcscore.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSBCSCORE(String value) {
        this.psbcscore = value;
    }

    /**
     * Obtient la valeur de la propriété psbcscoreg1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSBCSCOREG1() {
        return psbcscoreg1;
    }

    /**
     * Définit la valeur de la propriété psbcscoreg1.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSBCSCOREG1(String value) {
        this.psbcscoreg1 = value;
    }

    /**
     * Obtient la valeur de la propriété psbcscoreg2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSBCSCOREG2() {
        return psbcscoreg2;
    }

    /**
     * Définit la valeur de la propriété psbcscoreg2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSBCSCOREG2(String value) {
        this.psbcscoreg2 = value;
    }

    /**
     * Obtient la valeur de la propriété psbcscoreg3.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSBCSCOREG3() {
        return psbcscoreg3;
    }

    /**
     * Définit la valeur de la propriété psbcscoreg3.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSBCSCOREG3(String value) {
        this.psbcscoreg3 = value;
    }

    /**
     * Obtient la valeur de la propriété xmlfield.
     *
     * @return
     *     possible object is
     *     {@link XMLFIELDType }
     *
     */
    public XMLFIELDType getXMLFIELD() {
        return xmlfield;
    }

    /**
     * Définit la valeur de la propriété xmlfield.
     *
     * @param value
     *     allowed object is
     *     {@link XMLFIELDType }
     *
     */
    public void setXMLFIELD(XMLFIELDType value) {
        this.xmlfield = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     *
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CREATEDATE {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "display")
        protected String display;

        /**
         * Obtient la valeur de la propriété value.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété display.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDisplay() {
            return display;
        }

        /**
         * Définit la valeur de la propriété display.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDisplay(String value) {
            this.display = value;
        }

    }

}
