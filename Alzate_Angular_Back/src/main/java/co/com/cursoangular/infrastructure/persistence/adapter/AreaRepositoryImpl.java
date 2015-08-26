package co.com.cursoangular.infrastructure.persistence.adapter;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import co.com.cursoangular.infrastructure.persistence.entities.AreaEntity;
import co.com.cursoangular.infrastructure.persistence.port.AreaRepository;

@Repository("areaRepositoryImpl")
public class AreaRepositoryImpl extends AbstractRepository<AreaEntity> implements AreaRepository {

	public AreaRepositoryImpl() {
		super(AreaEntity.class);
	}

	@Override
	public AreaEntity find(Object id) {

		return super.find(id);
	}

	@Override
	public AreaEntity save(AreaEntity detalleRecaudo) {

		if (detalleRecaudo.getCdArea() == null) 
			super.save(detalleRecaudo);
		else
			super.merge(detalleRecaudo);

		return detalleRecaudo;
	}

	@Override
	public void delete(AreaEntity entidad) {

		getEm().remove(find(entidad.getCdArea()));
	}

	@Override
	public Collection<AreaEntity> findRange(int ini, int fin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<AreaEntity> findAll() {

		return super.findAll();
	}

	@Override
	public Collection<AreaEntity> findByName(String query) {

		return getEm().createQuery("select e from AreaEntity e where LOWER(e.strArea) like :query", AreaEntity.class).setParameter("query", (query + "%").toLowerCase()).getResultList();
	}
}
