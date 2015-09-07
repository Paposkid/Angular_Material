package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.ArticuloAdapter;
import co.com.cursoangular.application.port.ArticuloBusiness;
import co.com.cursoangular.domain.entities.Articulo;
import co.com.cursoangular.infrastructure.persistence.port.ArticuloRepository;

@Service
public class ArticuloBusinessImpl implements ArticuloBusiness {

	@Autowired
	@Resource(name = "articuloRepositoryImpl")
	ArticuloRepository articuloRepository;
	
	
	@Override
	public Collection<Articulo> findAll() {

		return ArticuloAdapter.toCore(articuloRepository.findAll());
	}

	
	@Override
	public Collection<Articulo> findRange(int ini, int fin) {

		return null;
	}
	
	
	@Override
	public Articulo find(Integer id) {

		return ArticuloAdapter.toCore(articuloRepository.find(id));
	}
	
	
	@Override
	public Collection<Articulo> findByName(String pName) {

		return ArticuloAdapter.toCore(articuloRepository.findByName(pName));
	}

	
	@Override
	public Articulo save(Articulo propiedad) {

		return ArticuloAdapter.toCore(articuloRepository.save(ArticuloAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(Articulo dpropiedad) {

		articuloRepository.delete(ArticuloAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}
}

