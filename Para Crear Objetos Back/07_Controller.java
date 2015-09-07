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



@Controller
@RequestMapping("YYYYYYY")
public class XXXXXXXController {
	static final Logger logger = LogManager.getLogger(XXXXXXXController.class);

	@Autowired
	XXXXXXXBusiness YYYYYYYBusiness;

	
	@RequestMapping(method = RequestMethod.POST, value = "/findAll")
	public ResponseEntity<Collection<XXXXXXXRest>> findAll() {

		Collection<XXXXXXXRest> response = XXXXXXXAdapter.toRest(YYYYYYYBusiness.findAll());

		return new ResponseEntity<Collection<XXXXXXXRest>>(response, HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findRange")
	public ResponseEntity<Collection<XXXXXXXRest>> findRange(int ini, int fin) {

		return new ResponseEntity<Collection<XXXXXXXRest>>(Collections.emptyList(), HttpStatus.CREATED);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/findByDocumento")
	public ResponseEntity<XXXXXXXRest> findByDocumento(@RequestBody(required = false) String nroDcto) {

		XXXXXXXRest response = XXXXXXXAdapter.toRest(YYYYYYYBusiness.findByDocumento(nroDcto));

		return new ResponseEntity<XXXXXXXRest>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findByName")
	public ResponseEntity<Collection<XXXXXXXRest>> findByName(@RequestBody String pName) {

		Collection<XXXXXXXRest> response = XXXXXXXAdapter.toRest(YYYYYYYBusiness.findByName(pName));

		return new ResponseEntity<Collection<XXXXXXXRest>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/findById")
	public ResponseEntity<XXXXXXXRest> find(@RequestBody Integer id) {

		XXXXXXXRest YYYYYYY = XXXXXXXAdapter.toRest(YYYYYYYBusiness.find(id));

		return new ResponseEntity<XXXXXXXRest>(YYYYYYY, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@ResponseBody
	public ResponseEntity<XXXXXXXRest> save(@RequestBody XXXXXXXRest YYYYYYY) {

		XXXXXXX temp = YYYYYYYBusiness.save(XXXXXXXAdapter.toCore(YYYYYYY));

		YYYYYYY = XXXXXXXAdapter.toRest(temp);

		return new ResponseEntity<XXXXXXXRest>(YYYYYYY, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public ResponseEntity<Void> delete(@RequestBody XXXXXXXRest YYYYYYY) {

		YYYYYYYBusiness.delete(XXXXXXXAdapter.toCore(YYYYYYY));

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}