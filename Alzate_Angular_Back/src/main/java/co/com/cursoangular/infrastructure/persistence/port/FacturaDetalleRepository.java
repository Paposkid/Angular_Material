package co.com.cursoangular.infrastructure.persistence.port;

import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.FacturaDetalleEntity;

public interface FacturaDetalleRepository extends GenericRepository<FacturaDetalleEntity> {

	Collection<FacturaDetalleEntity> findDetailsByNroFactura(String pNroFactura);
	
}
