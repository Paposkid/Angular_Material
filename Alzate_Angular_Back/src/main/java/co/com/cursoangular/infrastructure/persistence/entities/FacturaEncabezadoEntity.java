package co.com.cursoangular.infrastructure.persistence.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the tbl_enc_factura database table.
 * 
 */
@Entity
@Table(name="tbl_enc_factura")
@XmlRootElement
public class FacturaEncabezadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ENC_FACTURA_CODIGO_GENERATOR", sequenceName="SEQ_TBL_ENC_FACTURA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="TBL_ENC_FACTURA_CODIGO_GENERATOR")
	private Integer codigo;

	@Column(name="fecha_factura")
	private Timestamp fechaFactura;

	@Column(name="nro_factura")
	private String nroFactura;

	@Column(name="valor_total")
	private BigDecimal valorTotal;

	//bi-directional many-to-one association to FacturaEncabezadoEntity
	@ManyToOne
	@JoinColumn(name="codigo_cliente")
	private ClienteEntity clienteEntity;

	
	public FacturaEncabezadoEntity() {
	}

	
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Timestamp getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(Timestamp fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getNroFactura() {
		return this.nroFactura;
	}

	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}

	public BigDecimal getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ClienteEntity getClienteEntity() {
		return this.clienteEntity;
	}

	public void setClienteEntity(ClienteEntity clienteEntity) {
		this.clienteEntity = clienteEntity;
	}

}