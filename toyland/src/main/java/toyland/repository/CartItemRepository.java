package toyland.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyland.entity.CartItem;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {}
