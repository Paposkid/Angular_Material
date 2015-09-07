package co.com.cursoangular.application.adapter.converter;

import java.util.ArrayList;
import java.util.Collection;

import co.com.cursoangular.domain.entities.Cliente;
import co.com.cursoangular.infrastructure.persistence.entities.ClienteEntity;
import co.com.cursoangular.rest.entities.ClienteRest;

public class ClienteAdapter extends AbstractAdapter {

	
	private ClienteAdapter() {

	}

	public static ClienteEntity toPersistence(Cliente origen) {

		if (origen == null)
			return null;

		ClienteEntity destino = new ClienteEntity();

		copy(origen, destino);

		return destino;
	}

	public static Cliente toCore(ClienteEntity origen) {

		if (origen == null)
			return null;

		Cliente destino = new Cliente();

		copy(origen, destino);

		return destino;
	}

	public static Cliente toCore(ClienteRest origen) {

		if (origen == null)
			return null;

		Cliente destino = new Cliente();

		copy(origen, destino);

		return destino;
	}

	public static ClienteRest toRest(Cliente origen) {

		if (origen == null)
			return null;

		ClienteRest destino = new ClienteRest();

		copy(origen, destino);

		return destino;
	}

	public static ClienteRest toRest(ClienteEntity origen) {

		if (origen == null)
			return null;

		ClienteRest destino = new ClienteRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<ClienteRest> toRest(Collection<Cliente> origen) {

		Collection<ClienteRest> destino = new ArrayList<>();

		for (Cliente bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<Cliente> toCore(Collection<ClienteEntity> origenes) {

		Collection<Cliente> destino = new ArrayList<>();

		for (ClienteEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<ClienteRest> toRestC(Collection<ClienteEntity> origenes) {

		Collection<ClienteRest> destino = new ArrayList<>();

		for (ClienteEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}
