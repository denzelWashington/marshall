//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.05 à 05:00:24 PM CET 
//


package com.dgnsi.serac.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DIMENSIONType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DIMENSIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="MASSE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MASSE_UNITE" type="{}MASSE_UNITEType"/&gt;
 *         &lt;element name="HAUTEUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE_DIMENSION"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="46"/&gt;
 *               &lt;enumeration value="47"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HAUTEUR_UNITE" type="{}HAUTEUR_UNITEType"/&gt;
 *         &lt;element name="DIAMETRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRECISION_DIMENSION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LONGUEUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LARGEUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROFONDEUR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="8.30"/&gt;
 *               &lt;enumeration value="52.00"/&gt;
 *               &lt;enumeration value="48.00"/&gt;
 *               &lt;enumeration value="140.00"/&gt;
 *               &lt;enumeration value="47.00"/&gt;
 *               &lt;enumeration value="116.00"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPAISSEUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIMENSIONType", propOrder = {
    "masseOrMASSEUNITEOrHAUTEUR"
})
public class DIMENSIONType {

    @XmlElementRefs({
        @XmlElementRef(name = "MASSE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MASSE_UNITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HAUTEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TYPE_DIMENSION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HAUTEUR_UNITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DIAMETRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRECISION_DIMENSION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LONGUEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LARGEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROFONDEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EPAISSEUR", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> masseOrMASSEUNITEOrHAUTEUR;

    /**
     * Gets the value of the masseOrMASSEUNITEOrHAUTEUR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masseOrMASSEUNITEOrHAUTEUR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMASSEOrMASSEUNITEOrHAUTEUR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link MASSEUNITEType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link HAUTEURUNITEType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getMASSEOrMASSEUNITEOrHAUTEUR() {
        if (masseOrMASSEUNITEOrHAUTEUR == null) {
            masseOrMASSEUNITEOrHAUTEUR = new ArrayList<JAXBElement<?>>();
        }
        return this.masseOrMASSEUNITEOrHAUTEUR;
    }

}
