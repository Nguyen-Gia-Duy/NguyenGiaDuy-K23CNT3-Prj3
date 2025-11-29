package NguyenGiaDuy.ToyStore.repository;

import NguyenGiaDuy.ToyStore.model.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Long> {
}