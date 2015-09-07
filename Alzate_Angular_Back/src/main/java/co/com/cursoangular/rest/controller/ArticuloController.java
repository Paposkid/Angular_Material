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

import co.com.cursoangular.application.adapter.converter.ArticuloAdapter;
import co.com.cursoangular.application.port.ArticuloBusiness;
import co.com.cursoangular.domain.entities.Articulo;
import co.com.cursoangular.rest.entities.ArticuloRest;



@Controller
@RequestMapping("articulo")
public class ArticuloController {
	static final Logger logger = LogManager.getLogger(ArticuloController.class);

	@Autowired
	ArticuloBusiness articuloBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<ArticuloRest>> findAll() {

		Collection<ArticuloRest> response = ArticuloAdapter.toRest(articuloBusiness.findAll());

		return new ResponseEntity<Collection<ArticuloRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<ArticuloRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<ArticuloRest>>(java.util.Collections.emptyList(), HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<ArticuloRest>> findByName(@RequestBody String pName) {

		Collection<ArticuloRest> response = ArticuloAdapter.toRest(articuloBusiness.findByName(pName));

		return new ResponseEntity<Collection<ArticuloRest>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/find")
	public ResponseEntity<ArticuloRest> find(@RequestBody Integer id) {

		ArticuloRest articulo = ArticuloAdapter.toRest(articuloBusiness.find(id));

		return new ResponseEntity<ArticuloRest>(articulo, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<ArticuloRest> save(@RequestBody ArticuloRest articulo) {

		Articulo temp = articuloBusiness.save(ArticuloAdapter.toCore(articulo));

		articulo = ArticuloAdapter.toRest(temp);

		return new ResponseEntity<ArticuloRest>(articulo, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody ArticuloRest articulo) {

		articuloBusiness.delete(ArticuloAdapter.toCore(articulo));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}