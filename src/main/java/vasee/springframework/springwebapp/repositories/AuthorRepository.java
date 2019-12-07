package vasee.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vasee.springframework.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}
