package com.sefactura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "resultado",
   propOrder = {"codigo", "status", "timbre"}
)
public class Resultado {
   protected String codigo;
   protected String status;
   protected String timbre;

   public String getCodigo() {
      return this.codigo;
   }

   public void setCodigo(String value) {
      this.codigo = value;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String value) {
      this.status = value;
   }

   public String getTimbre() {
      return this.timbre;
   }

   public void setTimbre(String value) {
      this.timbre = value;
   }
}
