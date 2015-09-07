package co.com.cursoangular.infrastructure.persistence.adapter;


import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.ArticuloEntity;
import co.com.cursoangular.infrastructure.persistence.port.ArticuloRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class ArticuloRepositoryImpl  extends AbstractRepository<ArticuloEntity> implements ArticuloRepository {

	public ArticuloRepositoryImpl() {
		super(ArticuloEntity.class);

	}


@Override
	public Collection<ArticuloEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public ArticuloEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<ArticuloEntity> findRange(int ini, int fin) {

		return null;
	}

	
	@Override
	public Collection<ArticuloEntity> findByName(String pNombre) {

			return getEm().createQuery("select art from ArticuloEntity art Where LOWER(art.nombre) like :pNombre",
					   ArticuloEntity.class).setParameter("pNombre", pNombre.toLowerCase() + "%").getResultList();

	}


	@Override
	public ArticuloEntity save(ArticuloEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(ArticuloEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}

