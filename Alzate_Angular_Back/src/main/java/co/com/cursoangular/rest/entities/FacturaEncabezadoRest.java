package co.com.cursoangular.rest.entities;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public class FacturaEncabezadoRest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer codigo;
	private Timestamp fechaFactura;
	private String nroFactura;
	private BigDecimal valorTotal;
	private ClienteRest clienteRest;
	
	public FacturaEncabezadoRest() {
		
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

	public ClienteRest getClienteRest() {
		return clienteRest;
	}

	public void setClienteRest(ClienteRest clienteRest) {
		this.clienteRest = clienteRest;
	}

	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof FacturaEncabezadoRest)) {
			return false;
		}
		
		FacturaEncabezadoRest other = (FacturaEncabezadoRest) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "FacturaEncabezadoRest [codigo=" + codigo + ", fechaFactura=" + fechaFactura + ", nroFactura="
				+ nroFactura + ", valorTotal=" + valorTotal + ", clienteRest=" + clienteRest + "]";
	}
	
	
}

