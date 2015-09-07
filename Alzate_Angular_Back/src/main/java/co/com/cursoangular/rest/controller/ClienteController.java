package co.com.cursoangular.rest.controller;

import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.cursoangular.application.adapter.converter.ClienteAdapter;
import co.com.cursoangular.application.port.ClienteBusiness;
import co.com.cursoangular.domain.entities.Cliente;
import co.com.cursoangular.rest.entities.ClienteRest;
import co.com.cursoangular.rest.entities.DocumentoIdentidadRest;



@Controller
@RequestMapping("cliente")
public class ClienteController {
	static final Logger logger = LogManager.getLogger(ClienteController.class);

	@Autowired
	ClienteBusiness clienteBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<ClienteRest>> findAll() {

		Collection<ClienteRest> response = ClienteAdapter.toRest(clienteBusiness.findAll());

		return new ResponseEntity<Collection<ClienteRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<ClienteRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<ClienteRest>>(
				java.util.Collections.emptyList(), HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findByDocumento")
	public ResponseEntity<ClienteRest> findByDocumento(@RequestBody DocumentoIdentidadRest dctoRest) {

		ClienteRest response = ClienteAdapter.toRest(clienteBusiness.findByDocumento(dctoRest.getTipoDcto(), dctoRest.getNroDcto()));

		return new ResponseEntity<ClienteRest>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<ClienteRest>> findByName(@RequestBody String pName) {

		Collection<ClienteRest> response = ClienteAdapter.toRest(clienteBusiness.findByName(pName));

		return new ResponseEntity<Collection<ClienteRest>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/find")
	public ResponseEntity<ClienteRest> find(@RequestBody Integer id) {

		ClienteRest cliente = ClienteAdapter.toRest(clienteBusiness.find(id));

		return new ResponseEntity<ClienteRest>(cliente, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<ClienteRest> save(@RequestBody ClienteRest cliente) {

		Cliente temp = clienteBusiness.save(ClienteAdapter.toCore(cliente));

		cliente = ClienteAdapter.toRest(temp);

		return new ResponseEntity<ClienteRest>(cliente, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody ClienteRest cliente) {

		clienteBusiness.delete(ClienteAdapter.toCore(cliente));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
