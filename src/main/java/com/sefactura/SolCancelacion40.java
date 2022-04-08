package com.sefactura;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "solCancelacion40",
   propOrder = {"certificado", "llavePrivada", "password", "folios"}
)
public class SolCancelacion40 {
   protected String certificado;
   protected String llavePrivada;
   protected String password;
   
   
   @XmlElement(
      nillable = false
      
   )
   protected List<FolioCancelacion> folios;

   public String getCertificado() {
      return this.certificado;
   }

   public void setCertificado(String value) {
      this.certificado = value;
   }

   public String getLlavePrivada() {
      return this.llavePrivada;
   }

   public void setLlavePrivada(String value) {
      this.llavePrivada = value;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String value) {
      this.password = value;
   }

public List<FolioCancelacion> getFolios() {
	return folios;
}

public void setFolios(List<FolioCancelacion> folios) {
	this.folios = folios;
}


   
   
}
