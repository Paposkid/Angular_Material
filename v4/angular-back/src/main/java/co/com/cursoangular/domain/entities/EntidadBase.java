/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cursoangular.domain.entities;

import java.util.Date;

/**
 *
 * @author usuario
 */
public interface EntidadBase {

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
