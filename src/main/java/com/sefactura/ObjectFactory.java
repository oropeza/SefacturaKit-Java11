package com.sefactura;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
   private static final QName _TimbradoResponse_QNAME = new QName("http://sefactura.com", "timbradoResponse");
   private static final QName _Timbrado_QNAME = new QName("http://sefactura.com", "timbrado");
   private static final QName _Cancelacion40Response_QNAME = new QName("http://sefactura.com", "cancelacion40Response");
   private static final QName _Cancelacion40_QNAME = new QName("http://sefactura.com", "cancelacion40");

   public SolCancelacion40 createSolCancelacion40() {
      return new SolCancelacion40();
   }

   public TimbradoResponse createTimbradoResponse() {
      return new TimbradoResponse();
   }

   public Cancelacion40 createCancelacion40() {
      return new Cancelacion40();
   }

   public Cancelacion40Response createCancelacion40Response() {
      return new Cancelacion40Response();
   }

   public Resultado createResultado() {
      return new Resultado();
   }

   public Timbrado createTimbrado() {
      return new Timbrado();
   }

   @XmlElementDecl(
      namespace = "http://sefactura.com",
      name = "timbradoResponse"
   )
   public JAXBElement<TimbradoResponse> createTimbradoResponse(TimbradoResponse value) {
      return new JAXBElement(_TimbradoResponse_QNAME, TimbradoResponse.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "http://sefactura.com",
      name = "timbrado"
   )
   public JAXBElement<Timbrado> createTimbrado(Timbrado value) {
      return new JAXBElement(_Timbrado_QNAME, Timbrado.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "http://sefactura.com",
      name = "cancelacion40Response"
   )
   public JAXBElement<Cancelacion40Response> createCancelacion40Response(Cancelacion40Response value) {
      return new JAXBElement(_Cancelacion40Response_QNAME, Cancelacion40Response.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "http://sefactura.com",
      name = "cancelacion40"
   )
   public JAXBElement<Cancelacion40> createCancelacion40(Cancelacion40 value) {
      return new JAXBElement(_Cancelacion40_QNAME, Cancelacion40.class, (Class)null, value);
   }
}
