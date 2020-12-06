
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de valorDeclarado complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="valorDeclarado"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="maximo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="minimo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valorDeclarado", propOrder = {
    "maximo",
    "minimo"
})
public class ValorDeclarado {

    protected Double maximo;
    protected Double minimo;

    /**
     * Obtém o valor da propriedade maximo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximo() {
        return maximo;
    }

    /**
     * Define o valor da propriedade maximo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximo(Double value) {
        this.maximo = value;
    }

    /**
     * Obtém o valor da propriedade minimo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimo() {
        return minimo;
    }

    /**
     * Define o valor da propriedade minimo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimo(Double value) {
        this.minimo = value;
    }

}
