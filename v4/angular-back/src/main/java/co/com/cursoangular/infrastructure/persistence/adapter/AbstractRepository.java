package co.com.cursoangular.infrastructure.persistence.adapter;

import java.util.Collection;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.com.cursoangular.infrastructure.persistence.entities.EntidadBaseEntity;

@Transactional(rollbackFor = Exception.class)
public abstract class AbstractRepository<T> {

	private Class<T> entityClass;

	private @Autowired HttpServletRequest request;

	public AbstractRepository(Class<T> clazz) {

		entityClass = clazz;
	}

	public String getUsuario() {

		return request.getRemoteUser();
	}

	@PersistenceContext(unitName = "cursoAngular-ejbPU")
	private EntityManager em;

	
	public EntityManager getEm() {
		return em;
	}
	
	public T find(Object id) {

		return getEm().find(entityClass, id);
	}

	public T save(T entidad) {

		if (entidad instanceof EntidadBaseEntity) {

			((EntidadBaseEntity) entidad).setFeProceso(new Date());
			((EntidadBaseEntity) entidad).setUsuarioIngreso(getUsuario());
		}

		EntityManager em = getEm();

		em.persist(entidad);

		em.flush();

		return entidad;
	}

	public T merge(T entidad) {

		if (entidad instanceof EntidadBaseEntity) {

			((EntidadBaseEntity) entidad).setFeModifica(new Date());
			((EntidadBaseEntity) entidad).setUsuarioModifica(getUsuario());
		}

		EntityManager em = getEm();

		em.merge(entidad);

		em.flush();

		return entidad;
	}

	public void delete(T entidad) {

		EntityManager em = getEm();

		em.remove(entidad);
		em.flush();
	}

	public Collection<T> findRange(int ini, int fin) {

		return null;
	}

	public Collection<T> findAll() {

		return getEm().createQuery("select e from ".concat(entityClass.getSimpleName()).concat(" e"), entityClass)
				.getResultList();
	}
}