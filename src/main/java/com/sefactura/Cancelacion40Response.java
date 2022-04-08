package com.sefactura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "cancelacion40Response",
   propOrder = {"_return"}
)
public class Cancelacion40Response {
   @XmlElement(
      name = "return"
   )
   protected String _return;

   public String getReturn() {
      return this._return;
   }

   public void setReturn(String value) {
      this._return = value;
   }
}
