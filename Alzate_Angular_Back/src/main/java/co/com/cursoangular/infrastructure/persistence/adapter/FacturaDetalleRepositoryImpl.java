package co.com.cursoangular.infrastructure.persistence.adapter;


import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.FacturaDetalleEntity;
import co.com.cursoangular.infrastructure.persistence.port.FacturaDetalleRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class FacturaDetalleRepositoryImpl  extends AbstractRepository<FacturaDetalleEntity> implements FacturaDetalleRepository {

	public FacturaDetalleRepositoryImpl() {
		super(FacturaDetalleEntity.class);

	}


@Override
	public Collection<FacturaDetalleEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public FacturaDetalleEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<FacturaDetalleEntity> findRange(int ini, int fin) {

		return null;
	}


	@Override
	public Collection<FacturaDetalleEntity> findDetailsByNroFactura(String pNroFactura) {

		try {
				return getEm().createQuery("select e from FacturaDetalleEntity e Where e.codigoFactura = :pNroFactura",
					FacturaDetalleEntity.class).setParameter("pNroFactura", pNroFactura).getResultList();
			
		} catch (NoResultException n) {
			return null;
		}
	}
	
	@Override
	public FacturaDetalleEntity save(FacturaDetalleEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(FacturaDetalleEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}
