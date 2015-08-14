package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.Factura;
import co.com.cursoangular.rest.entities.FacturaRest;

public class FacturaAdapter extends AbstractAdapter {

	private FacturaAdapter() {

	}

	public static Factura toCore(FacturaRest origen) {

		if (origen == null)
			return null;

		Factura destino = new Factura();

		copy(origen, destino);

		return destino;
	}

	public static FacturaRest toRest(Factura origen) {

		if (origen == null)
			return null;

		FacturaRest destino = new FacturaRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<FacturaRest> toRest(Collection<Factura> origen) {

		Collection<FacturaRest> destino = new ArrayList<>();

		for (Factura item : origen) {

			destino.add(toRest(item));
		}

		return destino;
	}
}