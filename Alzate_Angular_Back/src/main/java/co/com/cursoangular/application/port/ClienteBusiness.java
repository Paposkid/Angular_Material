package co.com.cursoangular.application.port;

import co.com.cursoangular.domain.entities.Cliente;


public interface ClienteBusiness extends GenericBusiness<Cliente> {

	
	Cliente findByDocumento(String pTipoDcto, String pNroDcto);


}
