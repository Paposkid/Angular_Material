/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.infrastructure.persistence.entities;

import static org.eclipse.persistence.annotations.MultitenantType.TABLE_PER_TENANT;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.annotations.Multitenant;
import org.eclipse.persistence.annotations.TenantTableDiscriminator;
import org.eclipse.persistence.annotations.TenantTableDiscriminatorType;

/**
 *
 * @author jialzate
 */
@Entity
@Multitenant(TABLE_PER_TENANT)
@TenantTableDiscriminator(contextProperty = "eclipselink.tenant-id", type = TenantTableDiscriminatorType.SCHEMA)
@Table(name = "\"Area\"")
@XmlRootElement
public class AreaEntity implements EntidadBaseEntity, Serializable {

	@Column(name = "\"feProceso\"")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feProceso;
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "\"cdArea\"", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cdArea;
	@Basic(optional = false)
	@Column(name = "\"strArea\"", nullable = false, length = 50)
	private String strArea;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Basic(optional = false)
	@Column(name = "\"nmMedida\"", nullable = false, precision = 9, scale = 3)
	private BigDecimal nmMedida;
	@Column(name = "\"vmAdministracion\"")
	private Long vmAdministracion;
	@Column(name = "\"nmIndiceCopropiedad\"", precision = 5, scale = 3)
	private BigDecimal nmIndiceCopropiedad;
	@Column(name = "\"usuarioModifica\"")
	private String usuarioModifica;
	@Column(name = "\"usuarioIngreso\"")
	private String usuarioIngreso;
	@Column(name = "\"feModifica\"")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feModifica;

	public AreaEntity() {
	}

	public AreaEntity(Long cdArea) {
		this.cdArea = cdArea;
	}

	public AreaEntity(Long cdArea, String strArea, BigDecimal nmMedida) {
		this.cdArea = cdArea;
		this.strArea = strArea;
		this.nmMedida = nmMedida;
	}

	public Long getCdArea() {
		return cdArea;
	}

	public void setCdArea(Long cdArea) {
		this.cdArea = cdArea;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public BigDecimal getNmMedida() {
		return nmMedida;
	}

	public void setNmMedida(BigDecimal nmMedida) {
		this.nmMedida = nmMedida;
	}

	public Long getVmAdministracion() {
		return vmAdministracion;
	}

	public void setVmAdministracion(Long vmAdministracion) {
		this.vmAdministracion = vmAdministracion;
	}

	public BigDecimal getNmIndiceCopropiedad() {
		return nmIndiceCopropiedad;
	}

	public void setNmIndiceCopropiedad(BigDecimal nmIndiceCopropiedad) {
		this.nmIndiceCopropiedad = nmIndiceCopropiedad;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cdArea != null ? cdArea.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof AreaEntity)) {
			return false;
		}
		AreaEntity other = (AreaEntity) object;
		if ((this.cdArea == null && other.cdArea != null)
				|| (this.cdArea != null && !this.cdArea.equals(other.cdArea))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getClass() + "[ cdArea=" + cdArea + " ]";
	}

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
	public void setFeModifica(Date date) {
		feModifica = date;
	}

	@Override
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	@Override
	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}

	@Override
	public void setUsuarioIngreso(String usuarioIngreso) {
		this.usuarioIngreso = usuarioIngreso;
	}

	@Override
	public String getUsuarioModifica() {
		return usuarioModifica;
	}
}
