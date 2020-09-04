package com.sefactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "timbradoResponse",
   propOrder = {"_return"}
)
public class TimbradoResponse {
   @XmlElement(
      name = "return"
   )
   protected Resultado _return;

   public Resultado getReturn() {
      return this._return;
   }

   public void setReturn(Resultado value) {
      this._return = value;
   }
}
