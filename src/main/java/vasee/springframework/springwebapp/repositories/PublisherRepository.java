package vasee.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vasee.springframework.springwebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
