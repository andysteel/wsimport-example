
package com.gmail.andersoninfonet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberToWordsResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberToWordsResult"
})
@XmlRootElement(name = "NumberToWordsResponse")
public class NumberToWordsResponse {

    @XmlElement(name = "NumberToWordsResult", required = true)
    protected String numberToWordsResult;

    /**
     * Obt�m o valor da propriedade numberToWordsResult.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberToWordsResult() {
        return numberToWordsResult;
    }

    /**
     * Define o valor da propriedade numberToWordsResult.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberToWordsResult(String value) {
        this.numberToWordsResult = value;
    }

}
