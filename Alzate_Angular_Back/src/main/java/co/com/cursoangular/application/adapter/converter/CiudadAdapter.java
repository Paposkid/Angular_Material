package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.Ciudad;
import co.com.cursoangular.infrastructure.persistence.entities.CiudadEntity;
import co.com.cursoangular.rest.entities.CiudadRest;

public class CiudadAdapter extends AbstractAdapter {

	
	private CiudadAdapter() {

	}

	public static CiudadEntity toPersistence(Ciudad origen) {

		if (origen == null)
			return null;

		CiudadEntity destino = new CiudadEntity();

		copy(origen, destino);

		return destino;
	}

	public static Ciudad toCore(CiudadEntity origen) {

		if (origen == null)
			return null;

		Ciudad destino = new Ciudad();

		copy(origen, destino);

		return destino;
	}

	public static Ciudad toCore(CiudadRest origen) {

		if (origen == null)
			return null;

		Ciudad destino = new Ciudad();

		copy(origen, destino);

		return destino;
	}

	public static CiudadRest toRest(Ciudad origen) {

		if (origen == null)
			return null;

		CiudadRest destino = new CiudadRest();

		copy(origen, destino);

		return destino;
	}

	public static CiudadRest toRest(CiudadEntity origen) {

		if (origen == null)
			return null;

		CiudadRest destino = new CiudadRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<CiudadRest> toRest(Collection<Ciudad> origen) {

		Collection<CiudadRest> destino = new ArrayList<>();

		for (Ciudad bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<Ciudad> toCore(Collection<CiudadEntity> origenes) {

		Collection<Ciudad> destino = new ArrayList<>();

		for (CiudadEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<CiudadRest> toRestC(Collection<CiudadEntity> origenes) {

		Collection<CiudadRest> destino = new ArrayList<>();

		for (CiudadEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}