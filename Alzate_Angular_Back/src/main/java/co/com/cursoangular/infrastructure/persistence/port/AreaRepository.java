package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.AreaEntity;

public interface AreaRepository extends GenericRepository<AreaEntity> {

	Collection<AreaEntity> findByName(String query);
}
