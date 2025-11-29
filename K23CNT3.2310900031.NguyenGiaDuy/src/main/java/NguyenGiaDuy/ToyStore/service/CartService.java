package NguyenGiaDuy.ToyStore.service;
import NguyenGiaDuy.ToyStore.model.Toy;
import NguyenGiaDuy.ToyStore.model.User;
import NguyenGiaDuy.ToyStore.model.CartItem;
import NguyenGiaDuy.ToyStore.repository.CartItemRepository;
import NguyenGiaDuy.ToyStore.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CartService {

    private final CartItemRepository repo;
    private final UserService userService;
    private final ToyService toyService;

    public CartService(CartItemRepository repo, UserService userService, ToyService toyService) {
        this.repo = repo;
        this.userService = userService;
        this.toyService = toyService;
    }

    public List<CartItem> listItems(Long userId) {
        return repo.findByUserId(userId);
    }

    public CartItem addItem(Long userId, Long toyId, int quantity) {
        Toy toy = toyService.findById(toyId);
        User user = userService.findById(userId);

        CartItem item = new CartItem();
        item.setToy(toy);
        item.setUser(user);
        item.setQuantity(quantity);

        return repo.save(item);
    }

    public CartItem updateItem(Long itemId, int qty) {
        CartItem item = repo.findById(itemId).orElse(null);
        item.setQuantity(qty);
        return repo.save(item);
    }

    public void deleteItem(Long id) {
        repo.deleteById(id);
    }
}

