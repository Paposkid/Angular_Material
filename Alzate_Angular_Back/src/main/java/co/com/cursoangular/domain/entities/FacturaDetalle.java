package co.com.cursoangular.domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;



public class FacturaDetalle implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private Integer cantidad;
	private Integer codigoFactura;
	private BigDecimal descuento;
	private BigDecimal precioVenta;
	private FacturaEncabezado facturaEncabezado;
	private Articulo articulo;

	public FacturaDetalle() {

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

	public FacturaEncabezado getFacturaEncabezado() {
		
		if (facturaEncabezado == null) {
			
			facturaEncabezado = new FacturaEncabezado();
		}
		
		return facturaEncabezado;
	}

	public void setFacturaEncabezado(FacturaEncabezado facturaEncabezado) {
		this.facturaEncabezado = facturaEncabezado;
	}

	public Articulo getArticulo() {
		
		if (articulo == null) {
			
			articulo = new Articulo();
		}
		
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}
	

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof FacturaDetalle)) {
			return false;
		}
		
		FacturaDetalle other = (FacturaDetalle) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "FacturaDetalle [codigo=" + codigo + ", cantidad=" + cantidad + ", codigoFactura=" + codigoFactura
				+ ", descuento=" + descuento + ", precioVenta=" + precioVenta + ", facturaEncabezado="
				+ facturaEncabezado + ", articulo=" + articulo + "]";
	}

	
	
	
}
