/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import co.com.cursoangular.rest.entities.DetalleFacturaRest;

/**
 *
 * @author Usuario
 */
public class Factura implements EntidadBase, Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long numeroFact;
	private Date fechaFactura;
	private BigDecimal iva;
	private BigDecimal retefuente;
	private BigDecimal facturasVencidas;
	private BigDecimal descuento;
	private BigDecimal total;
	private Date feProceso;
	private Date feModifica;
	private Integer periodo;
	private String usuarioModifica;
	private String usuarioIngreso;
	private Long baseIva;
	private BigDecimal valorIva;
	private Long valorRetencion;
	private Long baseRetencion;
	private Collection<DetalleFacturaRest> detallesFactura;
	private BigDecimal subtotal;
	private Integer diasVence;
	private BigDecimal abonos;
	private String observaciones;
	private String prefijo;
	private String numeroFormato;
	private String centroCosto;
	private Date feAprobacion;
	private Date fechaVence;
	private String separacion;
	private Persona tercero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroFact() {
		return numeroFact;
	}

	public void setNumeroFact(Long numeroFact) {
		this.numeroFact = numeroFact;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
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

	public BigDecimal getFacturasVencidas() {
		return facturasVencidas;
	}

	public void setFacturasVencidas(BigDecimal facturasVencidas) {
		this.facturasVencidas = facturasVencidas;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getFeProceso() {
		return feProceso;
	}

	public void setFeProceso(Date feProceso) {
		this.feProceso = feProceso;
	}

	public Date getFeModifica() {
		return feModifica;
	}

	public void setFeModifica(Date feModifica) {
		this.feModifica = feModifica;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}

	public void setUsuarioIngreso(String usuarioIngreso) {
		this.usuarioIngreso = usuarioIngreso;
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

	public Long getValorRetencion() {
		return valorRetencion;
	}

	public void setValorRetencion(Long valorRetencion) {
		this.valorRetencion = valorRetencion;
	}

	public Long getBaseRetencion() {
		return baseRetencion;
	}

	public void setBaseRetencion(Long baseRetencion) {
		this.baseRetencion = baseRetencion;
	}

	public Collection<DetalleFacturaRest> getDetallesFactura() {
		return detallesFactura;
	}

	public void setDetallesFactura(Collection<DetalleFacturaRest> detallesFactura) {
		this.detallesFactura = detallesFactura;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getDiasVence() {
		return diasVence;
	}

	public void setDiasVence(Integer diasVence) {
		this.diasVence = diasVence;
	}

	public BigDecimal getAbonos() {
		return abonos;
	}

	public void setAbonos(BigDecimal abonos) {
		this.abonos = abonos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}

	public String getNumeroFormato() {
		return numeroFormato;
	}

	public void setNumeroFormato(String numeroFormato) {
		this.numeroFormato = numeroFormato;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public Date getFeAprobacion() {
		return feAprobacion;
	}

	public void setFeAprobacion(Date feAprobacion) {
		this.feAprobacion = feAprobacion;
	}

	public Date getFechaVence() {
		return fechaVence;
	}

	public void setFechaVence(Date fechaVence) {
		this.fechaVence = fechaVence;
	}

	public String getSeparacion() {
		return separacion;
	}

	public void setSeparacion(String separacion) {
		this.separacion = separacion;
	}
	
	public Persona getTercero() {
		return tercero;
	}
	
	public void setTercero(Persona tercero) {
		this.tercero = tercero;
	}
}