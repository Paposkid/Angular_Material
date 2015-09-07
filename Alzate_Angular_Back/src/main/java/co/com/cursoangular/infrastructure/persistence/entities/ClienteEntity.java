package co.com.cursoangular.infrastructure.persistence.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the tbl_cliente database table.
 * 
 */
@Entity
@Table(name="tbl_cliente")
@XmlRootElement
public class ClienteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_CLIENTE_CODIGO_GENERATOR", sequenceName="SEQ_TBL_CLIENTE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="TBL_CLIENTE_CODIGO_GENERATOR")
	private Integer codigo;

	@Column(name="tipo_dcto")
	private String tipoDcto;
	
	@Column(name="nro_dcto")
	private String nroDcto;
	
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String celular;
	private String email;

	
	public ClienteEntity() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDcto() {
		return this.nroDcto;
	}

	public void setNroDcto(String nroDcto) {
		this.nroDcto = nroDcto;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoDcto() {
		return this.tipoDcto;
	}

	public void setTipoDcto(String tipoDcto) {
		this.tipoDcto = tipoDcto;
	}

}