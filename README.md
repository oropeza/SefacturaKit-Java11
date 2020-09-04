
# SefacturaKit Java 11


Adaptación personal del kit de desarrollo original de SeFactura para que sea compatible con Java 11. Solo queria poder reemplazar el .jar sin modificar el código existente. No es oficial. 


* Se decompiló en <http://www.decompiler.com/>
* Ajuste  com.sefactura.pac.client.Sefactura

Soluciona error con *sun.misc.BASE64Encoder* cambiandolo por *java.util.Base64*


<https://www.oracle.com/java/technologies/faq-sun-packages.html>



**Maven Dependencias requeridas para usar el jar**


```
<dependency>
    <groupId>jakarta.jws</groupId>
    <artifactId>jakarta.jws-api</artifactId>
    <version>2.1.0</version>
</dependency>
<dependency>
    <groupId>jakarta.xml.ws</groupId>
    <artifactId>jakarta.xml.ws-api</artifactId>
    <version>2.3.3</version>
</dependency>
<dependency>
	<groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>2.3.3</version>
    <scope>runtime</scope>
</dependency>
```


**TODO** 

Fix

```
javax.xml.ws.WebServiceException: Provider com.sun.xml.internal.ws.spi.ProviderImpl not found
```



**Referencias**  

Jakarta XML Web Services  
<https://eclipse-ee4j.github.io/metro-jax-ws/>  
<https://eclipse-ee4j.github.io/jaxb-ri/>