package co.com.cursoangular.application.adapter;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import co.com.cursoangular.application.adapter.converter.ClienteAdapter;
import co.com.cursoangular.application.port.ClienteBusiness;
import co.com.cursoangular.domain.entities.Cliente;
import co.com.cursoangular.infrastructure.persistence.port.ClienteRepository;

@Service
public class ClienteBusinessImpl implements ClienteBusiness {

	@Autowired
	@Resource(name = "clienteRepositoryImpl")
	ClienteRepository clienteRepository;
	
	
	@Override
	public Collection<Cliente> findAll() {

		return ClienteAdapter.toCore(clienteRepository.findAll());
	}

	
	@Override
	public Collection<Cliente> findRange(int ini, int fin) {

		return null;
	}
	
	
	@Override
	public Cliente find(Integer id) {

		return ClienteAdapter.toCore(clienteRepository.find(id));
	}
	
	
	@Override
	public Collection<Cliente> findByName(String pName) {

		return ClienteAdapter.toCore(clienteRepository.findByName(pName));
	}

	@Override
	public Cliente findByDocumento(String pTipoDcto, String pNroDcto) {

		return ClienteAdapter.toCore(clienteRepository.findByDocumento(pTipoDcto, pNroDcto));
	}
	
	
	@Override
	public Cliente save(Cliente propiedad) {

		return ClienteAdapter.toCore(clienteRepository.save(ClienteAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(Cliente dpropiedad) {

		clienteRepository.delete(ClienteAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}

}