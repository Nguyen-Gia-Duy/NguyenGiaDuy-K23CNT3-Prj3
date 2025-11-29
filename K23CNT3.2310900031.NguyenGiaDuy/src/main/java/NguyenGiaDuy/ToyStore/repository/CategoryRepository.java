package NguyenGiaDuy.ToyStore.repository;

import NguyenGiaDuy.ToyStore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
