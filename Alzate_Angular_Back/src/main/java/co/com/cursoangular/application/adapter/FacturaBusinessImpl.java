package co.com.cursoangular.application.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import co.com.cursoangular.application.port.FacturaBusiness;
import co.com.cursoangular.domain.entities.DetalleFactura;
import co.com.cursoangular.domain.entities.Factura;

@Component("facturaBusinessImpl")
public class FacturaBusinessImpl implements FacturaBusiness {

	private Collection<Factura> facturas = new ArrayList<>();
	private Collection<DetalleFactura> dFctura = new ArrayList<>();

	@Override
	public Factura salvar(Factura factura) {

		if (getByNumero(factura.getNumeroFact()) != null) {

			throw new IllegalArgumentException("El número de la factura ya existe.");
		}

		factura.setId(factura.getNumeroFact());

		facturas.add(factura);

		return null;
	}

	@Override
	public Factura getByNumero(Long numero) {

		Collection<Factura> str = facturas.stream().filter(factura -> factura.getNumeroFact().equals(numero)).collect(
				Collectors.toList());

		if (str.isEmpty()) {

			return null;
		}

		return str.iterator().next();
	}

	@Override
	public Collection<DetalleFactura> getDetalles(Long numero) {

		return dFctura.stream().filter(item -> item.getIdFactura().equals(numero)).collect(Collectors.toList());
	}

	@Override
	public void delete(Factura core) {

		Iterator<Factura> it = facturas.iterator();

		while (it.hasNext()) {
			Factura factura = it.next();
			if (factura.getId().equals(core.getNumeroFact())) {

				it.remove();
			}
		}
	}

	@Override
	public Collection<Factura> findAll() {

		return facturas;
	}
}