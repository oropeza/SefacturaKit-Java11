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
      localName = "cancelacion",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.Cancelacion"
   )
   @ResponseWrapper(
      localName = "cancelacionResponse",
      targetNamespace = "http://sefactura.com",
      className = "com.sefactura.CancelacionResponse"
   )
   String cancelacion(@WebParam(name = "solicitud",targetNamespace = "") SolCancelacion var1, @WebParam(name = "usuario",targetNamespace = "") String var2, @WebParam(name = "clave",targetNamespace = "") String var3);

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
