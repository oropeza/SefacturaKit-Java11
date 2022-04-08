package com.sefactura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "timbrado",
   propOrder = {"cfdi", "usuario", "clave"}
)
public class Timbrado {
   protected String cfdi;
   protected String usuario;
   protected String clave;

   public String getCfdi() {
      return this.cfdi;
   }

   public void setCfdi(String value) {
      this.cfdi = value;
   }

   public String getUsuario() {
      return this.usuario;
   }

   public void setUsuario(String value) {
      this.usuario = value;
   }

   public String getClave() {
      return this.clave;
   }

   public void setClave(String value) {
      this.clave = value;
   }
}
