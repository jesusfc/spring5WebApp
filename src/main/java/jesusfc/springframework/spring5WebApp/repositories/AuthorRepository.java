package jesusfc.springframework.spring5WebApp.repositories;

import jesusfc.springframework.spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
