
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de statusObjetoPostal.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusObjetoPostal"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EmBranco"/&amp;gt;
 *     &amp;lt;enumeration value="Postado"/&amp;gt;
 *     &amp;lt;enumeration value="Cancelado"/&amp;gt;
 *     &amp;lt;enumeration value="Estorno"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusObjetoPostal")
@XmlEnum
public enum StatusObjetoPostal {

    @XmlEnumValue("EmBranco")
    EM_BRANCO("EmBranco"),
    @XmlEnumValue("Postado")
    POSTADO("Postado"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Estorno")
    ESTORNO("Estorno");
    private final String value;

    StatusObjetoPostal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusObjetoPostal fromValue(String v) {
        for (StatusObjetoPostal c: StatusObjetoPostal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
