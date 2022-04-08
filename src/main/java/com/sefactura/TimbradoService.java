package com.sefactura;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

@WebService(
   name = "TimbradoService",
   targetNamespace = "http://sefactura.com"
)
@XmlSeeAlso({ObjectFactory.class})
public interface TimbradoService {

	
   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "cancelacion40",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.Cancelacion40"
   )
   @ResponseWrapper(
      localName = "cancelacion40Response",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.Cancelacion40Response"
   )
   String cancelacion40(@WebParam(name = "solicitud",targetNamespace = "") SolCancelacion40 var1, @WebParam(name = "usuario",targetNamespace = "") String var2, @WebParam(name = "clave",targetNamespace = "") String var3);   
   
   
   @WebMethod
   @WebResult(
      targetNamespace = ""
   )
   @RequestWrapper(
      localName = "timbrado",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.Timbrado"
   )
   @ResponseWrapper(
      localName = "timbradoResponse",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.TimbradoResponse"
   )
   Resultado timbrado(@WebParam(name = "cfdi",targetNamespace = "") String var1, @WebParam(name = "usuario",targetNamespace = "") String var2, @WebParam(name = "clave",targetNamespace = "") String var3);
}
