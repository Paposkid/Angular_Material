package co.com.cursoangular.rest.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentoIdentidadRest implements Serializable {

	private static final long serialVersionUID = 1L;


	private String tipoDcto; 
	private String nroDcto;
	
	public DocumentoIdentidadRest() {

	}

	public String getTipoDcto() {
		return tipoDcto;
	}

	public void setTipoDcto(String tipoDcto) {
		this.tipoDcto = tipoDcto;
	}

	public String getNroDcto() {
		return nroDcto;
	}

	public void setNroDcto(String nroDcto) {
		this.nroDcto = nroDcto;
	}

	@Override
	public String toString() {
		return "DocumentoIdentidad [tipoDcto=" + tipoDcto + ", nroDcto=" + nroDcto + "]";
	}

}
