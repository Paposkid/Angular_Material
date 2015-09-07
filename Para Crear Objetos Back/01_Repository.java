import java.util.Collection;

import co.com.cursoangular.domain.repository.GenericRepository;
import co.com.cursoangular.infrastructure.persistence.entities.XXXXXXXEntity;

public interface XXXXXXXRepository extends GenericRepository<XXXXXXXEntity> {

	Collection<XXXXXXXEntity> findByName(String query);

	XXXXXXXEntity findByDocumento(Long documento);
}
