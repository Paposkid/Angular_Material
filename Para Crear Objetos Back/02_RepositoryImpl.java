
import java.util.Collection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.XXXXXXXEntity;
import co.com.cursoangular.infrastructure.persistence.port.XXXXXXXRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class XXXXXXXRepositoryImpl  extends AbstractRepository<XXXXXXXEntity> implements XXXXXXXRepository {

	public XXXXXXXRepositoryImpl() {
		super(XXXXXXXEntity.class);

	}


@Override
	public Collection<XXXXXXXEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public XXXXXXXEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<XXXXXXXEntity> findRange(int ini, int fin) {

		return null;
	}

	
	@Override
	public Collection<XXXXXXXEntity> findByName(String query) {

		return getEm().createQuery("select tpc from XXXXXXXEntity tpc Where LOWER(tpc.Nombre) like :query",
					    XXXXXXXEntity.class).setParameter("query", query.toLowerCase() + "%").getResultList();
	}
	
	
	@Override
	public XXXXXXXEntity findByDocumento(String nroDcto) {

		try {
			return getEm().createQuery("select e from XXXXXXXEntity e where e.nmDocumento = :nroDcto",
					XXXXXXXEntity.class).setParameter("nroDcto", nroDcto).getSingleResult();
		} catch (NoResultException n) {
			return null;
		}
	}
	

	@Override
	public XXXXXXXEntity save(XXXXXXXEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(XXXXXXXEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}
