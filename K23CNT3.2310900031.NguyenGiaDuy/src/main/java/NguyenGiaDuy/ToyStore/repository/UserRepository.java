package NguyenGiaDuy.ToyStore.repository;

import NguyenGiaDuy.ToyStore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}