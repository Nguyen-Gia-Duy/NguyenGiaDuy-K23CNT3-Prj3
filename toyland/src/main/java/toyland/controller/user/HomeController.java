package toyland.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import toyland.entity.Cart;
import toyland.entity.User;
import toyland.repository.UserRepository;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(@AuthenticationPrincipal UserDetails userDetails, Model model) {

        if (userDetails == null) {
            return "redirect:/login";
        }

        String username = userDetails.getUsername();
        User user = userRepository.findByUsername(username);

        if (user == null) {
            return "redirect:/login";
        }

        // ⭐ Tạo giỏ hàng nếu chưa có
        if (user.getCart() == null) {
            Cart cart = new Cart();
            cart.setUser(user);
            user.setCart(cart);
            userRepository.save(user);
        }

        model.addAttribute("user", user);
        model.addAttribute("cart", user.getCart());
        model.addAttribute("orders", user.getOrders());
        model.addAttribute("reviews", user.getReviews());

        return "homepage";
    }
}
