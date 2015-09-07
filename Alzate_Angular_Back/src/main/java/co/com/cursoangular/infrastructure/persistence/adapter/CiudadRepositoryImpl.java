package co.com.cursoangular.infrastructure.persistence.adapter;

import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.CiudadEntity;
import co.com.cursoangular.infrastructure.persistence.port.CiudadRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class CiudadRepositoryImpl extends AbstractRepository<CiudadEntity> implements CiudadRepository {

	
	public CiudadRepositoryImpl() {
		super(CiudadEntity.class);
	}



	@Override
	public Collection<CiudadEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public CiudadEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<CiudadEntity> findRange(int ini, int fin) {

		return null;
	}


	@Override
	public Collection<CiudadEntity> findByName(String query) {

		return getEm().createQuery("select ciu from CiudadEntity ciu Where LOWER(ciu.nombre) like :query",
					   CiudadEntity.class).setParameter("query", query.toLowerCase() + "%").getResultList();
	}


	@Override
	public CiudadEntity save(CiudadEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(CiudadEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}
