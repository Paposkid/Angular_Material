/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.infrastructure.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.annotations.BatchFetch;
import org.eclipse.persistence.annotations.BatchFetchType;


@Entity
@Table(name = "tbl_persona")
@XmlRootElement
//@Multitenant(TABLE_PER_TENANT)
//@TenantTableDiscriminator(contextProperty = "eclipselink.tenant-id", type = TenantTableDiscriminatorType.SCHEMA)
public class PersonaEntity implements EntidadBaseEntity, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="TBL_PERSONA_CODIGO_GENERATOR",sequenceName = "SEQ_TBL_PERSONA",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="TBL_PERSONA_CODIGO_GENERATOR")
	@Column(name = "cdPersona", unique=true, nullable=false)
	private Long cdPersona;
	@Column(name = "feProceso", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date feProceso;
	@Column(name = "feModifica")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feModifica;
	@Size(max = 30)
	@Column(name = "strNombres", length = 30)
	private String strNombres;
	@Size(max = 30)
	@Column(name = "strApellidos", length = 30)
	private String strApellidos;
	@Column(name = "nmDocumento")
	private Long nmDocumento;
	@Size(max = 50)
	@Column(name = "strDireccion", length = 50)
	private String strDireccion;
	@Size(max = 30)
	@Column(name = "strTelefono1", length = 30)
	private String strTelefono1;
	@Size(max = 30)
	@Column(name = "strCelular", length = 30)
	private String strCelular;
	@Size(max = 50)
	@Column(name = "strEmail", length = 50)
	private String strEmail;
	@BatchFetch(BatchFetchType.JOIN)
	@Column(name = "usuarioIngreso")
	private String usuarioIngreso;
	@Size(max = 4)
	@Column(name = "strTipoDocumento", length = 4)
	private String strTipoDocumento;
	@Size(max = 5)
	@Column(name = "strNaturaleza", length = 5)
	private String strNaturaleza;
	@Size(max = 1)
	@Column(name = "strDigitoVerificacion", length = 1)
	private String strDigitoVerificacion;
	@Column(name = "propietario", length = 1)
	private Boolean propietario;
	@Column(name = "inquilino", length = 1)
	private Boolean inquilino;
	@Column(name = "tercero", length = 1)
	private Boolean tercero;
	@Transient
	private String strNombresYApellidos;
	@Column(name = "usuarioModifica")
	private String usuarioModifica;
	@Column(name = "empleado")
	private Boolean empleado;
	@Column(name = "genero")
	private String genero;
	@Column(name = "telOficina")
	private String telOficina;
	@Column(name = "fechaNacimiento", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimiento;

	@Size(max = 30)
	@Column(name = "segundoNombre", length = 30)
	private String segundoNombre;

	@Size(max = 30)
	@Column(name = "segundoApellido", length = 30)
	private String segundoApellido;

	public PersonaEntity() {
	}

	public PersonaEntity(Long cdPersona) {
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
		if (!(object instanceof PersonaEntity)) {
			return false;
		}
		PersonaEntity other = (PersonaEntity) object;
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
	@Override
	public Date getFeProceso() {
		return feProceso;
	}

	@Override
	public void setFeProceso(Date feProceso) {
		this.feProceso = feProceso;
	}

	@Override
	public Date getFeModifica() {
		return feModifica;
	}

	@Override
	public void setFeModifica(Date feModifica) {
		this.feModifica = feModifica;
	}

	@Override
	public void setUsuarioIngreso(String usuario) {
		this.usuarioIngreso = usuario;
	}

	@Override
	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}

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

	@Override
	public void setUsuarioModifica(String usuario) {
		usuarioModifica = usuario;
	}

	@Override
	public String getUsuarioModifica() {
		return usuarioModifica;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}