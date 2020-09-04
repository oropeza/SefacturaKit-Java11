package com.sefactura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
   private static final QName _TimbradoResponse_QNAME = new QName("http://sefactura.com", "timbradoResponse");
   private static final QName _Timbrado_QNAME = new QName("http://sefactura.com", "timbrado");
   private static final QName _CancelacionResponse_QNAME = new QName("http://sefactura.com", "cancelacionResponse");
   private static final QName _Cancelacion_QNAME = new QName("http://sefactura.com", "cancelacion");

   public SolCancelacion createSolCancelacion() {
      return new SolCancelacion();
   }

   public TimbradoResponse createTimbradoResponse() {
      return new TimbradoResponse();
   }

   public Cancelacion createCancelacion() {
      return new Cancelacion();
   }

   public CancelacionResponse createCancelacionResponse() {
      return new CancelacionResponse();
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
      name = "cancelacionResponse"
   )
   public JAXBElement<CancelacionResponse> createCancelacionResponse(CancelacionResponse value) {
      return new JAXBElement(_CancelacionResponse_QNAME, CancelacionResponse.class, (Class)null, value);
   }

   @XmlElementDecl(
      namespace = "http://sefactura.com",
      name = "cancelacion"
   )
   public JAXBElement<Cancelacion> createCancelacion(Cancelacion value) {
      return new JAXBElement(_Cancelacion_QNAME, Cancelacion.class, (Class)null, value);
   }
}
