package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.FacturaDetalle;
import co.com.cursoangular.infrastructure.persistence.entities.FacturaDetalleEntity;
import co.com.cursoangular.rest.entities.FacturaDetalleRest;

public class FacturaDetalleAdapter extends AbstractAdapter {

	
	private FacturaDetalleAdapter() {

	}

	public static FacturaDetalleEntity toPersistence(FacturaDetalle origen) {

		if (origen == null)
			return null;

		FacturaDetalleEntity destino = new FacturaDetalleEntity();

		copy(origen, destino);

		return destino;
	}

	public static FacturaDetalle toCore(FacturaDetalleEntity origen) {

		if (origen == null)
			return null;

		FacturaDetalle destino = new FacturaDetalle();

		copy(origen, destino);

		return destino;
	}

	public static FacturaDetalle toCore(FacturaDetalleRest origen) {

		if (origen == null)
			return null;

		FacturaDetalle destino = new FacturaDetalle();

		copy(origen, destino);

		return destino;
	}

	public static FacturaDetalleRest toRest(FacturaDetalle origen) {

		if (origen == null)
			return null;

		FacturaDetalleRest destino = new FacturaDetalleRest();

		copy(origen, destino);

		return destino;
	}

	public static FacturaDetalleRest toRest(FacturaDetalleEntity origen) {

		if (origen == null)
			return null;

		FacturaDetalleRest destino = new FacturaDetalleRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<FacturaDetalleRest> toRest(Collection<FacturaDetalle> origen) {

		Collection<FacturaDetalleRest> destino = new ArrayList<>();

		for (FacturaDetalle bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<FacturaDetalle> toCore(Collection<FacturaDetalleEntity> origenes) {

		Collection<FacturaDetalle> destino = new ArrayList<>();

		for (FacturaDetalleEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	
	public static Collection<FacturaDetalle> toCoreListRest(Collection<FacturaDetalleRest> origenes) {

		Collection<FacturaDetalle> destino = new ArrayList<>();

		for (FacturaDetalleRest bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}
	
		
	public static Collection<FacturaDetalleRest> toRestC(Collection<FacturaDetalleEntity> origenes) {

		Collection<FacturaDetalleRest> destino = new ArrayList<>();

		for (FacturaDetalleEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}
