package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.FacturaDetalleAdapter;
import co.com.cursoangular.application.port.FacturaDetalleBusiness;
import co.com.cursoangular.domain.entities.FacturaDetalle;
import co.com.cursoangular.infrastructure.persistence.port.FacturaDetalleRepository;

@Service
public class FacturaDetalleBusinessImpl implements FacturaDetalleBusiness {

	@Autowired
	@Resource(name = "facturaDetalleRepositoryImpl")
	FacturaDetalleRepository facturaDetalleRepository;
	
	
	@Override
	public Collection<FacturaDetalle> findAll() {

		return FacturaDetalleAdapter.toCore(facturaDetalleRepository.findAll());
	}

	
	@Override
	public Collection<FacturaDetalle> findRange(int ini, int fin) {

		return null;
	}
	
	
	@Override
	public Collection<FacturaDetalle> findByName(String pName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public FacturaDetalle find(Integer id) {

		return FacturaDetalleAdapter.toCore(facturaDetalleRepository.find(id));
	}
	
	
	@Override
	public Collection<FacturaDetalle> getDetallesByCodigoFactura(String pNroFactura) {

		return FacturaDetalleAdapter.toCore(facturaDetalleRepository.findDetailsByNroFactura(pNroFactura));
	}

	
	@Override
	public FacturaDetalle save(FacturaDetalle propiedad) {

		return FacturaDetalleAdapter.toCore(facturaDetalleRepository.save(FacturaDetalleAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(FacturaDetalle dpropiedad) {

		facturaDetalleRepository.delete(FacturaDetalleAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}


	@Override
	public void saveList(Collection<FacturaDetalle> listaDetails) {

		for (FacturaDetalle facturaDetalle : listaDetails) {
		
			FacturaDetalleAdapter.toCore(facturaDetalleRepository.save(FacturaDetalleAdapter.toPersistence(facturaDetalle)));
			
		}
		
	}

}
