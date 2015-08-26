package co.com.cursoangular.application.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import co.com.cursoangular.application.port.TerceroBusiness;
import co.com.cursoangular.domain.entities.Persona;

@Component("terceroBusinessImpl")
public class TerceroBusinessImpl implements TerceroBusiness {

	private Collection<Persona> personas = new ArrayList<>();

	@Override
	public Persona salvar(Persona persona) {

		if (getByDocumento(persona.getNmDocumento()) != null) {

			throw new IllegalArgumentException("La Persona ya existe.");
		}
		
		if (persona.getNmDocumento() == null) {

			throw new IllegalArgumentException("El documento es requerida.");
		}		

		personas.add(persona);

		return null;
	}

	@Override
	public Persona getByDocumento(Long numero) {

		Collection<Persona> str = personas.stream().filter(Persona -> Persona.getNmDocumento().equals(numero)).collect(
				Collectors.toList());

		if (str.isEmpty()) {

			return null;
		}

		return str.iterator().next();
	}

	@Override
	public void delete(Persona core) {

		Iterator<Persona> it = personas.iterator();

		while (it.hasNext()) {
			Persona Persona = it.next();
			if (Persona.getCdPersona().equals(core.getCdPersona())) {

				it.remove();
			}
		}
	}

	@Override
	public Collection<Persona> findAll() {

		return personas;
	}
}