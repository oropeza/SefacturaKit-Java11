
# SefacturaKit Java 11


Adaptación del kit de desarrollo original de SeFactura para que sea compatible con Java 11. Solo queria poder reemplazar el .jar sin modificar el código existente. 


* Se decompiló en <http://www.decompiler.com/>
* Ajuste  com.sefactura.pac.client.Sefactura

Soluciona error con *sun.misc.BASE64Encoder* cambiandolo por *java.util.Base64*


<https://www.oracle.com/java/technologies/faq-sun-packages.html>



**Maven Dependencias requeridas para usar el jar**


```
<dependency>
	<groupId>javax.xml.bind</groupId>
	<artifactId>jaxb-api</artifactId>
	<version>2.3.1</version>
</dependency>
<dependency>
	<groupId>javax.xml.ws</groupId>
	<artifactId>jaxws-api</artifactId>
	<version>2.3.1</version>
</dependency>
<dependency>
	<groupId>javax.jws</groupId>
	<artifactId>javax.jws-api</artifactId>
	<version>1.1</version>
</dependency>
<dependency>
	<groupId>com.sun.xml.ws</groupId>
	<artifactId>rt</artifactId>
	<version>2.3.1</version>
</dependency>
```


**TODO** 

Fix

```
javax.xml.ws.WebServiceException: Provider com.sun.xml.internal.ws.spi.ProviderImpl not found
```
