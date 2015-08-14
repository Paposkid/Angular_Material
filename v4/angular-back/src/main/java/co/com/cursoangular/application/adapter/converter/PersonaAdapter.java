package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.Persona;
import co.com.cursoangular.infrastructure.persistence.entities.PersonaEntity;
import co.com.cursoangular.rest.entities.PersonaRest;

public class PersonaAdapter extends AbstractAdapter {

	private PersonaAdapter() {

	}

	public static PersonaEntity toPersistence(Persona origen) {

		if (origen == null)
			return null;

		PersonaEntity destino = new PersonaEntity();

		copy(origen, destino);

		return destino;
	}

	public static Persona toCore(PersonaEntity origen) {

		if (origen == null)
			return null;

		Persona destino = new Persona();

		copy(origen, destino);

		return destino;
	}

	public static Persona toCore(PersonaRest origen) {

		if (origen == null)
			return null;

		Persona destino = new Persona();

		copy(origen, destino);

		return destino;
	}

	public static PersonaRest toRest(Persona origen) {

		if (origen == null)
			return null;

		PersonaRest destino = new PersonaRest();

		copy(origen, destino);

		return destino;
	}

	public static PersonaRest toRest(PersonaEntity origen) {

		if (origen == null)
			return null;

		PersonaRest destino = new PersonaRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<PersonaRest> toRest(Collection<Persona> origen) {

		Collection<PersonaRest> destino = new ArrayList<>();

		for (Persona bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<Persona> toCore(Collection<PersonaEntity> origenes) {

		Collection<Persona> destino = new ArrayList<>();

		for (PersonaEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<PersonaRest> toRestC(Collection<PersonaEntity> origenes) {

		Collection<PersonaRest> destino = new ArrayList<>();

		for (PersonaEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}