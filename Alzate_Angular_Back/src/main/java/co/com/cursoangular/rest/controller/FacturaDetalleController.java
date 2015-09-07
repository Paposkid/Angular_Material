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

import co.com.cursoangular.application.adapter.converter.FacturaDetalleAdapter;
import co.com.cursoangular.application.port.FacturaDetalleBusiness;
import co.com.cursoangular.domain.entities.FacturaDetalle;
import co.com.cursoangular.rest.entities.FacturaDetalleRest;



@Controller
@RequestMapping("facturaDetalle")
public class FacturaDetalleController {
	static final Logger logger = LogManager.getLogger(FacturaDetalleController.class);

	@Autowired
	FacturaDetalleBusiness facturaDetalleBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<FacturaDetalleRest>> findAll() {

		Collection<FacturaDetalleRest> response = FacturaDetalleAdapter.toRest(facturaDetalleBusiness.findAll());

		return new ResponseEntity<Collection<FacturaDetalleRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<FacturaDetalleRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<FacturaDetalleRest>>(Collections.emptyList(), HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findDetailsByNroFactura")
	public ResponseEntity<Collection<FacturaDetalleRest>> findDetailsByNroFactura(@RequestBody(required = false) String pNroFactura) {

		Collection<FacturaDetalleRest> response = FacturaDetalleAdapter.toRest(facturaDetalleBusiness.getDetallesByCodigoFactura(pNroFactura));

		return new ResponseEntity<Collection<FacturaDetalleRest>>(response, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findById")
	public ResponseEntity<FacturaDetalleRest> find(@RequestBody Integer id) {

		FacturaDetalleRest facturaDetalle = FacturaDetalleAdapter.toRest(facturaDetalleBusiness.find(id));

		return new ResponseEntity<FacturaDetalleRest>(facturaDetalle, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<FacturaDetalleRest> save(@RequestBody FacturaDetalleRest facturaDetalle) {

		FacturaDetalle temp = facturaDetalleBusiness.save(FacturaDetalleAdapter.toCore(facturaDetalle));

		facturaDetalle = FacturaDetalleAdapter.toRest(temp);

		return new ResponseEntity<FacturaDetalleRest>(facturaDetalle, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/saveList")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<Collection<FacturaDetalleRest>> saveList(@RequestBody Collection<FacturaDetalleRest> detailsList) {

		facturaDetalleBusiness.saveList(FacturaDetalleAdapter.toCoreListRest(detailsList));
		
		return new ResponseEntity<Collection<FacturaDetalleRest>>(detailsList, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody FacturaDetalleRest facturaDetalle) {

		facturaDetalleBusiness.delete(FacturaDetalleAdapter.toCore(facturaDetalle));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}