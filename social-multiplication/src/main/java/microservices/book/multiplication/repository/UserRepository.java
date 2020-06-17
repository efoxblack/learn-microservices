package microservices.book.multiplication.repository;

import microservices.book.multiplication.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * This interface allows us to save and retrieve Users
 */
public interface UserRepository extends CrudRepository<User, Long> {
    /**
     *
     * @param alias the alias the end-user chooses to go by
     * @return an optional of type user and their resulting data based off their alias
     */
    Optional<User> findByAlias(final String alias);

}
