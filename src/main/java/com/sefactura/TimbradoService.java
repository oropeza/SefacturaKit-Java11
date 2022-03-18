package com.sefactura;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

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
