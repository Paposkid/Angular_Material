/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.rest.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author jialzate
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaRest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long cdPersona;
	private Date feProceso;
	private Date feModifica;
	private String strNombres;
	private String strApellidos;
	private Long nmDocumento;
	private String strDireccion;
	private String strTelefono1;
	private String telOficina;
	private String strCelular;
	private String strEmail;
	private String usuarioIngreso;
	private String strTipoDocumento;
	private String strNaturaleza;
	private String strDigitoVerificacion;
	private Boolean propietario;
	private Boolean inquilino;
	private Boolean tercero;
	private String strNombresYApellidos;
	private String usuarioModifica;
	private Boolean empleado;
	private String genero;
	private Date fechaNacimiento;
	private String segundoNombre;
	private String segundoApellido;

	public PersonaRest() {
	}

	public PersonaRest(Long cdPersona) {
		this.cdPersona = cdPersona;
	}

	public Long getCdPersona() {
		return cdPersona;
	}

	public void setCdPersona(Long cdPersona) {
		this.cdPersona = cdPersona;
	}

	public String getStrNombres() {
		return strNombres;
	}

	public void setStrNombres(String strNombres) {
		this.strNombres = strNombres;

		setStrNombresYApellidos((getStrNombres() + " " + getStrApellidos()).trim());
	}

	public String getStrApellidos() {
		return strApellidos;
	}

	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;

		setStrNombresYApellidos((getStrNombres() + " " + getStrApellidos()).trim());
	}

	public Long getNmDocumento() {
		return nmDocumento;
	}

	public void setNmDocumento(Long nmDocumento) {
		this.nmDocumento = nmDocumento;
	}

	public String getStrDireccion() {
		return strDireccion;
	}

	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}

	public String getStrTelefono1() {
		return strTelefono1;
	}

	public void setStrTelefono1(String strTelefono1) {
		this.strTelefono1 = strTelefono1;
	}

	public String getStrCelular() {
		return strCelular;
	}

	public void setStrCelular(String strCelular) {
		this.strCelular = strCelular;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrTipoDocumento() {
		return strTipoDocumento;
	}

	public void setStrTipoDocumento(String strTipoDocumento) {
		this.strTipoDocumento = strTipoDocumento;
	}

	public String getStrNaturaleza() {
		return strNaturaleza;
	}

	public void setStrNaturaleza(String strNaturaleza) {
		this.strNaturaleza = strNaturaleza;
	}

	public String getStrDigitoVerificacion() {
		return strDigitoVerificacion;
	}

	public void setStrDigitoVerificacion(String strDigitoVerificacion) {
		this.strDigitoVerificacion = strDigitoVerificacion;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cdPersona != null ? cdPersona.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof PersonaRest)) {
			return false;
		}
		PersonaRest other = (PersonaRest) object;
		if ((this.cdPersona == null && other.cdPersona != null)
				|| (this.cdPersona != null && !this.cdPersona.equals(other.cdPersona))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getClass() + "[ cdPersona=" + cdPersona + " ]";
	}

	public String getStrNombresYApellidos() {
		return (getStrNombres() + " " + getStrApellidos()).trim();
	}

	public void setStrNombresYApellidos(String strNombresYApellidos) {
		this.strNombresYApellidos = strNombresYApellidos;
	}

	/*
	 * @XmlTransient public Collection<DocumentoXEgreso>
	 * getDocumentoXEgresoCollection() { return documentoXEgresoCollection; }
	 * 
	 * public void setDocumentoXEgresoCollection(Collection<DocumentoXEgreso>
	 * documentoXEgresoCollection) { this.documentoXEgresoCollection =
	 * documentoXEgresoCollection; }
	 */

	public Boolean getPropietario() {

		return propietario;
	}

	public void setPropietario(Boolean propietario) {
		this.propietario = propietario;
	}

	public Boolean getTercero() {

		return tercero;
	}

	public void setTercero(Boolean tercero) {
		this.tercero = tercero;
	}

	public void setInquilino(Boolean inquilino) {
		this.inquilino = inquilino;
	}

	public Boolean getInquilino() {

		return inquilino;
	}

	public Boolean getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Boolean empleado) {
		this.empleado = empleado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelOficina() {
		return telOficina;
	}

	public void setTelOficina(String telOficina) {
		this.telOficina = telOficina;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
}