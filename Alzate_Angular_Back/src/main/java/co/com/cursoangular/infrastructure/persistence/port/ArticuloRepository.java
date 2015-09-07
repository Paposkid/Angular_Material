package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.ArticuloEntity;

public interface ArticuloRepository extends GenericRepository<ArticuloEntity> {

	Collection<ArticuloEntity> findByName(String pNombre);

}
