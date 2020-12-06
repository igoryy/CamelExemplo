
package br.com.correios.bsb.sigep.master.bean.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Classe Java de preListaPostagem complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="preListaPostagem"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="cartaoPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="conteudoProibido" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataAtualizacaoSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataFechamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataPostagemSara" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="objetosPostais" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostal" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="plpCliente" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *         &amp;lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *         &amp;lt;element name="plpXml" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="plpXmlRetorno" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusPlp" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preListaPostagem", propOrder = {
    "cartaoPostagem",
    "conteudoProibido",
    "dataAtualizacaoCliente",
    "dataAtualizacaoSara",
    "dataFechamento",
    "dataPostagem",
    "dataPostagemSara",
    "objetosPostais",
    "plpCliente",
    "plpNu",
    "plpXml",
    "plpXmlRetorno",
    "status"
})
public class PreListaPostagem {

    protected CartaoPostagemERP cartaoPostagem;
    @XmlSchemaType(name = "string")
    protected SimNao conteudoProibido;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoSara;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFechamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPostagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPostagemSara;
    @XmlElement(nillable = true)
    protected List<ObjetoPostal> objetosPostais;
    protected long plpCliente;
    protected long plpNu;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    protected List<Integer> plpXml;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "unsignedShort")
    protected List<Integer> plpXmlRetorno;
    @XmlSchemaType(name = "string")
    protected StatusPlp status;

    /**
     * Obtém o valor da propriedade cartaoPostagem.
     * 
     * @return
     *     possible object is
     *     {@link CartaoPostagemERP }
     *     
     */
    public CartaoPostagemERP getCartaoPostagem() {
        return cartaoPostagem;
    }

    /**
     * Define o valor da propriedade cartaoPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaoPostagemERP }
     *     
     */
    public void setCartaoPostagem(CartaoPostagemERP value) {
        this.cartaoPostagem = value;
    }

    /**
     * Obtém o valor da propriedade conteudoProibido.
     * 
     * @return
     *     possible object is
     *     {@link SimNao }
     *     
     */
    public SimNao getConteudoProibido() {
        return conteudoProibido;
    }

    /**
     * Define o valor da propriedade conteudoProibido.
     * 
     * @param value
     *     allowed object is
     *     {@link SimNao }
     *     
     */
    public void setConteudoProibido(SimNao value) {
        this.conteudoProibido = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacaoCliente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacaoCliente() {
        return dataAtualizacaoCliente;
    }

    /**
     * Define o valor da propriedade dataAtualizacaoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacaoCliente(XMLGregorianCalendar value) {
        this.dataAtualizacaoCliente = value;
    }

    /**
     * Obtém o valor da propriedade dataAtualizacaoSara.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacaoSara() {
        return dataAtualizacaoSara;
    }

    /**
     * Define o valor da propriedade dataAtualizacaoSara.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacaoSara(XMLGregorianCalendar value) {
        this.dataAtualizacaoSara = value;
    }

    /**
     * Obtém o valor da propriedade dataFechamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFechamento() {
        return dataFechamento;
    }

    /**
     * Define o valor da propriedade dataFechamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFechamento(XMLGregorianCalendar value) {
        this.dataFechamento = value;
    }

    /**
     * Obtém o valor da propriedade dataPostagem.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPostagem() {
        return dataPostagem;
    }

    /**
     * Define o valor da propriedade dataPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPostagem(XMLGregorianCalendar value) {
        this.dataPostagem = value;
    }

    /**
     * Obtém o valor da propriedade dataPostagemSara.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPostagemSara() {
        return dataPostagemSara;
    }

    /**
     * Define o valor da propriedade dataPostagemSara.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPostagemSara(XMLGregorianCalendar value) {
        this.dataPostagemSara = value;
    }

    /**
     * Gets the value of the objetosPostais property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the objetosPostais property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getObjetosPostais().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoPostal }
     * 
     * 
     */
    public List<ObjetoPostal> getObjetosPostais() {
        if (objetosPostais == null) {
            objetosPostais = new ArrayList<ObjetoPostal>();
        }
        return this.objetosPostais;
    }

    /**
     * Obtém o valor da propriedade plpCliente.
     * 
     */
    public long getPlpCliente() {
        return plpCliente;
    }

    /**
     * Define o valor da propriedade plpCliente.
     * 
     */
    public void setPlpCliente(long value) {
        this.plpCliente = value;
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

    /**
     * Gets the value of the plpXml property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the plpXml property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPlpXml().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlpXml() {
        if (plpXml == null) {
            plpXml = new ArrayList<Integer>();
        }
        return this.plpXml;
    }

    /**
     * Gets the value of the plpXmlRetorno property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the plpXmlRetorno property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPlpXmlRetorno().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlpXmlRetorno() {
        if (plpXmlRetorno == null) {
            plpXmlRetorno = new ArrayList<Integer>();
        }
        return this.plpXmlRetorno;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link StatusPlp }
     *     
     */
    public StatusPlp getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusPlp }
     *     
     */
    public void setStatus(StatusPlp value) {
        this.status = value;
    }

}
