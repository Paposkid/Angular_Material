

public interface XXXXXXXBusiness extends GenericBusiness<XXXXXXX> {

	
	XXXXXXX findByDocumento(String nroDcto);

	Collection<XXXXXXX> findByName(String query);
	
	
}
