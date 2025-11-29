package toyland.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyland.entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {}
