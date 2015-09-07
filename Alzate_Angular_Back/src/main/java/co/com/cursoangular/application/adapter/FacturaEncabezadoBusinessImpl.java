package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.FacturaEncabezadoAdapter;
import co.com.cursoangular.application.port.FacturaEncabezadoBusiness;
import co.com.cursoangular.domain.entities.FacturaEncabezado;
import co.com.cursoangular.infrastructure.persistence.port.FacturaEncabezadoRepository;

@Service
public class FacturaEncabezadoBusinessImpl implements FacturaEncabezadoBusiness {

	@Autowired
	@Resource(name = "facturaEncabezadoRepositoryImpl")
	FacturaEncabezadoRepository facturaEncabezadoRepository;
	
	
	@Override
	public Collection<FacturaEncabezado> findAll() {

		return FacturaEncabezadoAdapter.toCore(facturaEncabezadoRepository.findAll());
	}

	
	@Override
	public Collection<FacturaEncabezado> findRange(int ini, int fin) {

		return null;
	}
	
	@Override
	public Collection<FacturaEncabezado> findByName(String pName) {

		return null;
	}
	
	
	@Override
	public FacturaEncabezado find(Integer id) {

		return FacturaEncabezadoAdapter.toCore(facturaEncabezadoRepository.find(id));
	}

	
	@Override
	public FacturaEncabezado save(FacturaEncabezado propiedad) {

		return FacturaEncabezadoAdapter.toCore(facturaEncabezadoRepository.save(FacturaEncabezadoAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(FacturaEncabezado dpropiedad) {

		facturaEncabezadoRepository.delete(FacturaEncabezadoAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}


}
