package co.com.cursoangular.application.port;

import java.util.Collection;


public interface GenericBusiness <T> {


		Collection<T> findAll();
		
		Collection<T> findRange(int ini, int fin);
		
		Collection<T> findByName(String pName);
		
		T find(Integer id);

		T save(T propiedad);

		void delete(T dpropiedad);
		
}
