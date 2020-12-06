
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de objetoPostalPK complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="objetoPostalPK"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="codigoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostalPK", propOrder = {
    "codigoEtiqueta",
    "plpNu"
})
public class ObjetoPostalPK {

    protected String codigoEtiqueta;
    protected long plpNu;

    /**
     * Obtém o valor da propriedade codigoEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    /**
     * Define o valor da propriedade codigoEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtiqueta(String value) {
        this.codigoEtiqueta = value;
    }

    /**
     * Obtém o valor da propriedade plpNu.
     * 
     */
    public long getPlpNu() {
        return plpNu;
    }

    /**
     * Define o valor da propriedade plpNu.
     * 
     */
    public void setPlpNu(long value) {
        this.plpNu = value;
    }

}
