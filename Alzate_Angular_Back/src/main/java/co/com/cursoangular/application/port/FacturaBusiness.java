package co.com.cursoangular.application.port;

import java.util.Collection;

import co.com.cursoangular.domain.entities.DetalleFactura;
import co.com.cursoangular.domain.entities.Factura;

public interface FacturaBusiness {

	Factura salvar(Factura factura);

	Factura getByNumero(Long numero);

	Collection<DetalleFactura> getDetalles(Long numero);

	void delete(Factura core);

	Collection<Factura> findAll();
}