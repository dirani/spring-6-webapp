package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
