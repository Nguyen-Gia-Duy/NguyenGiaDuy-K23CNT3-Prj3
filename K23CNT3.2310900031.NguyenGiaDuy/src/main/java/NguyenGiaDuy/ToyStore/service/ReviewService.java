package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.repository.ReviewRepository;
import NguyenGiaDuy.ToyStore.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ReviewService {

    private final ReviewRepository repo;

    public ReviewService(ReviewRepository repo) {
        this.repo = repo;
    }

    public List<Review> findAll() {
        return repo.findAll();
    }

    public Review save(Review review) {
        return repo.save(review);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Review> findByToy(Long toyId) {
        return repo.findByToyId(toyId);
    }
}

