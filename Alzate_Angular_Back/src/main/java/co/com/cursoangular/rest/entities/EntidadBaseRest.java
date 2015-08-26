/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.rest.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author usuario
 */
@JsonInclude(Include.NON_NULL)
public interface EntidadBaseRest {

    // Toda entidad debe tener una fecha de ingreso al sistema.
    public Date getFeProceso();

    public void setFeProceso(Date date);

    public Date getFeModifica();

    public void setFeModifica(Date date);

    public void setUsuarioIngreso(String usuario);

    public String getUsuarioIngreso();

    public void setUsuarioModifica(String usuario);

    public String getUsuarioModifica();
}
