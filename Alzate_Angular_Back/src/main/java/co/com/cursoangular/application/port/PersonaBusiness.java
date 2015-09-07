package co.com.cursoangular.application.port;


import co.com.cursoangular.domain.entities.Persona;


public interface PersonaBusiness extends GenericBusiness<Persona> {

	Persona findByDocumento(Long id);

	Integer generarDV(Long documento);

} 