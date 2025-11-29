package toyland.service;


import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toyland.entity.*;
import toyland.repository.*;
@Data
@Service
public class CartService {

    @Autowired private UserRepository userRepository;
    @Autowired private ProductRepository productRepository;
    @Autowired private CartItemRepository cartItemRepo;

    public void addToCart(String username, Long productId, int quantity) {

        User user = userRepository.findByUsername(username);

        // Nếu user chưa có cart => tạo mới
        if (user.getCart() == null) {
            Cart cart = new Cart();
            cart.setUser(user);
            user.setCart(cart);
            userRepository.save(user);
        }

        Cart cart = user.getCart();

        Product product = productRepository.findById(productId).orElse(null);
        if (product == null) return;

        // Kiểm tra item đã tồn tại chưa
        CartItem item = cart.getItems().stream()
                .filter(i -> i.getProduct().getId().equals(productId))
                .findFirst()
                .orElse(null);

        if (item != null) {
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            item = new CartItem();
            item.setProduct(product);
            item.setQuantity(quantity);
            cart.addItem(item);
        }

        userRepository.save(user);
    }
}
