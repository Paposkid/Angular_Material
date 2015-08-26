package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.CiudadAdapter;
import co.com.cursoangular.application.port.CiudadBusiness;
import co.com.cursoangular.domain.entities.Ciudad;
import co.com.cursoangular.infrastructure.persistence.port.CiudadRepository;



@Service
public class CiudadBusinessImpl implements CiudadBusiness {

	@Autowired
	@Resource(name = "ciudadRepositoryImpl")
	CiudadRepository ciudadRepository;


	@Override
	public Collection<Ciudad> findAll() {

		return CiudadAdapter.toCore(ciudadRepository.findAll());
	}

	
	@Override
	public Collection<Ciudad> findRange(int ini, int fin) {

		return null;
	}
	
	
	@Override
	public Ciudad find(Integer id) {

		return CiudadAdapter.toCore(ciudadRepository.find(id));
	}
	
	
	@Override
	public Collection<Ciudad> findByName(String query) {

		return CiudadAdapter.toCore(ciudadRepository.findByName(query));
	}

	
	@Override
	public Ciudad save(Ciudad propiedad) {

		return CiudadAdapter.toCore(ciudadRepository.save(CiudadAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(Ciudad dpropiedad) {

		ciudadRepository.delete(CiudadAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}

	/*
	@Override
	public Collection<Ciudad> filter(Ciudad ciudad, Collection<FiltroEntity> filtros) {

		return null;
		//return CiudadAdapter.toCore(ciudadRepository.filter(CiudadAdapter.toPersistence(ciudad), filtros));
	}
	*/
}