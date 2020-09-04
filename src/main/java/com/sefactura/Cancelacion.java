package com.sefactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "cancelacion",
   propOrder = {"solicitud", "usuario", "clave"}
)
public class Cancelacion {
   protected SolCancelacion solicitud;
   protected String usuario;
   protected String clave;

   public SolCancelacion getSolicitud() {
      return this.solicitud;
   }

   public void setSolicitud(SolCancelacion value) {
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
