/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.rest.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author jialzate
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoRest implements Serializable {

	public TipoRest() {
		// TODO Auto-generated constructor stub
	}

	public TipoRest(String id, String descripcion) {

		this.id = id;
		this.descripcion = descripcion;
	}

	private String id;
	private String descripcion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}