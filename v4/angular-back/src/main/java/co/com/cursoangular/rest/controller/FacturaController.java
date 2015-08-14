package co.com.cursoangular.rest.controller;

import java.util.Arrays;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.cursoangular.application.adapter.converter.DetalleFacturaAdapter;
import co.com.cursoangular.application.adapter.converter.FacturaAdapter;
import co.com.cursoangular.application.port.FacturaBusiness;
import co.com.cursoangular.rest.entities.DetalleFacturaRest;
import co.com.cursoangular.rest.entities.FacturaRest;
import co.com.cursoangular.rest.entities.TipoRest;

@Controller
@RequestMapping("/rest/factura")
public class FacturaController {
	static final Logger logger = LogManager.getLogger(FacturaController.class);

	private @Autowired HttpServletRequest request;

	@Autowired
	private FacturaBusiness facturaBusiness;

	@RequestMapping(method = RequestMethod.GET, value = "/find/{id}")
	public ResponseEntity<FacturaRest> find(@PathVariable Long id) {

		FacturaRest factura = FacturaAdapter.toRest(facturaBusiness.getByNumero(id));

		return new ResponseEntity<FacturaRest>(factura, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/detalles")
	public ResponseEntity<Collection<DetalleFacturaRest>> consultarCargosActivosPeriodo(
			@RequestBody(required = false) Long factura) {

		Collection<DetalleFacturaRest> response = DetalleFacturaAdapter.toRest(facturaBusiness.getDetalles(factura));

		return new ResponseEntity<Collection<DetalleFacturaRest>>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	public ResponseEntity<FacturaRest> save(@RequestBody FacturaRest factura) {

		factura = FacturaAdapter.toRest(facturaBusiness.salvar(FacturaAdapter.toCore(factura)));

		return new ResponseEntity<FacturaRest>(factura, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody FacturaRest factura) {

		facturaBusiness.delete(FacturaAdapter.toCore(factura));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<FacturaRest>> findAll() {

		Collection<FacturaRest> response = FacturaAdapter.toRest(facturaBusiness.findAll());

		return new ResponseEntity<Collection<FacturaRest>>(response,
				HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tipos")
	public ResponseEntity<Collection<TipoRest>> tipos() {

		Collection<TipoRest> response = Arrays.asList(new TipoRest("1", "Cuenta de cobro"),
				new TipoRest("2", "Factura"));

		return new ResponseEntity<Collection<TipoRest>>(response, HttpStatus.OK);
	}
}