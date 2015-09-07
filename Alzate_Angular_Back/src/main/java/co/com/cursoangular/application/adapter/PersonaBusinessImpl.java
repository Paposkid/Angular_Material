package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.PersonaAdapter;
import co.com.cursoangular.application.port.PersonaBusiness;
import co.com.cursoangular.domain.entities.Persona;
import co.com.cursoangular.infrastructure.persistence.port.PersonaRepository;

@Service
public class PersonaBusinessImpl implements PersonaBusiness {

	@Autowired
	@Resource(name = "personaRepositoryImpl")
	PersonaRepository personaRepository;

	@Override
	public Persona find(Integer id) {

		return PersonaAdapter.toCore(personaRepository.find(id));
	}

	@Override
	public Persona save(Persona propiedad) {

		return PersonaAdapter.toCore(personaRepository.save(PersonaAdapter.toPersistence(propiedad)));
	}

	@Override
	public void delete(Persona dpropiedad) {

		personaRepository.delete(PersonaAdapter.toPersistence(find(dpropiedad.getCdPersona())));

		TransactionSynchronizationManager.getResourceMap();
	}

	@Override
	public Collection<Persona> findRange(int ini, int fin) {

		return null;
	}

	@Override
	public Collection<Persona> findAll() {

		return PersonaAdapter.toCore(personaRepository.findAll());
	}

	@Override
	public Collection<Persona> findByName(String query) {

		return PersonaAdapter.toCore(personaRepository.findByName(query));
	}

	@Override
	public Persona findByDocumento(Long documento) {

		return PersonaAdapter.toCore(personaRepository.findByDocumento(documento));
	}

	@Override
	public Integer generarDV(Long documento) {

		int[] nums = { 3, 7, 13, 17, 19, 23, 29, 37, 41, 43, 47, 53, 59, 67, 71 };

		int suma = 0;

		String str = String.valueOf(documento);
		for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
			suma += Character.digit(str.charAt(i), 10) * nums[j];
		}

		Integer dv = (Integer) ((suma % 11) > 1 ? (11 - (suma % 11))
				: (suma % 11));
		return dv;
	}

	/*
	@Override
	public Collection<Persona> filter(Persona persona, Collection<FiltroEntity> filtros) {

		return PersonaAdapter.toCore(personaRepository.filter(PersonaAdapter.toPersistence(persona), filtros));
	}
	*/
}