package jesusfc.springframework.spring5WebApp.repositories;

import jesusfc.springframework.spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
