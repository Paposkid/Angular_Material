package co.com.cursoangular.application.port;

import java.util.Collection;

import co.com.cursoangular.domain.entities.Persona;

public interface TerceroBusiness {

	Persona salvar(Persona Persona);

	void delete(Persona core);

	Collection<Persona> findAll();

	Persona getByDocumento(Long numero);	
}