package com.sefactura.pac.client;

import java.awt.Image;

public class RespuestaTimbrado {
   private String xml = null;
   private Image imagen = null;
   private String resultado = null;
   private String cadenaCodigo = null;

   public String getXml() {
      return this.xml;
   }

   public Image getImagen() {
      return this.imagen;
   }

   public String getResultado() {
      return this.resultado;
   }

   public void setXml(String xml) {
      this.xml = xml;
   }

   public void setImagen(Image imagen) {
      this.imagen = imagen;
   }

   public void setResultado(String resultado) {
      this.resultado = resultado;
   }

   public void setCadenaCodigo(String cadenaCodigo) {
      this.cadenaCodigo = cadenaCodigo;
   }

   public String getCadenaCodigo() {
      return this.cadenaCodigo;
   }
}
