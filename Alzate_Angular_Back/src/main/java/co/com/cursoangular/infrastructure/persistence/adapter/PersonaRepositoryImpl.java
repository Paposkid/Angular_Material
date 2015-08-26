package co.com.cursoangular.infrastructure.persistence.adapter;

import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.PersonaEntity;
import co.com.cursoangular.infrastructure.persistence.port.PersonaRepository;

@Repository
@Transactional(rollbackFor = Exception.class)
public class PersonaRepositoryImpl extends AbstractRepository<PersonaEntity> implements PersonaRepository {

	public PersonaRepositoryImpl() {
		super(PersonaEntity.class);
	}

	@Override
	public PersonaEntity find(Object id) {

		return super.find(id);
	}

	@Override
	public PersonaEntity save(PersonaEntity entidad) {

		if (entidad.getCdPersona() == null)
			super.save(entidad);
		else
			super.merge(entidad);

		return entidad;
	}

	@Override
	public void delete(PersonaEntity entidad) {

		super.delete(find(entidad.getCdPersona()));
	}

	@Override
	public Collection<PersonaEntity> findRange(int ini, int fin) {

		return null;
	}

	@Override
	public Collection<PersonaEntity> findAll() {

		return super.findAll();
	}

	@Override
	public Collection<PersonaEntity> findByName(String query) {

		return getEm()
				.createQuery(
						"select e from PersonaEntity e where CONCAT(LOWER(e.strNombres),COALESCE(e.strApellidos,''),COALESCE(LOWER(e.strApellidos))) like :query",
						PersonaEntity.class).setParameter("query", query.toLowerCase()
						+ "%").getResultList();
	}

	@Override
	public PersonaEntity findByDocumento(Long documento) {

		try {
			return getEm().createQuery("select e from PersonaEntity e where e.nmDocumento = :documento",
					PersonaEntity.class).setParameter("documento", documento).getSingleResult();
		} catch (NoResultException n) {
			return null;
		}
	}
}