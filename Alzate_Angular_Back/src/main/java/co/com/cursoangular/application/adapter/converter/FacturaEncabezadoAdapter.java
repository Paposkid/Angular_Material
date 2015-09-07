package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.FacturaEncabezado;
import co.com.cursoangular.infrastructure.persistence.entities.FacturaEncabezadoEntity;
import co.com.cursoangular.rest.entities.FacturaEncabezadoRest;

public class FacturaEncabezadoAdapter extends AbstractAdapter {

	
	private FacturaEncabezadoAdapter() {

	}

	public static FacturaEncabezadoEntity toPersistence(FacturaEncabezado origen) {

		if (origen == null)
			return null;

		FacturaEncabezadoEntity destino = new FacturaEncabezadoEntity();

		copy(origen, destino);

		return destino;
	}

	public static FacturaEncabezado toCore(FacturaEncabezadoEntity origen) {

		if (origen == null)
			return null;

		FacturaEncabezado destino = new FacturaEncabezado();

		copy(origen, destino);

		return destino;
	}

	public static FacturaEncabezado toCore(FacturaEncabezadoRest origen) {

		if (origen == null)
			return null;

		FacturaEncabezado destino = new FacturaEncabezado();

		copy(origen, destino);

		return destino;
	}

	public static FacturaEncabezadoRest toRest(FacturaEncabezado origen) {

		if (origen == null)
			return null;

		FacturaEncabezadoRest destino = new FacturaEncabezadoRest();

		copy(origen, destino);

		return destino;
	}

	public static FacturaEncabezadoRest toRest(FacturaEncabezadoEntity origen) {

		if (origen == null)
			return null;

		FacturaEncabezadoRest destino = new FacturaEncabezadoRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<FacturaEncabezadoRest> toRest(Collection<FacturaEncabezado> origen) {

		Collection<FacturaEncabezadoRest> destino = new ArrayList<>();

		for (FacturaEncabezado bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<FacturaEncabezado> toCore(Collection<FacturaEncabezadoEntity> origenes) {

		Collection<FacturaEncabezado> destino = new ArrayList<>();

		for (FacturaEncabezadoEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<FacturaEncabezadoRest> toRestC(Collection<FacturaEncabezadoEntity> origenes) {

		Collection<FacturaEncabezadoRest> destino = new ArrayList<>();

		for (FacturaEncabezadoEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}