/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Usuario
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetalleFactura implements EntidadBase, Serializable {

	private static final long serialVersionUID = 1L;
	private Long idDetalle;
	private String descripcion;
	private Short cantidad;
	private BigDecimal valorUnitario;
	private BigDecimal valorTotal;
	private BigDecimal iva;
	private BigDecimal retefuente;
	private Long idFactura;
	private Long baseIva;
	private BigDecimal valorIva;
	private Long valorRetefuente;
	private Long baseRetefuente;
	private Date feModifica;
	private String usuarioIngreso;
	private String usuarioModifica;
	private Date feProceso;
	private String observaciones;

	public DetalleFactura() {
	}

	public DetalleFactura(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Short getCantidad() {
		return cantidad;
	}

	public void setCantidad(Short cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getRetefuente() {
		return retefuente;
	}

	public void setRetefuente(BigDecimal retefuente) {
		this.retefuente = retefuente;
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDetalle != null ? idDetalle.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof DetalleFactura)) {
			return false;
		}
		DetalleFactura other = (DetalleFactura) object;
		if ((this.idDetalle == null && other.idDetalle != null)
				|| (this.idDetalle != null && !this.idDetalle
						.equals(other.idDetalle))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.gea.entidades.DetalleFactura[ idDetalle=" + idDetalle
				+ " ]";
	}

	public Long getBaseIva() {
		return baseIva;
	}

	public void setBaseIva(Long baseIva) {
		this.baseIva = baseIva;
	}

	public BigDecimal getValorIva() {
		return valorIva;
	}

	public void setValorIva(BigDecimal valorIva) {
		this.valorIva = valorIva;
	}

	public Long getValorRetefuente() {
		return valorRetefuente;
	}

	public void setValorRetefuente(Long valorRetefuente) {
		this.valorRetefuente = valorRetefuente;
	}

	public Long getBaseRetefuente() {
		return baseRetefuente;
	}

	public void setBaseRetefuente(Long baseRetefuente) {
		this.baseRetefuente = baseRetefuente;
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

	@Override
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	@Override
	public Date getFeProceso() {
		return feProceso;
	}

	@Override
	public void setFeProceso(Date feProceso) {
		this.feProceso = feProceso;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}