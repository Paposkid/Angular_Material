package co.com.cursoangular.rest.controller;

import java.util.Arrays;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.com.cursoangular.rest.entities.MenuRest;

@Controller
@RequestMapping("/rest/menu")
public class MenuController {
	static final Logger logger = LogManager.getLogger(MenuController.class);

	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<MenuRest>> tipos() {

		Collection<MenuRest> response = Arrays.asList(
				new MenuRest("Factura", "1", "factura"),
				new MenuRest("Terceros", "2", "tercero")
				);

		return new ResponseEntity<Collection<MenuRest>>(response, HttpStatus.OK);
	}
}