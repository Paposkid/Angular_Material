package co.com.cursoangular.infrastructure.persistence.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;


/**
 * The persistent class for the tbl_det_factura database table.
 * 
 */
@Entity
@Table(name="tbl_det_factura")
@XmlRootElement
public class FacturaDetalleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_DET_FACTURA_CODIGO_GENERATOR", sequenceName="SEQ_TBL_DET_FACTURA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="TBL_DET_FACTURA_CODIGO_GENERATOR")
	private Integer codigo;

	private Integer cantidad;

	@Column(name="codigo_factura")
	private Integer codigoFactura;

	private BigDecimal descuento;

	@Column(name="precio_venta")
	private BigDecimal precioVenta;

	//bi-directional many-to-one association to FacturaDetalleEntity
	@ManyToOne
	@JoinColumn(name="codigo_articulo")
	private ArticuloEntity articuloEntity;

	
	public FacturaDetalleEntity() {
	}

	
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCodigoFactura() {
		return this.codigoFactura;
	}

	public void setCodigoFactura(Integer codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public BigDecimal getDescuento() {
		return this.descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public ArticuloEntity getArticuloEntity() {
		return this.articuloEntity;
	}

	public void setArticuloEntity(ArticuloEntity articuloEntity) {
		this.articuloEntity = articuloEntity;
	}

}