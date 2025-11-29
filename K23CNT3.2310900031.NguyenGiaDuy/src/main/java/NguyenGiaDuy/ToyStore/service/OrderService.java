package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.repository.OrderRepository;
import NguyenGiaDuy.ToyStore.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Order> findAll() {
        return repo.findAll();
    }

    public Order findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Order save(Order order) {
        return repo.save(order);
    }

    // Dành cho User xem đơn hàng của mình
    public List<Order> getOrdersForUser(Long userId) {
        return repo.findByUserId(userId);
    }
}

