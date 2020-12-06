
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de tipoMensagem.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="tipoMensagem"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="A"/&amp;gt;
 *     &amp;lt;enumeration value="E"/&amp;gt;
 *     &amp;lt;enumeration value="S"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "tipoMensagem")
@XmlEnum
public enum TipoMensagem {

    A,
    E,
    S;

    public String value() {
        return name();
    }

    public static TipoMensagem fromValue(String v) {
        return valueOf(v);
    }

}
