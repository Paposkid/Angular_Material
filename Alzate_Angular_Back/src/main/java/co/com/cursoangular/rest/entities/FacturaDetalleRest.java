package co.com.cursoangular.rest.entities;


import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.cursoangular.domain.entities.Articulo;
import co.com.cursoangular.domain.entities.FacturaEncabezado;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FacturaDetalleRest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private Integer cantidad;
	private Integer codigoFactura;
	private BigDecimal descuento;
	private BigDecimal precioVenta;
	private FacturaEncabezadoRest facturaEncabezadoRest;
	private ArticuloRest articuloRest;

	
	public FacturaDetalleRest() {
		
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(Integer codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public FacturaEncabezadoRest getFacturaEncabezadoRest() {
		return facturaEncabezadoRest;
	}

	public void setFacturaEncabezadoRest(FacturaEncabezadoRest facturaEncabezadoRest) {
		this.facturaEncabezadoRest = facturaEncabezadoRest;
	}

	public ArticuloRest getArticuloRest() {
		return articuloRest;
	}

	public void setArticuloRest(ArticuloRest articuloRest) {
		this.articuloRest = articuloRest;
	}


	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof FacturaDetalleRest)) {
			return false;
		}
		
		FacturaDetalleRest other = (FacturaDetalleRest) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "FacturaDetalleRest [codigo=" + codigo + ", cantidad=" + cantidad + ", codigoFactura=" + codigoFactura
				+ ", descuento=" + descuento + ", precioVenta=" + precioVenta + ", facturaEncabezadoRest="
				+ facturaEncabezadoRest + ", articuloRest=" + articuloRest + "]";
	}
	
	
	
}

