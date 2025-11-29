package NguyenGiaDuy.ToyStore.repository;

import NguyenGiaDuy.ToyStore.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
