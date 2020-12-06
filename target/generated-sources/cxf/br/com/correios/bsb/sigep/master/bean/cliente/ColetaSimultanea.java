
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de coletaSimultanea complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="coletaSimultanea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coleta"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaSimultanea", propOrder = {
    "obj",
    "obs"
})
public class ColetaSimultanea
    extends Coleta
{

    protected String obj;
    protected String obs;

    /**
     * Obtém o valor da propriedade obj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObj() {
        return obj;
    }

    /**
     * Define o valor da propriedade obj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObj(String value) {
        this.obj = value;
    }

    /**
     * Obtém o valor da propriedade obs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Define o valor da propriedade obs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

}
