package toyland.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/orders")
public class AdminOrderController {

    // Danh sách đơn hàng
    @GetMapping
    public String list(Model model) {
        // model.addAttribute("orders", orderService.findAll());
        return "admin/orders";
    }

    // Chi tiết đơn hàng
    @GetMapping("/detail")
    public String detail(Long id, Model model) {
        // model.addAttribute("order", orderService.findById(id));
        return "admin/order-detail";
    }

}
