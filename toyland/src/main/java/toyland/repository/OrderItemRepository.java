package toyland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyland.entity.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
