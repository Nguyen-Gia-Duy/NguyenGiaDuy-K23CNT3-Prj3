package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.repository.UserRepository;
import NguyenGiaDuy.ToyStore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User save(User user) {
        return repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }
}

