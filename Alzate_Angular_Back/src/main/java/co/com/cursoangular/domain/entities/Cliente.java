package co.com.cursoangular.domain.entities;

import java.io.Serializable;



public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private String tipoDcto;
	private String nroDcto;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String celular;
	private String email;
	
	
	public Cliente() {

	}

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Cliente)) {
			return false;
		}
		
		Cliente other = (Cliente) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", tipoDcto=" + tipoDcto + ", nroDcto=" + nroDcto + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", celular="
				+ celular + ", email=" + email + "]";
	}
	
}
