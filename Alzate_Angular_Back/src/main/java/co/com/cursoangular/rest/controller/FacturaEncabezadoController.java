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

import co.com.cursoangular.application.adapter.converter.FacturaEncabezadoAdapter;
import co.com.cursoangular.application.port.FacturaEncabezadoBusiness;
import co.com.cursoangular.domain.entities.FacturaEncabezado;
import co.com.cursoangular.rest.entities.FacturaEncabezadoRest;



@Controller
@RequestMapping("facturaEncabezado")
public class FacturaEncabezadoController {
	static final Logger logger = LogManager.getLogger(FacturaEncabezadoController.class);

	@Autowired
	FacturaEncabezadoBusiness facturaEncabezadoBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<FacturaEncabezadoRest>> findAll() {

		Collection<FacturaEncabezadoRest> response = FacturaEncabezadoAdapter.toRest(facturaEncabezadoBusiness.findAll());

		return new ResponseEntity<Collection<FacturaEncabezadoRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<FacturaEncabezadoRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<FacturaEncabezadoRest>>(Collections.emptyList(), HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<FacturaEncabezadoRest>> findByName(@RequestBody String pName) {

		Collection<FacturaEncabezadoRest> response = FacturaEncabezadoAdapter.toRest(facturaEncabezadoBusiness.findByName(pName));

		return new ResponseEntity<Collection<FacturaEncabezadoRest>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findById")
	public ResponseEntity<FacturaEncabezadoRest> find(@RequestBody Integer id) {

		FacturaEncabezadoRest facturaEncabezado = FacturaEncabezadoAdapter.toRest(facturaEncabezadoBusiness.find(id));

		return new ResponseEntity<FacturaEncabezadoRest>(facturaEncabezado, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<FacturaEncabezadoRest> save(@RequestBody FacturaEncabezadoRest facturaEncabezado) {

		FacturaEncabezado temp = facturaEncabezadoBusiness.save(FacturaEncabezadoAdapter.toCore(facturaEncabezado));

		facturaEncabezado = FacturaEncabezadoAdapter.toRest(temp);

		return new ResponseEntity<FacturaEncabezadoRest>(facturaEncabezado, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody FacturaEncabezadoRest facturaEncabezado) {

		facturaEncabezadoBusiness.delete(FacturaEncabezadoAdapter.toCore(facturaEncabezado));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}