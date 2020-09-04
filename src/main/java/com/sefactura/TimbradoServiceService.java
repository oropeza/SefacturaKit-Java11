package com.sefactura;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
   name = "TimbradoServiceService",
   targetNamespace = "http://sefactura.com",
   wsdlLocation = "http://www.jonima.com.mx:3014/sefacturapac/TimbradoService?wsdl"
)
public class TimbradoServiceService extends Service {
   private static final URL TIMBRADOSERVICESERVICE_WSDL_LOCATION;
   private static final Logger logger = Logger.getLogger(TimbradoServiceService.class.getName());

   public TimbradoServiceService(URL wsdlLocation, QName serviceName) {
      super(wsdlLocation, serviceName);
   }

   public TimbradoServiceService() {
      super(TIMBRADOSERVICESERVICE_WSDL_LOCATION, new QName("http://sefactura.com", "TimbradoServiceService"));
   }

   @WebEndpoint(
      name = "TimbradoServicePort"
   )
   public TimbradoService getTimbradoServicePort() {
      return (TimbradoService)super.getPort(new QName("http://sefactura.com", "TimbradoServicePort"), TimbradoService.class);
   }

   @WebEndpoint(
      name = "TimbradoServicePort"
   )
   public TimbradoService getTimbradoServicePort(WebServiceFeature... features) {
      return (TimbradoService)super.getPort(new QName("http://sefactura.com", "TimbradoServicePort"), TimbradoService.class, features);
   }

   static {
      URL url = null;

      try {
         URL baseUrl = TimbradoServiceService.class.getResource(".");
         url = new URL(baseUrl, "http://www.jonima.com.mx:3014/sefacturapac/TimbradoService?wsdl");
      } catch (MalformedURLException var2) {
         logger.warning("Failed to create URL for the wsdl Location: 'http://www.jonima.com.mx:3014/sefacturapac/TimbradoService?wsdl', retrying as a local file");
         logger.warning(var2.getMessage());
      }

      TIMBRADOSERVICESERVICE_WSDL_LOCATION = url;
   }
}
