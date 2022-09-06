package com.sefactura.pac.client;

import com.sefactura.FolioCancelacion;
import com.sefactura.Resultado;
import com.sefactura.SolCancelacion40;
import com.sefactura.TimbradoService;
import com.sefactura.TimbradoServiceService;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;

import javax.swing.ImageIcon;
import javax.xml.namespace.QName;


public class Sefactura {
   private String host = null;
   private String usuario = null;
   private String clave = null;

   private Sefactura() {
   }

   public Sefactura(String host, String usuario, String clave) {
      if (!host.endsWith("/")) {
         host = host + "/";
      }

      this.host = host;
      this.usuario = usuario;
      this.clave = clave;
   }

   public RespuestaTimbrado timbrado(String xml) throws Exception {
      URL wsdlLocation = new URL(this.host + "sefacturapac/TimbradoService?wsdl");
      QName serviceName = new QName("http://sefactura.com", "TimbradoServiceService");
      TimbradoServiceService svc = new TimbradoServiceService(wsdlLocation, serviceName);
      TimbradoService port = svc.getTimbradoServicePort();
      Resultado result = port.timbrado(xml, this.usuario, this.clave);
      RespuestaTimbrado rt = new RespuestaTimbrado();
      rt.setXml(result.getTimbre());
      rt.setResultado(result.getStatus());
      String codBar = result.getCodigo();
      if (codBar != null && codBar.length() > 0) {
         rt.setCadenaCodigo(codBar);
         
         //Decoder Fix
         //BASE64Decoder decoder = new BASE64Decoder();
         //byte[] bytes = decoder.decodeBuffer(codBar);
         byte[] bytes = Base64.getDecoder().decode(codBar);

         ImageIcon ii = new ImageIcon(bytes);
         rt.setImagen(ii.getImage());
      }

      return rt;
   }

   private byte[] leeArchivo(String nombre) throws Exception {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      FileInputStream fis = new FileInputStream(nombre);
      byte[] bytes = new byte[100000];
      boolean var5 = false;

      int cuantos;
      while((cuantos = fis.read(bytes)) >= 0) {
         baos.write(bytes, 0, cuantos);
      }

      fis.close();
      return baos.toByteArray();
   }

<<<<<<< Updated upstream
 
   
   public String cancela40(String uuid, String motivo, String folioSustitucion,String archivoKey, String archivoCer, String pwd) throws Exception {
=======
   public String cancela(String uuid, String archivoKey, String archivoCer, String pwd) throws Exception {
      URL wsdlLocation = new URL(this.host + "sefacturapac/TimbradoService?wsdl");
      QName serviceName = new QName("http://sefactura.com", "TimbradoServiceService");
      TimbradoServiceService svc = new TimbradoServiceService(wsdlLocation, serviceName);
      TimbradoService port = svc.getTimbradoServicePort();
      SolCancelacion sol = new SolCancelacion();
      byte[] llaveEmi = this.leeArchivo(archivoKey);
      byte[] cerEmi = this.leeArchivo(archivoCer);
      
      
      
      // Encoder Fix
      String certificado =  Base64.getEncoder().encodeToString(cerEmi);
      String llave =  Base64.getEncoder().encodeToString(llaveEmi);
      String ciphertextString =  Base64.getEncoder().encodeToString(pwd.getBytes("UTF-8"));
      
      sol.setCertificado(certificado);
      sol.setLlavePrivada(llave);
      sol.setPassword(ciphertextString);
      sol.getUuid().add(uuid);
      return port.cancelacion(sol, this.usuario, this.clave);
   }
   public String cancela(String uuid,byte[] cerEmi, byte[] llaveEmi, String pwd) throws Exception {
>>>>>>> Stashed changes
	      URL wsdlLocation = new URL(this.host + "sefacturapac/TimbradoService?wsdl");
	      QName serviceName = new QName("http://sefactura.com", "TimbradoServiceService");
	      TimbradoServiceService svc = new TimbradoServiceService(wsdlLocation, serviceName);
	      TimbradoService port = svc.getTimbradoServicePort();
<<<<<<< Updated upstream
	      SolCancelacion40 sol = new SolCancelacion40();
	      byte[] llaveEmi = this.leeArchivo(archivoKey);
	      byte[] cerEmi = this.leeArchivo(archivoCer);
	      	      
=======
	      SolCancelacion sol = new SolCancelacion();
	      
	      
	      
>>>>>>> Stashed changes
	      
	      // Encoder Fix
	      String certificado =  Base64.getEncoder().encodeToString(cerEmi);
	      String llave =  Base64.getEncoder().encodeToString(llaveEmi);
	      String ciphertextString =  Base64.getEncoder().encodeToString(pwd.getBytes("UTF-8"));
	      
	      sol.setCertificado(certificado);
	      sol.setLlavePrivada(llave);
	      sol.setPassword(ciphertextString);
<<<<<<< Updated upstream
	      sol.setFolios(new ArrayList<FolioCancelacion>());
	      sol.getFolios().add(new FolioCancelacion(uuid,motivo,folioSustitucion));
	      	      	    
	      return port.cancelacion40(sol, this.usuario, this.clave);
	   }   
=======
	      sol.getUuid().add(uuid);
	      return port.cancelacion(sol, this.usuario, this.clave);
	   }
>>>>>>> Stashed changes
}
