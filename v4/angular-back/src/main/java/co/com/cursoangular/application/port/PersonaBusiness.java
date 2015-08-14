package co.com.cursoangular.application.port;

import java.util.Collection;

import co.com.cursoangular.domain.entities.Persona;

public interface PersonaBusiness {

	Persona find(Long id);

	Persona findByDocumento(Long id);

	Persona save(Persona propiedad);

	void delete(Persona dpropiedad);

	Collection<Persona> findRange(int ini, int fin);

	Collection<Persona> findAll();

	Collection<Persona> findByName(String query);

	Integer generarDV(Long documento);

	// Collection<Persona> filter(Persona persona, Collection<FiltroEntity> filtro);
}
