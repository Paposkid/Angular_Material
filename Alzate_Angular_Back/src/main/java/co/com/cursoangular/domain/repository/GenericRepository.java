package co.com.cursoangular.domain.repository;

import java.util.Collection;

public interface GenericRepository<T> {

	T find(Object id);

	T save(T entidad);

	T merge(T entidad);

	void delete(T entidad);

	Collection<T> findRange(int ini, int fin);

	Collection<T> findAll();
}
