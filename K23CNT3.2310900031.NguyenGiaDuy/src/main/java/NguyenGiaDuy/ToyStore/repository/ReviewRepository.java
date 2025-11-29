package NguyenGiaDuy.ToyStore.repository;

import NguyenGiaDuy.ToyStore.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByToyId(Long toyId);
}