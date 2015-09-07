package co.com.cursoangular.application.port;

import java.util.Collection;

import co.com.cursoangular.domain.entities.FacturaDetalle;


public interface FacturaDetalleBusiness extends GenericBusiness<FacturaDetalle> {

	
	Collection<FacturaDetalle> getDetallesByCodigoFactura(String pNroFactura);
	
	void saveList(Collection<FacturaDetalle> listaDetails);
	
}