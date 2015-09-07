package co.com.cursoangular.infrastructure.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name="tbl_articulo")
@XmlRootElement
public class ArticuloEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TBL_ARTICULO_CODIGO_GENERATOR", sequenceName="SEQ_TBL_ARTICULO", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="TBL_ARTICULO_CODIGO_GENERATOR")
	@Column(name = "codigo", unique=true, nullable=false)	
	private Integer codigo;

	@Column(name = "nombre")
	private String nombre;

	public ArticuloEntity() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}