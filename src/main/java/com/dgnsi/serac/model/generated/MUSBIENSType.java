//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java pour MUS_BIENSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MUS_BIENSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MUS_BIEN" type="{}MUS_BIENType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MUS_BIENSType", propOrder = {
    "musbien"
})
public class MUSBIENSType {

    @XmlElement(name = "MUS_BIEN")
    protected List<MUSBIENType> musbien;

    /**
     * Gets the value of the musbien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musbien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMUSBIEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MUSBIENType }
     * 
     * 
     */
    public List<MUSBIENType> getMUSBIEN() {
        if (musbien == null) {
            musbien = new ArrayList<MUSBIENType>();
        }
        return this.musbien;
    }

}
