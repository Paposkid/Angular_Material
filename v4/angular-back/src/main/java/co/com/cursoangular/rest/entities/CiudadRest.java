package co.com.cursoangular.rest.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class CiudadRest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private String nombre;
	
	
	public CiudadRest() {
		
	}

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CiudadRest)) {
			return false;
		}
		
		CiudadRest other = (CiudadRest) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}
	

	@Override
	public String toString() {
		return "CiudadRest [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
}
