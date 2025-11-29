package NguyenGiaDuy.ToyStore.controller.user;
import NguyenGiaDuy.ToyStore.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import NguyenGiaDuy.ToyStore.service.CartService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/cart")

public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }
    @Autowired
    private CartService cartService;
    @PostMapping("/add")
    public CartItem add(@RequestParam Long userId,
                        @RequestParam Long toyId,
                        @RequestParam int quantity) {
        return cartService.addItem(userId, toyId, quantity);
    }


    @GetMapping
    public List<CartItem> getCart(@RequestParam Long userId) {
        return service.listItems(userId);
    }


    @PutMapping("/update")
    public CartItem update(@RequestParam Long itemId, @RequestParam int qty) {
        return service.updateItem(itemId, qty);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        service.deleteItem(id);
    }
}
