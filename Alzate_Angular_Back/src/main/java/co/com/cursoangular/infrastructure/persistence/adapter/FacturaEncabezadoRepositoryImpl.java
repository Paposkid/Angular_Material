package co.com.cursoangular.infrastructure.persistence.adapter;


import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.FacturaEncabezadoEntity;
import co.com.cursoangular.infrastructure.persistence.port.FacturaEncabezadoRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class FacturaEncabezadoRepositoryImpl  extends AbstractRepository<FacturaEncabezadoEntity> implements FacturaEncabezadoRepository {

	public FacturaEncabezadoRepositoryImpl() {
		super(FacturaEncabezadoEntity.class);

	}


	@Override
	public Collection<FacturaEncabezadoEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public FacturaEncabezadoEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<FacturaEncabezadoEntity> findRange(int ini, int fin) {

		return null;
	}
	

	@Override
	public FacturaEncabezadoEntity save(FacturaEncabezadoEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(FacturaEncabezadoEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}

