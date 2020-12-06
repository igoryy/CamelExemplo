
package br.com.correios.bsb.sigep.master.bean.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de coleta complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="coleta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="cklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="produto" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}produto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetente" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coleta", propOrder = {
    "cklist",
    "descricao",
    "documento",
    "idCliente",
    "produto",
    "remetente",
    "tipo",
    "valorDeclarado"
})
@XmlSeeAlso({
    ColetaSimultanea.class,
    ColetaReversa.class
})
public class Coleta {

    protected String cklist;
    protected String descricao;
    @XmlElement(nillable = true)
    protected List<String> documento;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(nillable = true)
    protected List<Produto> produto;
    protected Remetente remetente;
    protected String tipo;
    @XmlElement(name = "valor_declarado")
    protected String valorDeclarado;

    /**
     * Obtém o valor da propriedade cklist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCklist() {
        return cklist;
    }

    /**
     * Define o valor da propriedade cklist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCklist(String value) {
        this.cklist = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the documento property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDocumento().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumento() {
        if (documento == null) {
            documento = new ArrayList<String>();
        }
        return this.documento;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the produto property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getProduto().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Produto }
     * 
     * 
     */
    public List<Produto> getProduto() {
        if (produto == null) {
            produto = new ArrayList<Produto>();
        }
        return this.produto;
    }

    /**
     * Obtém o valor da propriedade remetente.
     * 
     * @return
     *     possible object is
     *     {@link Remetente }
     *     
     */
    public Remetente getRemetente() {
        return remetente;
    }

    /**
     * Define o valor da propriedade remetente.
     * 
     * @param value
     *     allowed object is
     *     {@link Remetente }
     *     
     */
    public void setRemetente(Remetente value) {
        this.remetente = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade valorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define o valor da propriedade valorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDeclarado(String value) {
        this.valorDeclarado = value;
    }

}
