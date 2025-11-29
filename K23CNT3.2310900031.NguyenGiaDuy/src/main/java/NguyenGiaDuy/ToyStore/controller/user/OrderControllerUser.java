package NguyenGiaDuy.ToyStore.controller.user;
import NguyenGiaDuy.ToyStore.model.Order;

import NguyenGiaDuy.ToyStore.service.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/orders")
public class OrderControllerUser {

    private final OrderService service;

    public OrderControllerUser(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> myOrders(@RequestParam Long userId) {
        return service.getOrdersForUser(userId);
    }

}

