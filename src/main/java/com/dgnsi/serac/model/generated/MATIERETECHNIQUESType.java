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
 * <p>Classe Java pour MATIERE_TECHNIQUESType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MATIERE_TECHNIQUESType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MATIERE_TECHNIQUE" type="{}MATIERE_TECHNIQUEType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MATIERE_TECHNIQUESType", propOrder = {
    "matieretechnique"
})
public class MATIERETECHNIQUESType {

    @XmlElement(name = "MATIERE_TECHNIQUE")
    protected List<MATIERETECHNIQUEType> matieretechnique;

    /**
     * Gets the value of the matieretechnique property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matieretechnique property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMATIERETECHNIQUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MATIERETECHNIQUEType }
     * 
     * 
     */
    public List<MATIERETECHNIQUEType> getMATIERETECHNIQUE() {
        if (matieretechnique == null) {
            matieretechnique = new ArrayList<MATIERETECHNIQUEType>();
        }
        return this.matieretechnique;
    }

}
