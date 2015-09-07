
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class XXXXXXXRest implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Seccion para los atributos */

	
	public XXXXXXXRest() {
		
	}



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof XXXXXXXRest)) {
			return false;
		}
		
		XXXXXXXRest other = (XXXXXXXRest) object;
		if ((this.codigo == null && other.codigo != null)
				|| (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}
	
	/* Generar metodo toString */
	
}
