package com.sefactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
