package co.com.cursoangular.rest.controller;

import java.util.Collection;
import java.util.Collections;

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

import co.com.cursoangular.application.adapter.converter.PersonaAdapter;
import co.com.cursoangular.application.port.PersonaBusiness;
import co.com.cursoangular.domain.entities.Persona;
import co.com.cursoangular.rest.entities.PersonaRest;
import co.com.cursoangular.util.rest.RestUtil;

@Controller
@RequestMapping("persona")
public class PersonaController {
	
	static final Logger logger = LogManager.getLogger(PersonaController.class);

	@Autowired
	PersonaBusiness personaBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/find")
	public ResponseEntity<PersonaRest> find(@RequestBody Integer id) {

		PersonaRest persona = PersonaAdapter.toRest(personaBusiness.find(id));

		return new ResponseEntity<PersonaRest>(persona, HttpStatus.OK);
	}


	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<PersonaRest>> findAll() {

		Collection<PersonaRest> response = PersonaAdapter.toRest(personaBusiness.findAll());

		return new ResponseEntity<Collection<PersonaRest>>(response, HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<PersonaRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<PersonaRest>>(Collections.emptyList(), HttpStatus.CREATED);
	}

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<PersonaRest>> findByName(@RequestBody String query) {

		Collection<PersonaRest> response = PersonaAdapter.toRest(personaBusiness.findByName(query));

		return new ResponseEntity<Collection<PersonaRest>>(response, HttpStatus.OK);
	}

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByDocumento")
	public ResponseEntity<PersonaRest> findByDocumento(@RequestBody(required = false) Long query) {

		PersonaRest response = PersonaAdapter.toRest(personaBusiness.findByDocumento(query));

		return new ResponseEntity<PersonaRest>(response, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<PersonaRest> save(@RequestBody PersonaRest persona) {

		Persona temp = personaBusiness.save(PersonaAdapter.toCore(persona));

		persona = PersonaAdapter.toRest(temp);

		return new ResponseEntity<PersonaRest>(persona, HttpStatus.OK);
	}

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody PersonaRest persona) {

		personaBusiness.delete(PersonaAdapter.toCore(persona));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
	
	@RequestMapping(method = RequestMethod.POST, value = "/dv")
	public ResponseEntity<Integer> digitoVerificacion(@RequestBody(required = false) Long documento) {

		Integer digitoVer = personaBusiness.generarDV(documento);

		return new ResponseEntity<Integer>(digitoVer, RestUtil.plain_text(), HttpStatus.OK);
	}
	
	
}