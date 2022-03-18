package com.sefactura;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "folioCancelacion",
   propOrder = {"folioSustitucion", "motivo", "uuid"}
)
public class FolioCancelacion {
   
	public FolioCancelacion(String uuid,String motivo,String folioSustitucion) {
		super();
		this.folioSustitucion = folioSustitucion;
		this.motivo = motivo;
		this.uuid = uuid;
	}
	
	
	String folioSustitucion;
	String motivo;
	String uuid;
	public String getFolioSustitucion() {
		return folioSustitucion;
	}
	public void setFolioSustitucion(String folioSustitucion) {
		this.folioSustitucion = folioSustitucion;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	
	

}
