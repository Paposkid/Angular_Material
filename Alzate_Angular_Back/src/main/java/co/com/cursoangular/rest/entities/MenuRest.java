/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.rest.entities;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class MenuRest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String label;
	private String id;
	private String url;
	
	public MenuRest(String label, String id, String url) {
		super();
		this.label = label;
		this.id = id;
		this.url = url;
	}

	public MenuRest() {
	
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}