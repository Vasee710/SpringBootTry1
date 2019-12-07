package vasee.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vasee.springframework.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
