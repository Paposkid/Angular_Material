package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.CiudadEntity;


public interface CiudadRepository extends GenericRepository<CiudadEntity> {

	Collection<CiudadEntity> findByName(String query);
}
