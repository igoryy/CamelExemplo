
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de statusGerente.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusGerente"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Ativo"/&amp;gt;
 *     &amp;lt;enumeration value="Inativo"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusGerente")
@XmlEnum
public enum StatusGerente {

    @XmlEnumValue("Ativo")
    ATIVO("Ativo"),
    @XmlEnumValue("Inativo")
    INATIVO("Inativo");
    private final String value;

    StatusGerente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusGerente fromValue(String v) {
        for (StatusGerente c: StatusGerente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
