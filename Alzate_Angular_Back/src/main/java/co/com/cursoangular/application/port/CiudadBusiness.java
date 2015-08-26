package co.com.cursoangular.application.port;

import java.util.Collection;

import co.com.cursoangular.domain.entities.Ciudad;



public interface CiudadBusiness{


	Collection<Ciudad> findByName(String query);
	
	Collection<Ciudad> findAll();
	
	Collection<Ciudad> findRange(int ini, int fin);
	
	Ciudad find(Integer id);

	Ciudad save(Ciudad propiedad);

	void delete(Ciudad dpropiedad);
	
	//Collection<Ciudad> filter(Ciudad propiedad, Collection<FiltroEntity> filtro);
	
	
}
