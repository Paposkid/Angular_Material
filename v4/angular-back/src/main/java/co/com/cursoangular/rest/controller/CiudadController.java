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

import co.com.cursoangular.application.adapter.converter.CiudadAdapter;
import co.com.cursoangular.application.port.CiudadBusiness;
import co.com.cursoangular.domain.entities.Ciudad;
import co.com.cursoangular.rest.entities.CiudadRest;



@Controller
@RequestMapping("ciudad")
public class CiudadController {
	static final Logger logger = LogManager.getLogger(CiudadController.class);

	@Autowired
	CiudadBusiness ciudadBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<CiudadRest>> findAll() {

		Collection<CiudadRest> response = CiudadAdapter.toRest(ciudadBusiness.findAll());

		return new ResponseEntity<Collection<CiudadRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<CiudadRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<CiudadRest>>(
				java.util.Collections.emptyList(), HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<CiudadRest>> findByName(@RequestBody String query) {

		Collection<CiudadRest> response = CiudadAdapter.toRest(ciudadBusiness.findByName(query));

		return new ResponseEntity<Collection<CiudadRest>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/find")
	public ResponseEntity<CiudadRest> find(@RequestBody Integer id) {

		CiudadRest ciudad = CiudadAdapter.toRest(ciudadBusiness.find(id));

		return new ResponseEntity<CiudadRest>(ciudad, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<CiudadRest> save(@RequestBody CiudadRest ciudad) {

		Ciudad temp = ciudadBusiness.save(CiudadAdapter.toCore(ciudad));

		ciudad = CiudadAdapter.toRest(temp);

		return new ResponseEntity<CiudadRest>(ciudad, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody CiudadRest ciudad) {

		ciudadBusiness.delete(CiudadAdapter.toCore(ciudad));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
