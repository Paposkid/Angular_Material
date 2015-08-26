package co.com.cursoangular.rest.controller;

import java.util.Arrays;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.cursoangular.application.adapter.converter.PersonaAdapter;
import co.com.cursoangular.application.port.TerceroBusiness;
import co.com.cursoangular.rest.entities.PersonaRest;
import co.com.cursoangular.rest.entities.TipoRest;

@Controller
@RequestMapping("tercero")
public class TerceroController {
	static final Logger logger = LogManager.getLogger(TerceroController.class);

	@Autowired
	private TerceroBusiness terceroBusiness;


	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	public ResponseEntity<PersonaRest> save(@RequestBody PersonaRest factura) {

		factura = PersonaAdapter.toRest(terceroBusiness.salvar(PersonaAdapter.toCore(factura)));

		return new ResponseEntity<PersonaRest>(factura, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody PersonaRest factura) {

		terceroBusiness.delete(PersonaAdapter.toCore(factura));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<PersonaRest>> findAll() {

		Collection<PersonaRest> response = PersonaAdapter.toRest(terceroBusiness.findAll());

		return new ResponseEntity<Collection<PersonaRest>>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tipos")
	public ResponseEntity<Collection<TipoRest>> tipos() {

		Collection<TipoRest> response = Arrays.asList(new TipoRest("1", "Cuenta de cobro"),
				new TipoRest("2", "Factura"));

		return new ResponseEntity<Collection<TipoRest>>(response, HttpStatus.OK);
	}
}