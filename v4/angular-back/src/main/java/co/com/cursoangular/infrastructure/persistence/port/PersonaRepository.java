package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.PersonaEntity;

public interface PersonaRepository extends GenericRepository<PersonaEntity> {

	Collection<PersonaEntity> findByName(String query);

	PersonaEntity findByDocumento(Long documento);
}
