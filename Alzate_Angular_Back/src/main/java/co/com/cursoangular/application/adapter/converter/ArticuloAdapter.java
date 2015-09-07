package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.Articulo;
import co.com.cursoangular.infrastructure.persistence.entities.ArticuloEntity;
import co.com.cursoangular.rest.entities.ArticuloRest;

public class ArticuloAdapter extends AbstractAdapter {

	
	private ArticuloAdapter() {

	}

	public static ArticuloEntity toPersistence(Articulo origen) {

		if (origen == null)
			return null;

		ArticuloEntity destino = new ArticuloEntity();

		copy(origen, destino);

		return destino;
	}

	public static Articulo toCore(ArticuloEntity origen) {

		if (origen == null)
			return null;

		Articulo destino = new Articulo();

		copy(origen, destino);

		return destino;
	}

	public static Articulo toCore(ArticuloRest origen) {

		if (origen == null)
			return null;

		Articulo destino = new Articulo();

		copy(origen, destino);

		return destino;
	}

	public static ArticuloRest toRest(Articulo origen) {

		if (origen == null)
			return null;

		ArticuloRest destino = new ArticuloRest();

		copy(origen, destino);

		return destino;
	}

	public static ArticuloRest toRest(ArticuloEntity origen) {

		if (origen == null)
			return null;

		ArticuloRest destino = new ArticuloRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<ArticuloRest> toRest(Collection<Articulo> origen) {

		Collection<ArticuloRest> destino = new ArrayList<>();

		for (Articulo bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<Articulo> toCore(Collection<ArticuloEntity> origenes) {

		Collection<Articulo> destino = new ArrayList<>();

		for (ArticuloEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<ArticuloRest> toRestC(Collection<ArticuloEntity> origenes) {

		Collection<ArticuloRest> destino = new ArrayList<>();

		for (ArticuloEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}
