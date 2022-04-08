package com.sefactura;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "cancelacion40",
   propOrder = {"solicitud", "usuario", "clave"}
)
public class Cancelacion40 {
   protected SolCancelacion40 solicitud;
   protected String usuario;
   protected String clave;

   public SolCancelacion40 getSolicitud() {
      return this.solicitud;
   }

   public void setSolicitud(SolCancelacion40 value) {
      this.solicitud = value;
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
