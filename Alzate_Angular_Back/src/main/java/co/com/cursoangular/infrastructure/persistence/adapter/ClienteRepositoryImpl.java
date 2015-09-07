package co.com.cursoangular.infrastructure.persistence.adapter;

import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.ClienteEntity;
import co.com.cursoangular.infrastructure.persistence.port.ClienteRepository;


@Repository
@Transactional(rollbackFor = Exception.class)
public class ClienteRepositoryImpl  extends AbstractRepository<ClienteEntity> implements ClienteRepository {

	public ClienteRepositoryImpl() {
		super(ClienteEntity.class);

	}


@Override
	public Collection<ClienteEntity> findAll() {

		return super.findAll();
	}
	
	
	@Override
	public ClienteEntity find(Object id) {

		return super.find(id);
	}
	
	
	@Override
	public Collection<ClienteEntity> findRange(int ini, int fin) {

		return null;
	}

	
	@Override
	public Collection<ClienteEntity> findByName(String pNombre) {

		return getEm().createQuery("select tpc from ClienteEntity tpc Where LOWER(tpc.nombre) like :pNombre",
						ClienteEntity.class).setParameter("pNombre", pNombre.toLowerCase() + "%").getResultList();
	}
	
	
	@Override
	public ClienteEntity findByDocumento(String pTipoDcto, String pNroDcto) {
			
			try {
					return getEm().createQuery("select e from ClienteEntity e where e.nroDcto = :nroDcto  And e.tipoDcto = :tipoDcto",
							ClienteEntity.class).setParameter("nroDcto", pNroDcto).setParameter("tipoDcto", pTipoDcto).getSingleResult();
				
			} catch (NoResultException n) {
				return null;
			}
	}
	

	@Override
	public ClienteEntity save(ClienteEntity entidad) {

		if (entidad.getCodigo() == null) {
			super.save(entidad);
		
		} else {
			
			super.merge(entidad);
		}

		return entidad;
	}
	

	@Override
	public void delete(ClienteEntity entidad) {

		super.delete(find(entidad.getCodigo()));
	}

}
