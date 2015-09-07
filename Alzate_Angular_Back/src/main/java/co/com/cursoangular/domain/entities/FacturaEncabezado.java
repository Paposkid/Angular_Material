package co.com.cursoangular.domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


public class FacturaEncabezado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private Timestamp fechaFactura;
	private String nroFactura;
	private BigDecimal valorTotal;
	private Cliente cliente;
	
	
	public FacturaEncabezado() {

	}

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Timestamp getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Timestamp fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		
		if (cliente == null) {
			
			cliente = new Cliente();
		}
		
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	
	@Override
	public boolean equals(Object object) {

		if (!(object instanceof FacturaEncabezado)) {
			return false;
		}
		
		FacturaEncabezado other = (FacturaEncabezado) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "FacturaEncabezado [codigo=" + codigo + ", fechaFactura=" + fechaFactura + ", nroFactura=" + nroFactura
				+ ", valorTotal=" + valorTotal + ", cliente=" + cliente + "]";
	}


}
