package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.rest.entities.DetalleFacturaRest;

public class DetalleFacturaAdapter extends AbstractAdapter {

	private DetalleFacturaAdapter() {

	}

	public static co.com.cursoangular.domain.entities.DetalleFactura toCore(DetalleFacturaRest origen) {

		if (origen == null)
			return null;

		co.com.cursoangular.domain.entities.DetalleFactura destino = new co.com.cursoangular.domain.entities.DetalleFactura();

		copy(origen, destino);

		return destino;
	}

	public static DetalleFacturaRest toRest(co.com.cursoangular.domain.entities.DetalleFactura origen) {

		if (origen == null)
			return null;

		DetalleFacturaRest destino = new DetalleFacturaRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<DetalleFacturaRest> toRest(
			Collection<co.com.cursoangular.domain.entities.DetalleFactura> origen) {

		Collection<DetalleFacturaRest> destino = new ArrayList<>();

		for (co.com.cursoangular.domain.entities.DetalleFactura item : origen) {

			destino.add(toRest(item));
		}

		return destino;
	}

	public static Collection<co.com.cursoangular.domain.entities.DetalleFactura> toCore2(
			Collection<DetalleFacturaRest> origenes) {

		Collection<co.com.cursoangular.domain.entities.DetalleFactura> destino = new ArrayList<>();

		for (DetalleFacturaRest origen : origenes) {

			destino.add(toCore(origen));
		}

		return destino;
	}
}