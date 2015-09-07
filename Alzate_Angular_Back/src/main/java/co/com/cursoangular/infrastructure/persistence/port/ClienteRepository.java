package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.ClienteEntity;

public interface ClienteRepository extends GenericRepository<ClienteEntity> {

	Collection<ClienteEntity> findByName(String pNombre);

	ClienteEntity findByDocumento(String pTipoDcto, String pNroDcto);
}
