package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.repository.OrderItemRepository;
import NguyenGiaDuy.ToyStore.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderItemService {

    private final OrderItemRepository repo;

    public OrderItemService(OrderItemRepository repo) {
        this.repo = repo;
    }

    public List<OrderItem> findAll() {
        return repo.findAll();
    }

    public OrderItem findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public OrderItem save(OrderItem item) {
        return repo.save(item);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

