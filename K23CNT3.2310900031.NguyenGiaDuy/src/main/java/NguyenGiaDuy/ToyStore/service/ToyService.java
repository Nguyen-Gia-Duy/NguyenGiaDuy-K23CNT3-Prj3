package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.repository.ToyRepository;
import NguyenGiaDuy.ToyStore.model.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ToyService {

    private final ToyRepository repo;

    public ToyService(ToyRepository repo) {
        this.repo = repo;
    }

    public List<Toy> findAll() {
        return repo.findAll();
    }

    public Toy findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Toy save(Toy toy) {
        return repo.save(toy);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

