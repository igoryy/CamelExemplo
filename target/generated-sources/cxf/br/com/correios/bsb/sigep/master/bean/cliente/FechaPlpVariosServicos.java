
package br.com.correios.bsb.sigep.master.bean.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de fechaPlpVariosServicos complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="fechaPlpVariosServicos"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="idPlpCliente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="cartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="listaEtiquetas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fechaPlpVariosServicos", propOrder = {
    "xml",
    "idPlpCliente",
    "cartaoPostagem",
    "listaEtiquetas",
    "usuario",
    "senha"
})
public class FechaPlpVariosServicos {

    protected String xml;
    protected Long idPlpCliente;
    protected String cartaoPostagem;
    protected List<String> listaEtiquetas;
    protected String usuario;
    protected String senha;

    /**
     * Obtém o valor da propriedade xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Define o valor da propriedade xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

    /**
     * Obtém o valor da propriedade idPlpCliente.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPlpCliente() {
        return idPlpCliente;
    }

    /**
     * Define o valor da propriedade idPlpCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPlpCliente(Long value) {
        this.idPlpCliente = value;
    }

    /**
     * Obtém o valor da propriedade cartaoPostagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaoPostagem() {
        return cartaoPostagem;
    }

    /**
     * Define o valor da propriedade cartaoPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaoPostagem(String value) {
        this.cartaoPostagem = value;
    }

    /**
     * Gets the value of the listaEtiquetas property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the listaEtiquetas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getListaEtiquetas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaEtiquetas() {
        if (listaEtiquetas == null) {
            listaEtiquetas = new ArrayList<String>();
        }
        return this.listaEtiquetas;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
